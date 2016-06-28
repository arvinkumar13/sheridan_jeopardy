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
public class WinnerController implements Initializable {

    @FXML
    private Label congratulation;

    /**
     * to display the appropriate message according the user's winnings
     */
    public void congratulateUser() {
        if (GamePlayController.amount > 0) {
            congratulation.setText("congratulations " + UserName.name + ",\n you won: \n $" + GamePlayController.amount);
        } else {
            congratulation.setText("sorry " + UserName.name + ",\n you won nothing in this game");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
