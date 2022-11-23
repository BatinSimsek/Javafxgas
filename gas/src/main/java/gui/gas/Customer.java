package gui.gas;
//import class
import Domain.Customers;
import Domain.UsageCustomer;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Customer {

    // maak een object
    private UsageCustomer information = new UsageCustomer();
    private Home mainMenu = new Home();

    public Scene getView(Stage stage){
        //style
        GridPane layout = new GridPane();
        layout.setHgap(10);
        layout.setVgap(10);

        //maakt textfield en label
        Label custommerNumber = new Label("Klantnummer:");
        TextField customerNumberText = new TextField();
        Label firstName = new Label("Voornaam:");
        TextField firstNameText = new TextField();
        Label sureName = new Label("Achternaam:");
        TextField sureNameText = new TextField();
        Label yearPrice = new Label("Jaarlijks voorschot:");
        TextField yearPriceText = new TextField();
        Button buttonSave = new Button("Opslaan");
        Button backButton = new Button("Terug");

        //Zet ze in een row en kolom
        //0-0
        layout.add(customerNumberText, 1, 0);
        layout.add(custommerNumber, 0, 0);
        //0-1
        layout.add(firstName, 0, 1);
        layout.add(firstNameText, 1 , 1);
        //0-2
        layout.add(sureName, 0, 2);
        layout.add(sureNameText, 1 , 2);
        //0-3
        layout.add(yearPrice, 0, 3);
        layout.add(yearPriceText, 1 , 3);
        //0-4
        layout.add(buttonSave, 0 , 4);
        layout.add(backButton, 1, 4);


        buttonSave.setOnAction((actionEvent -> {

            int number = Integer.parseInt(customerNumberText.getText());
            String name = firstNameText.getText();
            String surename = sureName.getText();
            double money = Double.parseDouble(yearPriceText.getText());

            Customers person = new Customers(number, name, surename, money);

            //toevoegen van persoon
            information.addCustomer(person);
            //print infromatie uit om te testen
            information.printCustomer();
        }));

        // gaat terug naar home scherm
        backButton.setOnAction((actionEvent -> stage.setScene(mainMenu.getView(stage))));

        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 500 , 500);
        return scene;
    }

}
