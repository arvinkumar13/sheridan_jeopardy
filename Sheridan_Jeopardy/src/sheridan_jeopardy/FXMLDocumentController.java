/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan_jeopardy;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 *
 * @author arvinkumar
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField userName;
    @FXML
    private Button login;
    @FXML
    private Label noInput;

    /**
     * this will open the main window(PlayGame) to play jeopardy
     */
    public void playGame() {
        if (userName.getText().equals(null) || userName.getText().equals("")) {
            noInput.setVisible(true);
        } else {
            UserName.name = userName.getText();
            Sheridan_Jeopardy.showGame();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
