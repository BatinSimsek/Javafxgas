package gui.gas;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class Gas {

    public Scene getView(){
        GridPane layout = new GridPane();
        layout.setHgap(10);
        layout.setVgap(10);


        Label gasPrice = new Label("Tarief gas:");
        TextField gasPriceNumber = new TextField();

        Label dateWhen = new Label("Datum vanaf:");
        DatePicker dateWhenPicker = new DatePicker();

        Label dateUntil = new Label("Datum tot:");
        DatePicker dateUntilPicker = new DatePicker();

        Button buttonSave = new Button("Opslaan");

        //0-0
        layout.add(gasPrice, 1, 0);
        layout.add(gasPriceNumber, 0, 0);
        //0-1
        layout.add(dateWhen, 0, 1);
        layout.add(dateWhenPicker, 1 , 1);
        //0-2
        layout.add(dateUntil, 0, 2);
        layout.add(dateUntilPicker, 1 , 2);
        //0-4
        layout.add(buttonSave, 0 , 4);


        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 500 , 500);
        return scene;
    }

}
