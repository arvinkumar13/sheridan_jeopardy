/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan_jeopardy;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.*;

/**
 *
 * @author arvinkumar
 */
public class GamePlayController implements Initializable {
//questionsAnswered keeps the count of questions read,amount saves the winnings,questions saves the questions read from the file

    static int questionsAnswered;
    static int amount;
    static ArrayList<Question> questions = new ArrayList<Question>();
    @FXML
    private Label welcome;
    @FXML
    private Label questionsRead;
    @FXML
    private Label category1;
    @FXML
    private Label category2;
    @FXML
    private Label category3;
    @FXML
    private Label category4;
    @FXML
    private Label category5;
    @FXML
    private Label winnings;
    @FXML
    private GridPane table;
    @FXML
    private Button getResult;
    @FXML
    private Button que1cat1;
    @FXML
    private Button que2cat1;
    @FXML
    private Button que3cat1;
    @FXML
    private Button que4cat1;
    @FXML
    private Button que5cat1;
    @FXML
    private Button que1cat2;
    @FXML
    private Button que2cat2;
    @FXML
    private Button que3cat2;
    @FXML
    private Button que4cat2;
    @FXML
    private Button que5cat2;
    @FXML
    private Button que1cat3;
    @FXML
    private Button que2cat3;
    @FXML
    private Button que3cat3;
    @FXML
    private Button que4cat3;
    @FXML
    private Button que5cat3;
    @FXML
    private Button que1cat4;
    @FXML
    private Button que2cat4;
    @FXML
    private Button que3cat4;
    @FXML
    private Button que4cat4;
    @FXML
    private Button que5cat4;
    @FXML
    private Button que1cat5;
    @FXML
    private Button que2cat5;
    @FXML
    private Button que3cat5;
    @FXML
    private Button que4cat5;
    @FXML
    private Button que5cat5;

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion1() {
        que1cat1.setStyle(que1cat1.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(1);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion2() {
        que2cat1.setStyle(que2cat1.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(2);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion3() {
        que3cat1.setStyle(que3cat1.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(3);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion4() {
        que4cat1.setStyle(que4cat1.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(4);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion5() {
        que5cat1.setStyle(que5cat1.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(5);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion6() {
        que1cat2.setStyle(que1cat2.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(6);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion7() {
        que2cat2.setStyle(que2cat2.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(7);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion8() {
        que3cat2.setStyle(que3cat2.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(8);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion9() {
        que4cat2.setStyle(que4cat2.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(9);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion10() {
        que5cat2.setStyle(que5cat2.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(10);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion11() {
        que1cat3.setStyle(que1cat3.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(11);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion12() {
        que2cat3.setStyle(que2cat3.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(12);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion13() {
        que3cat3.setStyle(que3cat3.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(13);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion14() {
        que4cat3.setStyle(que4cat3.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(14);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion15() {
        que5cat3.setStyle(que5cat3.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(15);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion16() {
        que1cat4.setStyle(que1cat4.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(16);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion17() {
        que2cat4.setStyle(que2cat4.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(17);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion18() {
        que3cat4.setStyle(que3cat4.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(18);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion19() {
        que4cat4.setStyle(que4cat4.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(19);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion20() {
        que5cat4.setStyle(que5cat4.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(20);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion21() {
        que1cat5.setStyle(que1cat5.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(21);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion22() {
        que2cat5.setStyle(que2cat5.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(22);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion23() {
        que3cat5.setStyle(que3cat5.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(23);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion24() {
        que4cat5.setStyle(que4cat5.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(24);
    }

    /**
     * calls displayQestion method for this question
     */
    public void getQuestion25() {
        que5cat5.setStyle(que5cat5.getStyle() + "-fx-background-image: url('/images/dollarRed.png');");
        displayQuestion(25);
    }

    /**
     * this method is to display the welcome note with the user's name to the
     * user,set the buttons text with their value and open results page when all
     * questions have been read
     */
    public void welcomeUser() {
        questionsAnswered = 0;
        for (int i = 0; i < 25; i++) {
            if (GamePlayController.questions.get(i).isRead()) {
                questionsAnswered++;
            }
        }
        if (questionsAnswered == 25) {
            Sheridan_Jeopardy.showWin();
        }
        questionsRead.setText(questionsAnswered + " questions read out of 25");
        winnings.setText("winnings: $" + amount);
        welcome.setText("welcome " + UserName.name);
        que1cat1.setText("$" + questions.get(0).getValue());
        que2cat1.setText("$" + questions.get(1).getValue());
        que3cat1.setText("$" + questions.get(2).getValue());
        que4cat1.setText("$" + questions.get(3).getValue());
        que5cat1.setText("$" + questions.get(4).getValue());
        que1cat2.setText("$" + questions.get(5).getValue());
        que2cat2.setText("$" + questions.get(6).getValue());
        que3cat2.setText("$" + questions.get(7).getValue());
        que4cat2.setText("$" + questions.get(8).getValue());
        que5cat2.setText("$" + questions.get(9).getValue());
        que1cat3.setText("$" + questions.get(10).getValue());
        que2cat3.setText("$" + questions.get(11).getValue());
        que3cat3.setText("$" + questions.get(12).getValue());
        que4cat3.setText("$" + questions.get(13).getValue());
        que5cat3.setText("$" + questions.get(14).getValue());
        que1cat4.setText("$" + questions.get(15).getValue());
        que2cat4.setText("$" + questions.get(16).getValue());
        que3cat4.setText("$" + questions.get(17).getValue());
        que4cat4.setText("$" + questions.get(18).getValue());
        que5cat4.setText("$" + questions.get(19).getValue());
        que1cat5.setText("$" + questions.get(20).getValue());
        que2cat5.setText("$" + questions.get(21).getValue());
        que3cat5.setText("$" + questions.get(22).getValue());
        que4cat5.setText("$" + questions.get(23).getValue());
        que5cat5.setText("$" + questions.get(24).getValue());
        category1.setText(questions.get(0).getCategory());
        category2.setText(questions.get(5).getCategory());
        category3.setText(questions.get(10).getCategory());
        category4.setText(questions.get(15).getCategory());
        category5.setText(questions.get(20).getCategory());
    }

    /**
     * this method will display the desired question from the questions
     * arraylist,it will also check that the question has not been opened
     * before.
     *
     * @param questionNo
     */
    public void displayQuestion(int questionNo) {
        questionNo = questionNo - 1;
        UserName.questionNum = questionNo;
        if (questions.get(questionNo).isDailyDouble() && questions.get(questionNo).isRead() == false) {
            Sheridan_Jeopardy.showDailyDouble();
        } else {
            Sheridan_Jeopardy.showQuestion();
        }
    }

    /**
     * this will open the results window if user wants to quit
     */
    public void displayResult() {
        Sheridan_Jeopardy.showWin();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
//reading data from the file
        try {
            File file = new File("questions.txt");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fr = new FileReader(file.getAbsoluteFile());
            BufferedReader br = new BufferedReader(fr);
            String s;
            while ((s = br.readLine()) != null) {
                String[] tokens = s.split("::");
                if (tokens.length == 8) {
                    Question ques = new Question();
                    ques.setQuestion(tokens[0]);
                    String[] options = {tokens[1], tokens[2], tokens[3], tokens[4]};
                    ques.setOptions(options);
                    ques.setRightAnswer(tokens[5]);
                    ques.setValue(Integer.parseInt(tokens[6]));
                    ques.setCategory(tokens[7]);
                    questions.add(ques);
                }
            }
            int firstDailyDouble = (int) (Math.random() * 25) + 1;
            int secondDailyDouble = (int) (Math.random() * 25) + 1;
            if (firstDailyDouble == secondDailyDouble) {
                while (firstDailyDouble == secondDailyDouble) {
                    secondDailyDouble = (int) (Math.random() * 25) + 1;
                }
            }
            questions.get(firstDailyDouble).setDailyDouble(true);
            questions.get(secondDailyDouble).setDailyDouble(true);
for(int i=0;i<24;i++)
{
    System.out.println(questions.get(i).isDailyDouble());
}
        } catch (Exception e) {
            System.out.println("ERROR in reading questions file!!!!!");
        }
    }
}
