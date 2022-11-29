package gui.gas;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import Domain.EnergieCostumer;
import Domain.UsageCustomer;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Current {

    private UsageCustomer information = new UsageCustomer();
    private Home mainMenu = new Home();


    public Scene getView(Stage stage){
        GridPane layout = new GridPane();
        layout.setHgap(10);
        layout.setVgap(10);


        Label energieKWH = new Label("Tarief kwh:");
        TextField energieKWHText = new TextField();

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

        buttonSave.setOnAction((actionEvent -> {

            try{
                double energieCustom = Double.parseDouble(energieKWHText.getText());
                DatePicker datewhen = dateWhenPicker;
                DatePicker dateuntil = dateUntilPicker;

                EnergieCostumer energie = new EnergieCostumer(energieCustom, datewhen, dateuntil);
                information.energieCustomer(energie);
            } catch (NumberFormatException a){
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Foutmelding");
                alert.setContentText("Check of je datum of nummer goed ingevuld is. " + String.valueOf(a));
                alert.show();
            }
        }));

        backButton.setOnAction((actionEvent -> stage.setScene(mainMenu.getView(stage))));


        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 500 , 500);
        return scene;
    }

}

