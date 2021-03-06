package agh.ics.oop.gui;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class WelcomeScreen extends VBox
{
    private final Label title = new Label("Willkommen aus dem Spiel");
    public final ParameterBox playersNumberBox = new ParameterBox("number of players", 2, 5);
    public final ParameterBox mapWidthBox = new ParameterBox("map width", 10, 30);
    public final ParameterBox mapHeightBox = new ParameterBox("map height", 10, 30);
    public final Button startButton = new Button("start!");

    public WelcomeScreen()
    {
        super();
        title.setFont(new Font("Comic Sans MS", 40));
        startButton.setFont(new Font("Comic Sans MS", 20));
        this.getChildren().addAll(title, playersNumberBox, mapWidthBox, mapHeightBox, startButton);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(15);
    }
}
