package gui.gas;

import Domain.UsageCustomer;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Usage {

    private UsageCustomer usage = new UsageCustomer();
    private Home mainMenu = new Home();


    public Scene getView(Stage stage){
        GridPane layout = new GridPane();
        layout.setHgap(10);
        layout.setVgap(10);


        Button backButton = new Button("Terug");
        Button check = new Button("check");

        layout.add(backButton, 1, 4);
        layout.add(check, 1, 5);

        check.setOnAction((event) -> {
            usage.checkPrice();
        });

        backButton.setOnAction((actionEvent -> stage.setScene(mainMenu.getView(stage))));



        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 500 , 500);
        return scene;
    }

}
