/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose import javafx.scene.Scene;
Tools | Templates
 * and open the template in the editor.
 */
package sheridan_jeopardy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent; 
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author arvinkumar
 */
public class Sheridan_Jeopardy extends Application {
//stages for different windows

    static Stage login = new Stage();
    static Stage game = new Stage();
    static Stage winner = new Stage();
    static Stage questionStage = new Stage();
    static Stage answerStage = new Stage();
    static Stage dailydoublestage = new Stage();

    static FXMLDocumentController loginControl;
    static GamePlayController gameControl;
    static WinnerController winControl;
    static QuestionDisplayController quesControl;
    static AnswerResultController answerControl;
    static DailyDoubleController dailyDoubleController;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader r1 = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        FXMLLoader r2 = new FXMLLoader(getClass().getResource("PlayGame.fxml"));
        FXMLLoader r3 = new FXMLLoader(getClass().getResource("Winner.fxml"));
        FXMLLoader r4 = new FXMLLoader(getClass().getResource("QuestionDisplay.fxml"));
        FXMLLoader r5 = new FXMLLoader(getClass().getResource("AnswerResult.fxml"));
        FXMLLoader r6 = new FXMLLoader(getClass().getResource("DailyDouble.fxml"));
        
        Parent root1 = r1.load();
        Parent root2 = r2.load();
        Parent root3 = r3.load();
        Parent root4 = r4.load();
        Parent root5 = r5.load();
        Parent root6 = r6.load();
        
        loginControl = r1.getController();
        gameControl = r2.getController();
        winControl = r3.getController();
        quesControl = r4.getController();
        answerControl = r5.getController();
        dailyDoubleController = r6.getController();
        
        Scene scene1 = new Scene(root1);
        Scene scene2 = new Scene(root2);
        Scene scene3 = new Scene(root3);
        Scene scene4 = new Scene(root4);
        Scene scene5 = new Scene(root5);
        Scene scene6 = new Scene(root6);
        
        login.setScene(scene1);
        login.setTitle("login");
        game.setScene(scene2);
        game.setTitle("jeopardy");
        winner.setScene(scene3);
        winner.setTitle("results");
        questionStage.setScene(scene4);
        questionStage.setTitle("question");
        answerStage.setScene(scene5);
        answerStage.setTitle("answer");
        dailydoublestage.setScene(scene6);
        dailydoublestage.setTitle("Daily Double");
        
        showLogin();
    }

    /**
     * a method to display the login window
     */
    public static void showLogin() {
        login.show();
        game.hide();
        winner.hide();
        questionStage.hide();
    }

    /**
     * a method to display the main jeopardy window
     */
    public static void showGame() {
        game.show();
        login.hide();
        winner.hide();
        answerStage.hide();
        questionStage.hide();
        gameControl.welcomeUser();
    }

    /**
     * a method to display the final results(winnings) window
     */
    public static void showWin() {
        winner.show();
        game.hide();
        login.hide();
        questionStage.hide();
        winControl.congratulateUser();
        answerStage.hide();
    }

    /**
     * a method to display the Daily Double window
     */
    public static void showDailyDouble() {
        dailydoublestage.show();
        dailyDoubleController.displayMaxAmount();
        questionStage.hide();
        winner.hide();
        game.hide();
        login.hide();
    }

    /**
     * a method to display a window with the selected question
     */
    public static void showQuestion() {
        questionStage.show();
        dailydoublestage.hide();
        quesControl.displayQuestion();
        winner.hide();
        game.hide();
        login.hide();
    }

    /**
     * a method to display the answer of the question
     */
    public static void showAnswer() {
        answerStage.show();
        answerControl.displayAnswer();
        questionStage.hide();
        winner.hide();
        game.hide();
        login.hide();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
