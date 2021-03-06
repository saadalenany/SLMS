/*
 * This file is generated by jOOQ.
 */
package lecturemanagementdoctor.doctor.Database.doctordb.generated;


import javax.annotation.Generated;

import lecturemanagementdoctor.doctor.Database.doctordb.generated.tables.Absence;
import lecturemanagementdoctor.doctor.Database.doctordb.generated.tables.Choicedata;
import lecturemanagementdoctor.doctor.Database.doctordb.generated.tables.Lecture;
import lecturemanagementdoctor.doctor.Database.doctordb.generated.tables.Quiz;
import lecturemanagementdoctor.doctor.Database.doctordb.generated.tables.Quizquestion;
import lecturemanagementdoctor.doctor.Database.doctordb.generated.tables.Slide;
import lecturemanagementdoctor.doctor.Database.doctordb.generated.tables.Student;
import lecturemanagementdoctor.doctor.Database.doctordb.generated.tables.Studentdegrees;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>lecturedb</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ABSENCE_ABSENCE_FK0 = Indexes0.ABSENCE_ABSENCE_FK0;
    public static final Index ABSENCE_ABSENCE_FK1 = Indexes0.ABSENCE_ABSENCE_FK1;
    public static final Index CHOICEDATA_CHOICEDATA_FK0 = Indexes0.CHOICEDATA_CHOICEDATA_FK0;
    public static final Index CHOICEDATA_PRIMARY = Indexes0.CHOICEDATA_PRIMARY;
    public static final Index LECTURE_PRIMARY = Indexes0.LECTURE_PRIMARY;
    public static final Index QUIZ_PRIMARY = Indexes0.QUIZ_PRIMARY;
    public static final Index QUIZQUESTION_PRIMARY = Indexes0.QUIZQUESTION_PRIMARY;
    public static final Index QUIZQUESTION_QUIZQUESTION_FK0 = Indexes0.QUIZQUESTION_QUIZQUESTION_FK0;
    public static final Index SLIDE_PRIMARY = Indexes0.SLIDE_PRIMARY;
    public static final Index SLIDE_SLIDE_FK0 = Indexes0.SLIDE_SLIDE_FK0;
    public static final Index STUDENT_PRIMARY = Indexes0.STUDENT_PRIMARY;
    public static final Index STUDENTDEGREES_STUDENTDEGREES_FK0 = Indexes0.STUDENTDEGREES_STUDENTDEGREES_FK0;
    public static final Index STUDENTDEGREES_STUDENTDEGREES_FK1 = Indexes0.STUDENTDEGREES_STUDENTDEGREES_FK1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index ABSENCE_ABSENCE_FK0 = Internal.createIndex("Absence_fk0", Absence.ABSENCE, new OrderField[] { Absence.ABSENCE.STUDENT_ID }, false);
        public static Index ABSENCE_ABSENCE_FK1 = Internal.createIndex("Absence_fk1", Absence.ABSENCE, new OrderField[] { Absence.ABSENCE.LECTURE_ID }, false);
        public static Index CHOICEDATA_CHOICEDATA_FK0 = Internal.createIndex("ChoiceData_fk0", Choicedata.CHOICEDATA, new OrderField[] { Choicedata.CHOICEDATA.QUESTION_ID }, false);
        public static Index CHOICEDATA_PRIMARY = Internal.createIndex("PRIMARY", Choicedata.CHOICEDATA, new OrderField[] { Choicedata.CHOICEDATA.CHOICE_ID }, true);
        public static Index LECTURE_PRIMARY = Internal.createIndex("PRIMARY", Lecture.LECTURE, new OrderField[] { Lecture.LECTURE.LECTURE_ID }, true);
        public static Index QUIZ_PRIMARY = Internal.createIndex("PRIMARY", Quiz.QUIZ, new OrderField[] { Quiz.QUIZ.QUIZ_ID }, true);
        public static Index QUIZQUESTION_PRIMARY = Internal.createIndex("PRIMARY", Quizquestion.QUIZQUESTION, new OrderField[] { Quizquestion.QUIZQUESTION.QUESTION_ID }, true);
        public static Index QUIZQUESTION_QUIZQUESTION_FK0 = Internal.createIndex("QuizQuestion_fk0", Quizquestion.QUIZQUESTION, new OrderField[] { Quizquestion.QUIZQUESTION.QUIZ_ID }, false);
        public static Index SLIDE_PRIMARY = Internal.createIndex("PRIMARY", Slide.SLIDE, new OrderField[] { Slide.SLIDE.SLIDE_ID }, true);
        public static Index SLIDE_SLIDE_FK0 = Internal.createIndex("Slide_fk0", Slide.SLIDE, new OrderField[] { Slide.SLIDE.LECTURE_ID }, false);
        public static Index STUDENT_PRIMARY = Internal.createIndex("PRIMARY", Student.STUDENT, new OrderField[] { Student.STUDENT.STUDENT_ID }, true);
        public static Index STUDENTDEGREES_STUDENTDEGREES_FK0 = Internal.createIndex("StudentDegrees_fk0", Studentdegrees.STUDENTDEGREES, new OrderField[] { Studentdegrees.STUDENTDEGREES.STUDENT_ID }, false);
        public static Index STUDENTDEGREES_STUDENTDEGREES_FK1 = Internal.createIndex("StudentDegrees_fk1", Studentdegrees.STUDENTDEGREES, new OrderField[] { Studentdegrees.STUDENTDEGREES.QUIZ_ID }, false);
    }
}
