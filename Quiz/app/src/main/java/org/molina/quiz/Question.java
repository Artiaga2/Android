package org.molina.quiz;

/**
 * Created by Vikin on 05/10/2017.
 */

public class Question {

    private String question;
    private boolean answer;

    //Constructores

    public Question() {
    }

    public Question(String question, boolean answer) {
        this.question = question;
        this.answer = answer;
    }

    //Accesores
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}
