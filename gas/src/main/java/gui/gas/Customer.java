package gui.gas;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Customer {

    public Scene getView(){
        GridPane layout = new GridPane();

        Label custommerNumber = new Label("Klantnummer:");
        TextField customerNumberText = new TextField();
        Label firstName = new Label("Voornaam:");
        TextField firstNameText = new TextField();
        Label sureName = new Label("Achternaam:");
        TextField sureNameText = new TextField();
        Label yearPrice = new Label("Jaarlijks voorschot:");
        TextField yearPriceText = new TextField();
        Button buttonSave = new Button("Opslaan");

        //0-0
        layout.add(customerNumberText, 1, 0);
        layout.add(custommerNumber, 0, 0);
        //0-1
        layout.add(firstName, 0, 1);
        layout.add(firstNameText, 1 , 1);
        //0-2





        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 500 , 500);
        return scene;
    }

}
