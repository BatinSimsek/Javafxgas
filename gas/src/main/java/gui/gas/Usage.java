package gui.gas;

import Domain.UsageCustomer;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Usage {

    private UsageCustomer usage = new UsageCustomer();
    private Home mainMenu = new Home();


    public Scene getView(Stage stage){
        GridPane layout = new GridPane();
        layout.setHgap(10);
        layout.setVgap(10);



        Label gasPrice = new Label("Tarief gas:");
        TextField gasPriceNumber = new TextField();

        Label energieKWH = new Label("Tarief kwh:");
        TextField energieKWHText = new TextField();


        Button backButton = new Button("Terug");
        Button check = new Button("check");


        layout.add(energieKWHText, 1, 0);
        layout.add(energieKWH, 0, 0);

        layout.add(gasPrice, 0, 1);
        layout.add(gasPriceNumber, 1, 1);

        layout.add(backButton, 1, 4);
        layout.add(check, 1, 5);

        check.setOnAction((event) -> {
            try {
                int a = Integer.parseInt(gasPriceNumber.getText());
                int b = Integer.parseInt(energieKWHText.getText());
                usage.getInformation(a, b);
                usage.checkPrice();
                
            } catch (NumberFormatException a){
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Moet een nummer zijn");
                alert.setContentText("Check of je datum of nummer goed ingevuld is. " + String.valueOf(a));
                alert.show();
            }
        });

        backButton.setOnAction((actionEvent -> stage.setScene(mainMenu.getView(stage))));



        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 500 , 500);
        return scene;
    }

}
