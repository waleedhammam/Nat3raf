package com.hammam.nat3raf.QuestionsData;

import android.provider.BaseColumns;

public class QuestionsContract implements BaseColumns {

    public static final class QuestionsEntry {
        public static final String TABLE_NAME = "questions";
        public static final String COLUMN_QUESTION = "questionName";
        public static final String COLUMN_ANSWER_YES = "questionAnswerYes";
        public static final String COLUMN_ANSWER_NO = "questionAnswerNo";
    }
}
