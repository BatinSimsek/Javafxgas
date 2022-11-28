package gui.gas;
//import class
import Domain.GasCustomer;
import Domain.UsageCustomer;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Date;

public class Gas {

    private UsageCustomer information = new UsageCustomer();
    private Home mainMenu = new Home();


    public Scene getView(Stage stage){
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
        Button backButton = new Button("Terug");


        //0-0
        layout.add(gasPrice, 0, 0);
        layout.add(gasPriceNumber, 1, 0);
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
            try {
                double price = Double.parseDouble(gasPriceNumber.getText());
                DatePicker datenow = dateWhenPicker;
                DatePicker dateuntil = dateUntilPicker;

                GasCustomer gasperson = new GasCustomer(price, datenow, dateuntil);
                information.addGasCustomer(gasperson);
            } catch (NumberFormatException a){
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Moet een nummer zijn");
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
