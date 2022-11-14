package gui.gas;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Home extends Application {

    Customer customersView = new Customer();
    Current currentsView = new Current();
    Gas usageGasView = new Gas();
    Usage usagesView = new Usage();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Energiebedrijf");

        Button customer = new Button();
        Button currents = new Button();
        Button usageGas = new Button();
        Button usages = new Button();
        customer.setText("Klanten");
        currents.setText("Stroom");
        usageGas.setText("Gas");
        usages.setText("Verbruik");



        HBox layout = new HBox();
        layout.getChildren().addAll(customer, currents, usageGas, usages);
        layout.setSpacing(25);
        layout.setAlignment(Pos.CENTER);

        customer.setOnAction((event) -> primaryStage.setScene(customersView.getView()));
        currents.setOnAction((event) -> primaryStage.setScene(currentsView.getView()));
        usageGas.setOnAction((event) -> primaryStage.setScene(usageGasView.getView()));
        usages.setOnAction((event) -> primaryStage.setScene(usagesView.getView()));



        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
