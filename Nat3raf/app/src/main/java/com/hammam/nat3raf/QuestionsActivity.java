package com.hammam.nat3raf;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.hammam.nat3raf.QuestionsData.QuestionsContract;
import com.hammam.nat3raf.QuestionsData.QuestionsDBHelper;
import com.hammam.nat3raf.QuestionsData.QuestionsDataEntry;

public class QuestionsActivity extends AppCompatActivity {

    private SQLiteDatabase mDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        QuestionsDBHelper dbHelper = new QuestionsDBHelper(this);

        mDB = dbHelper.getWritableDatabase();

        QuestionsDataEntry.insertQuestions(mDB);

        Cursor cursor = getAllQuestions();

        logData(cursor);
    }

    private Cursor getAllQuestions() {
        return mDB.query(QuestionsContract.QuestionsEntry.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                null);
    }

    private void logData (Cursor cursor) {
        int count = cursor.getCount();

        for (int i = 0; i < count; i++) {

            if (!cursor.moveToPosition(i))
                return;

            String name = cursor.getString(cursor.getColumnIndex(QuestionsContract.QuestionsEntry.COLUMN_QUESTION));
            String answerYes = cursor.getString(cursor.getColumnIndex(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES));
            String answerNo = cursor.getString(cursor.getColumnIndex(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO));

            Log.i("Question: ", name);
            Log.i("Answer Yes: ", answerYes );
            Log.i("Answer No: ", answerNo);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
