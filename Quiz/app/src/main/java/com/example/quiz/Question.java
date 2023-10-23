package com.example.quiz;
public class Question {
    private int questionId;
    private boolean trueAnswer;

    public Question(int questionId, boolean trueAnswer) {
        this.questionId = questionId;
        this.trueAnswer = trueAnswer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setId(int questionId) {
        this.questionId = questionId;
    }

    public boolean isTrue() {
        return trueAnswer;
    }

    public void setTrueAnswer(boolean trueAnswer) {
        this.trueAnswer = trueAnswer;
    }
}