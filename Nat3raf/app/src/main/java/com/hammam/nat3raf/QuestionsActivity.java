package com.hammam.nat3raf;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.SensorManager;
import android.os.Vibrator;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.hammam.nat3raf.QuestionsData.QuestionsContract;
import com.hammam.nat3raf.QuestionsData.QuestionsDBHelper;
import com.hammam.nat3raf.QuestionsData.QuestionsDataEntry;
import com.squareup.seismic.ShakeDetector;

public class QuestionsActivity extends AppCompatActivity
                            implements ShakeDetector.Listener{

    private SQLiteDatabase mDB;
    private Cursor cursor;
    private boolean flag = true;
    private Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        ShakeDetector sd = new ShakeDetector(this);
        sd.start(sensorManager);

        QuestionsDBHelper dbHelper = new QuestionsDBHelper(this);

        mDB = dbHelper.getWritableDatabase();

        QuestionsDataEntry.insertQuestions(mDB);

        cursor = getAllQuestions();
        vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
    }

    private Cursor getAllQuestions() {
        String sortBy = "RANDOM()";
        return mDB.query(QuestionsContract.QuestionsEntry.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                sortBy);

    }

    public void hearShake() {
        if (!this.isFinishing() && flag) {
            logData(cursor);
        }
    }

    private void logData (Cursor cursor) {
        flag = false;
        if (!cursor.moveToNext()) {
            new AlertDialog.Builder(this)
                    .setTitle("نَتَعرّف")
                    .setMessage("انتهت الأسئلة")
                    .setNeutralButton("موافق",null)
                    .setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public void onDismiss(DialogInterface dialog) {
                            flag = true;
                        }
                    })
                    .setIcon(R.mipmap.ic_launcher)
                    .show();
            return;
        }

        String name = cursor.getString(cursor.getColumnIndex(QuestionsContract.QuestionsEntry.COLUMN_QUESTION));
        final String answerYes = cursor.getString(cursor.getColumnIndex(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES));
        final String answerNo = cursor.getString(cursor.getColumnIndex(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO));
        vibrator.vibrate(70);
        new AlertDialog.Builder(this)
                .setTitle("أسئلة")
                .setMessage(name)
                .setNeutralButton("نعم", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        reply(answerYes);
                    }
                })
                .setNegativeButton("لا", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        reply(answerNo);
                    }
                })
                .setIcon(R.mipmap.ic_launcher)
                .setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialog) {
                        flag = true;
                    }
                })
                .show();

        cursor.moveToNext();
    }

    private void reply(String result) {
        new AlertDialog.Builder(this)
                .setTitle("أسئلة")
                .setMessage(result)
                .setNeutralButton("موافق", null)
                .setIcon(R.mipmap.ic_launcher)
                .setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialog) {
                        flag = true;
                    }
                })
                .show();
        flag = true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
