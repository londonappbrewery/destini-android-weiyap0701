package com.londonappbrewery.destini;

/**
 * Created by ongweiyap on 30/09/2017.
 */

public class QuestionAnswer {

    int questionId;
    int answer1;
    int answer2;

    public QuestionAnswer(int questionId, int answer1, int answer2) {
        this.questionId = questionId;
        this.answer1 = answer1;
        this.answer2 = answer2;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getAnswer1() {
        return answer1;
    }

    public void setAnswer1(int answer1) {
        this.answer1 = answer1;
    }

    public int getAnswer2() {
        return answer2;
    }

    public void setAnswer2(int answer2) {
        this.answer2 = answer2;
    }
}
