package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Launches the application
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GameModel model = new GameModel();
        Controller controller = new Controller(model);
        GameWindow gameWindow = new GameWindow(controller,model);
        gameWindow.startForm();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
