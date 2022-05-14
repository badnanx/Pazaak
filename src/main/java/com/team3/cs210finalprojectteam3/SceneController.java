package com.team3.cs210finalprojectteam3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class SceneController {

    private Stage mStage;
    private Scene mScene;
    private Parent mRoot;

    @FXML
    private TextField playerOneScore;

    @FXML
    private TextField playerTwoScore;

    private TextField gameTimer;
    private TextField timerUpdate;

    @FXML
    private Button flipBotton;


    @FXML
    private Label visualTimer;

    @FXML
    private Button playerOneEndButton;

    @FXML
    private Circle playerTwoTurnIndicator;

    @FXML
    private Circle playerOneTurnIndicator;


    @FXML
    private Rectangle topRight;






   @FXML
    public void cardColorChange(){
        topRight.setFill(Color.YELLOW);
    }











    public void SwitchtoWelcomeScene(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("welcome-view.fxml"));
        mStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        mScene = new Scene(root);
        mStage.setScene(mScene);
        mStage.show();


    }

    public void SwitchtoInstructionsScene(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("instructions-view.fxml"));
        mStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        mScene = new Scene(root);
        mStage.setScene(mScene);
        mStage.show();
    }

    public void SwitchtoGameScene(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("game-view.fxml"));
        mStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        mScene = new Scene(root);
        mStage.setScene(mScene);
        mStage.show();

    }

    @FXML
    public void buttonTest(){
        System.out.println("worked");

        playerOneScore.setText("3");
        playerTwoScore.setText("20");
    }

    @FXML
    public void playerOneEndGame(){
        playerTwoTurnLight();
        timer();

    }










    public void timer(){
        Timer timer = new Timer();
        visualTimer = new Label();

        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 10;

            @Override
            public void run() {
                visualTimer.setText(String.valueOf(i));
                i--;

                if(i < 0){
                    timer.cancel();
                    //timerUpdate.setText("Next Player");
                    System.out.println("10!");
                }

            }

        }, 1000, 1000);
    }


    public void playerTwoTurnLight(){
        playerTwoTurnIndicator.setFill(Color.GREEN);

       Timer lightTimer = new Timer();
        lightTimer.scheduleAtFixedRate(new TimerTask() {
            int i = 10;

            @Override
            public void run() {
                i--;

                if(i < 0){
                    lightTimer.cancel();
                    playerTwoTurnIndicator.setFill(Color.RED);

                }

            }

        }, 1000, 1000);


    }

    @FXML
    public void playerTwoEndGame(){
        playerOneTurnLight();
        timer();

    }

    public void playerOneTurnLight(){
        playerOneTurnIndicator.setFill(Color.GREEN);

        Timer lightTimer = new Timer();
        lightTimer.scheduleAtFixedRate(new TimerTask() {
            int i = 10;

            @Override
            public void run() {
                i--;

                if(i < 0){
                    lightTimer.cancel();
                    playerOneTurnIndicator.setFill(Color.RED);

                }

            }

        }, 1000, 1000);


    }






}

