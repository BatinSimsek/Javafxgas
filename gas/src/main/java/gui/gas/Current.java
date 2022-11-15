package gui.gas;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Current {

    private Home mainMenu = new Home();


    public Scene getView(Stage stage){
        GridPane layout = new GridPane();
        layout.setHgap(10);
        layout.setVgap(10);


        Label energieKWH = new Label("Tarief kwh:");
        TextField energieKWHText = new TextField();

        energieKWHText.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    energieKWHText.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });

        Label dateWhen = new Label("Datum vanaf:");
        DatePicker dateWhenPicker = new DatePicker();

        Label dateUntil = new Label("Datum tot:");
        DatePicker dateUntilPicker = new DatePicker();

        Button buttonSave = new Button("Opslaan");
        Button backButton = new Button("Terug");

        //0-0
        layout.add(energieKWHText, 1, 0);
        layout.add(energieKWH, 0, 0);
        //0-1
        layout.add(dateWhen, 0, 1);
        layout.add(dateWhenPicker, 1 , 1);
        //0-2
        layout.add(dateUntil, 0, 2);
        layout.add(dateUntilPicker, 1 , 2);
        //0-4
        layout.add(buttonSave, 0 , 4);
        layout.add(backButton, 1, 4);

        backButton.setOnAction((actionEvent -> stage.setScene(mainMenu.getView(stage))));

        buttonSave.setOnAction((actionEvent -> {
            if (energieKWHText.getText() == null || energieKWHText.getText().trim().isEmpty()) {
                System.out.println("mag niet");
            } else {
                String text = energieKWHText.getText();
                System.out.println(text);
            }


        }));



        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 500 , 500);
        return scene;
    }

}

