package com.hammam.nat3raf.QuestionsData;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hammam on 8/11/2017.
 */

public class QuestionsDataEntry {

    public static void insertQuestions(SQLiteDatabase db){
        if(db == null){
            return;
        }

        List<ContentValues> list = new ArrayList<>();

        ContentValues cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, "يوجد من الاردوينو نوع واحد فقط وهو الاردوينو ال UNO");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, "لا : يوجد من الأردوينو أنواع كثيره تختلف بإختلاف عدد المداخل والمخارج والمساحه  ومن أنواعه  \n" +
                "Arduino UNO\n" +
                ", Arduino Mega,\n" +
                " Arduino Nano,\n" +
                "    Arduino Mini\n" +
                ", Arduino Lilypad, \n" +
                "Arduino Demulive,\n" +
                " Boarduino");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "إجابة صحيحة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, "الأردوينو ال UNO  يوجد به عدد 14 digital (input/output) pins  منهم 6 يمكن إستغلالهم كمخارج PWM");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, "إجابة صحيحة");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "إجابة خاطئة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, "يفضل إستخدام جهد مع الأردوينو أكبر من ال 12 فولت");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, "لا : يستحسن إستخدام جهد يتراوح بين ال 7 فولت إلى ال 12 فولت");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "إجابة صحيحة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, "يستخدم الأردوينو في مجال الروبوتات فقط ؟ ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, "لا : يستخدم الأردوينو في العديد من المجالات حيث يعطيك الصلاحيات للتحكم بأي شيئ  مثل التحكم بإضائة مصابيح والتحكم فى حركة محرك  ويستخدم في مشاريع  كـ  smart home");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "إجابة صحيحة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, "هل معنى أن الأردوينو مفتوح المصدر أنه مجاني ؟ ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, "لا : ليس هناك علاقه بين كونه مفتوح المصدر وبين كونه مجاني ! ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "إجابة صحيحة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, "لا يمكنك الإطلاع على البنيه الأساسيه للأردوينو ولا التعديل عليها ! ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, "لا : الأردوينو مفتوح المصدر ويمكنك الإطلاع على بنيته الأساسيه بسهوله ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "إجابة صحيحة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, "الاردوينو ال  uno  لا يحتوي على  Analog pins ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, "لا : يحتوي على 6  Analog input pins و يمكن إستخدامهم ك  digital (input/output) ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "إجابة صحيحة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, "دالة ال  void setup  هي الداله التي يتم تحديد إذا كانت ال pins  تعمل كـ input  أو  output  ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, "إجابة صحيحة");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "إجابة خاطئة ");
        list.add(cv);

        cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, "يمكن تحميل البرنامج على الأردوينو  مره واحده فقط ؟ ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, "لا : يمكن تحميل البرامج على الأردوينو لمرات متعدده ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "إجابة صحيحة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, "هل يوجد ما يسمى بالثوابت في برمجة الأردوينو ؟ ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, "إجابة صحيحة");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "لا : يوجد هناك ثوابت ويتم تعريفها قبل دالة ال void setup ");
        list.add(cv);

        cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, "لا يوجد بديل للأردوينو ؟ ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, "لا : يوجد بدائل للأردوينو مثل ال pic   وال  plc   ولكن الأردوينو يتميز بالسهوله  في التعامل ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "إجابة صحيحة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, "للأردوينو حجم ثابت لجميع إصداراته ! ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, "لا : للأردوينو أحجام مختلفه  تختلف بإختلاف إصداراته ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "إجابة صحيحة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, "يتصل الأردوينو بالحاسب عن طريق وصلة ال usb  حتى تتم برمجته ؟ ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, "إجابة صحيحة");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "إجابة خاطئة ");
        list.add(cv);

        cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, "تتم برمجة الأردوينو عن طريق الحاسوب ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, "إجابة صحيحة");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "إجابة خاطئة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, "الفرق بين  إصدارات الاردوينو المختلفه يكون في عدد ال  pins  فقط ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, "لا : بل يوجد اختلاف أيضا في سرعة معالجة البيانات والعديد من الأشياء الأخرى ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "إجابة صحيحة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, "تتميز الأكواد البرمجيه الخاصه بالأردوينو على أنها تتشابه مع لغة ال c++ ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, "إجابة صحيحة");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "إجابة خاطئة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, " لا يمكن تشغيل   Arduino IDE إلا على نظلم التشغيل ويندوز  ؟ ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, "إجابة خاطئة ، يمكن تشغيله على العديد من نظم التشغيل كاللينكس والماك");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "إجابة صحيحة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, "يتكون البرنامج في الأردوينو من دوال  ال  void setup   و    void loopفقط ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, " لا : يمكن ان يحتوى البرنامج في الأردوينو على دوال أخرى ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "إجابة صحيحة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_QUESTION, "يمكنك ال Arduino IDE  من التعامل مع لوحات الأردوينو  ال Uno  وال mega  فقط ؟ ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_YES, "لا : يمكنك أيضا من التعامل مع كافة الأنواع المختلفه , فكل ما عليك هو اختيار نوع اللوحه التي ستتعامل معها من  قائمة   tools   ثم  Board  ثم تختار نوع الأردوينو ");
        cv.put(QuestionsContract.QuestionsEntry.COLUMN_ANSWER_NO, "إجابة صحيحة");
        list.add(cv);

        try {
            db.beginTransaction();
            db.delete (QuestionsContract.QuestionsEntry.TABLE_NAME, null, null);
            for(ContentValues c : list){
                db.insert(QuestionsContract.QuestionsEntry.TABLE_NAME, null, c);
            }
            db.setTransactionSuccessful();
        } catch (SQLException e) {
            //too bad :(
        } finally {
            db.endTransaction();
        }

    }
}
