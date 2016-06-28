/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan_jeopardy;

/**
 *
 * @author arvinkumar
 */
public class Question {

    private boolean dailyDouble;
    private boolean read;
    private int value;
    private String question;
    private String[] options = new String[4];
    private String rightAnswer;
    private String category;

    /**
     *
     * @return
     */
    public boolean isDailyDouble() {
        return dailyDouble;
    }

    /**
     *
     * @return
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     *
     * @param dailyDouble
     */
    public void setDailyDouble(boolean dailyDouble) {
        this.dailyDouble = dailyDouble;
    }

    /**
     *
     * @return
     */
    public boolean isRead() {
        return read;
    }

    /**
     *
     * @param read
     */
    public void setRead(boolean read) {
        this.read = read;
    }

    /**
     *
     * @return
     */
    public int getValue() {
        return value;
    }

    /**
     *
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     *
     * @return
     */
    public String getQuestion() {
        return question;
    }

    /**
     *
     * @param question
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     *
     * @return
     */
    public String[] getOptions() {
        return options;
    }

    /**
     *
     * @param options
     */
    public void setOptions(String[] options) {
        this.options = options;
    }

    /**
     *
     * @return
     */
    public String getRightAnswer() {
        return rightAnswer;
    }

    /**
     *
     * @param rightAnswer
     */
    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

}
