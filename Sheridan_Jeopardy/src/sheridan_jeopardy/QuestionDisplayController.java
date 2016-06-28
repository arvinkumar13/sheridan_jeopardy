/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan_jeopardy;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author arvinkumar
 */
public class QuestionDisplayController implements Initializable {

    /**
     * Initializes the controller class.
     */
    static String answer;
    static String correctAnswer;
    @FXML
    private Button submit;
    @FXML
    private Label lastquestion;
    @FXML
    private Button quitButton;
    @FXML
    private Label question;
    @FXML
    private Label errorLabel;
    @FXML
    private RadioButton option1;
    @FXML
    private RadioButton option2;
    @FXML
    private RadioButton option3;
    @FXML
    private RadioButton option4;

    /**
     * this method displays the selected question
     */
    public void displayQuestion() {
        if (GamePlayController.questionsAnswered == 24) {
            lastquestion.setVisible(true);
            quitButton.setText("quit and display results");
            quitButton.setMinWidth(335);
        }
        errorLabel.setVisible(false);
        option1.setSelected(false);
        option2.setSelected(false);
        option3.setSelected(false);
        option4.setSelected(false);
        if (GamePlayController.questions.get(UserName.questionNum).isRead() == false) {

            question.setText(GamePlayController.questions.get(UserName.questionNum).getQuestion());
            submit.setVisible(true);
            option1.setVisible(true);
            option2.setVisible(true);
            option3.setVisible(true);
            option4.setVisible(true);
            option1.setText(GamePlayController.questions.get(UserName.questionNum).getOptions()[0]);
            option2.setText(GamePlayController.questions.get(UserName.questionNum).getOptions()[1]);
            option3.setText(GamePlayController.questions.get(UserName.questionNum).getOptions()[2]);
            option4.setText(GamePlayController.questions.get(UserName.questionNum).getOptions()[3]);
            correctAnswer = GamePlayController.questions.get(UserName.questionNum).getRightAnswer();
            GamePlayController.questions.get(UserName.questionNum).setRead(true);
        } else {
            question.setText("the questions can only be read once");
            option1.setVisible(false);
            option2.setVisible(false);
            option3.setVisible(false);
            option4.setVisible(false);
            submit.setVisible(false);
        }

    }

    /**
     * this checks that an option has been selected prior to the submission of
     * the answer
     */
    public void checkAnswer() {

        if (option1.isSelected()) {
            answer = option1.getText();
            errorLabel.setVisible(false);
            Sheridan_Jeopardy.showAnswer();
        } else if (option2.isSelected()) {
            answer = option2.getText();
            errorLabel.setVisible(false);
            Sheridan_Jeopardy.showAnswer();
        } else if (option3.isSelected()) {
            answer = option3.getText();
            errorLabel.setVisible(false);
            Sheridan_Jeopardy.showAnswer();
        } else if (option4.isSelected()) {
            answer = option4.getText();
            errorLabel.setVisible(false);
            Sheridan_Jeopardy.showAnswer();
        } else {
            errorLabel.setVisible(true);
            errorLabel.setText("please select an option or quit the question");
        }
    }

    /**
     * this method is used for quitting without penalty,it takes the user back
     * to the question page
     */
    public void goBackToGame() {
        Sheridan_Jeopardy.showGame();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ToggleGroup answerOptions = new ToggleGroup();
        option1.setToggleGroup(answerOptions);
        option2.setToggleGroup(answerOptions);
        option3.setToggleGroup(answerOptions);
        option4.setToggleGroup(answerOptions);
    }

}
