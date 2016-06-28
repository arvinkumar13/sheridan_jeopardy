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
public class AnswerResultController implements Initializable {

    @FXML
    private Label feedback;
    @FXML
    private Button quitButton;

    /**
     * this method displays the correct answer and deducts the questions value
     * from winnings if user entered wrong answer,and adds the questions value
     * to winnings if user entered correct answer
     */
    public void displayAnswer() {
        if (GamePlayController.questionsAnswered == 24) {
            quitButton.setText("display results");
        }
        if (QuestionDisplayController.answer.equals(QuestionDisplayController.correctAnswer)) {
            GamePlayController.amount = GamePlayController.amount + GamePlayController.questions.get(UserName.questionNum).getValue();
            feedback.setText("CORRECT! \n you won $" + GamePlayController.questions.get(UserName.questionNum).getValue() + " in this question.\n Your total winnings are $" + GamePlayController.amount);
        } else {
            GamePlayController.amount = GamePlayController.amount - GamePlayController.questions.get(UserName.questionNum).getValue();
            if (GamePlayController.amount < 0) {
                GamePlayController.amount = 0;
            }
            feedback.setText("sorry,wrong answer,\n the right answer was: \n" + GamePlayController.questions.get(UserName.questionNum).getRightAnswer()
                    + "\n you lost $" + GamePlayController.questions.get(UserName.questionNum).getValue() + " in this question.\n Your total winnings are $" + GamePlayController.amount);
        }
    }

    /**
     * this takes to us another stage,if questions are less than 25 then it'll
     * take us to the questions page otherwise to the results window
     */
    public void goBackToGame() {
        if (GamePlayController.questionsAnswered == 24) {
            Sheridan_Jeopardy.showWin();
        } else {
            Sheridan_Jeopardy.showGame();
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
