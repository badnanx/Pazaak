package sample;

/**
 * This class controls the model, anything we want to do with the player's hands or the playing field such as changing
 * cards that can be seen or removing from the Hand will happen here.
 */
public class Controller {
    GameModel model;

    public Controller(GameModel model){
        this.model = model;
    }
}
