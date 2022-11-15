package gui.gas;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Home extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Energiebedrijf");
        stage.setScene(this.getView(stage));
        stage.show();
    }


    public Scene getView(Stage stage){

        Customer customersView = new Customer();
        Current currentsView = new Current();
        Gas usageGasView = new Gas();
        Usage usagesView = new Usage();


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

        customer.setOnAction((event) -> stage.setScene(customersView.getView(stage)));
        currents.setOnAction((event) -> stage.setScene(currentsView.getView(stage)));
        usageGas.setOnAction((event) -> stage.setScene(usageGasView.getView(stage)));
        usages.setOnAction((event) -> stage.setScene(usagesView.getView(stage)));



        Scene scene = new Scene(layout, 300, 250);
        return scene;
    }
}

