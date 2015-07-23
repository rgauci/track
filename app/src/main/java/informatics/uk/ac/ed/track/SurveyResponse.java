package informatics.uk.ac.ed.track;

import android.content.ContentValues;

public class SurveyResponse {

    private int rowId;
    private String notificationTimeIso;
    private String surveyCompletedTimeIso;
    private boolean synced;
    private ContentValues questionAnswers;

    public void setRowId(int value) {
        this.rowId = value;
    }

    public void setNotificationTimeIso(String value) {
        this.notificationTimeIso = value;
    }

    public void setSurveyCompletedTimeIso(String value) {
        this.surveyCompletedTimeIso = value;
    }

    public void setSynced(boolean value) {
        this.synced = value;
    }

    public void setQuestionAnswers(ContentValues values) {
        this.questionAnswers = values;
    }
}