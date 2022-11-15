package gui.gas;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Usage {

    private Home mainMenu = new Home();


    public Scene getView(Stage stage){
        GridPane layout = new GridPane();
        layout.setHgap(10);
        layout.setVgap(10);


        Label energieInKWH = new Label("Stroom in kwh:");
        TextField energieInKWHText = new TextField();

        Label gasM3 = new Label("Gas per m3:");
        TextField gasM3Text = new TextField();

        Label dateWhen = new Label("Datum startperiode:");
        DatePicker dateWhenPicker = new DatePicker();

        Label dateUntil = new Label("Datum Eindperiode:");
        DatePicker dateUntilPicker = new DatePicker();

        Button buttonSave = new Button("Opslaan");
        Button backButton = new Button("Terug");

        //0-0
        layout.add(energieInKWH, 0, 0);
        layout.add(energieInKWHText, 1, 0);
        //0-1
        layout.add(gasM3, 0, 1);
        layout.add(gasM3Text, 1, 1);
        //0-2
        layout.add(dateWhen, 0, 2);
        layout.add(dateWhenPicker, 1 , 2);
        //0-3
        layout.add(dateUntil, 0, 3);
        layout.add(dateUntilPicker, 1 , 3);
        //0-4
        layout.add(buttonSave, 0 , 4);
        layout.add(backButton, 1, 4);

        backButton.setOnAction((actionEvent -> stage.setScene(mainMenu.getView(stage))));



        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 500 , 500);
        return scene;
    }

}
