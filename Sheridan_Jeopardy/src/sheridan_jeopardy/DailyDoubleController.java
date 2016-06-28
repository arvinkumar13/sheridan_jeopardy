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
public class DailyDoubleController implements Initializable {

    @FXML
    private Button setValue;
    @FXML
    private TextField newValue;
    @FXML
    private Label maxAmount;
    @FXML
    private Label errorInput;
    int max_limit;

    /**
     * this will show the user the maximum possible bid
     */
    public void displayMaxAmount() {
        newValue.setText(null);
        if (GamePlayController.amount <= 1000) {
            max_limit = 1000;
        } else {
            max_limit = GamePlayController.amount;
        }
        maxAmount.setText("you can bet upto $" + max_limit);
    }

    /**
     * this will display the question after the user has entered his bid
     */
    public void goBackToQuestion() {
        errorInput.setVisible(false);
        try {
            if (Integer.parseInt(newValue.getText()) < 0 || Integer.parseInt(newValue.getText()) > max_limit) {
                errorInput.setText("*please enter the amount within $0 to $" + max_limit);
                errorInput.setVisible(true);

            } else {

                GamePlayController.questions.get(UserName.questionNum).setValue(Integer.parseInt(newValue.getText()));
            }
        } catch (Exception e) {
            errorInput.setText("*please enter the amount properly");
            errorInput.setVisible(true);
        }
        if (!errorInput.isVisible()) {
            Sheridan_Jeopardy.showQuestion();
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
