package com.hammam.nat3raf.QuestionsData;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class QuestionsDBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "questions.db";
    private static final int DATABASE_VERSION = 1;

    public QuestionsDBHelper (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        final String SQL_CREATE_QUESTIONS_QUERY = "CREATE TABLE " + QuestionsContract.QuestionsEntry.TABLE_NAME + ("(")
                + QuestionsContract._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + QuestionsContract.QuestionsEntry.COLUMN_QUESTION + " TEXT NOT NULL,"
                + QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES + " TEXT NOT NULL, "
                + QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO + " TEXT NOT NULL" + ");";
        sqLiteDatabase.execSQL(SQL_CREATE_QUESTIONS_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + QuestionsContract.QuestionsEntry.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
