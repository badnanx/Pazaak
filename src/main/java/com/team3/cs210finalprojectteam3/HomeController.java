package com.team3.cs210finalprojectteam3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HomeController extends SceneController {


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
        CreateGameEnvironment();
        handCardColorChange();
        mStage.show();




    }

    private void CreateGameEnvironment(){

        p1HandCards = p1Hand.hand;
        p2HandCards = p2Hand.hand;

        p1TextOne = p1HandCards.get(0).text;
        p1TextTwo = p1HandCards.get(1).text;
        p1TextThree = p1HandCards.get(2).text;
        p1TextFour = p1HandCards.get(3).text;
        p2TextOne = p2HandCards.get(0).text;
        p2TextTwo = p2HandCards.get(1).text;
        p2TextThree = p2HandCards.get(2).text;
        p2TextFour = p2HandCards.get(3).text;


        p1TextOneStatic.setText(p1TextOne.getText());
        p1TextTwoStatic.setText(p1TextTwo.getText());
        p1TextThreeStatic.setText(p1TextThree.getText());
        p1TextFourStatic.setText(p1TextFour.getText());
        p2TextOneStatic.setText(p2TextOne.getText());
        p2TextTwoStatic.setText(p2TextTwo.getText());
        p2TextThreeStatic.setText(p2TextThree.getText());
        p2TextFourStatic.setText(p2TextFour.getText());


    }

}
