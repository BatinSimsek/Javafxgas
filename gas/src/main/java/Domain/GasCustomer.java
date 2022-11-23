package Domain;

import javafx.scene.control.DatePicker;

import java.util.Date;

public class GasCustomer {
    private double gasMoney;
    private DatePicker dateWhen;
    private DatePicker dateThen;

    public GasCustomer(double gasMoney, DatePicker dateWhen, DatePicker dateThen) {
        this.gasMoney = gasMoney;
        this.dateWhen = dateWhen;
        this.dateThen = dateThen;
    }

    public double getGasMoney() {
        return gasMoney;
    }

    public DatePicker getDateWhen() {
        return dateWhen;
    }

    public DatePicker getDateThen() {
        return dateThen;
    }
}
