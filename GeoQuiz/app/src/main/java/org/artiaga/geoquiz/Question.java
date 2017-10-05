package org.artiaga.geoquiz;

/**
 * Created by 2-DAW on 05/10/2017.
 */

public class Question {

    public Question(int questionTextId, boolean answerTrue) {
        mQuestionTextId = questionTextId;
        mAnswerTrue = answerTrue;
    }

    private int mQuestionTextId;
    private boolean mAnswerTrue;

    public int getQuestionTextId() {
        return mQuestionTextId;
    }

    public void setQuestionTextId(int questionTextId) {
        mQuestionTextId = questionTextId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
