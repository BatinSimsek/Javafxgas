package Domain;

import javafx.scene.control.DatePicker;


public class EnergieCostumer {

    private double energieMoney;
    private DatePicker dateWhen;
    private DatePicker dateThen;

    public EnergieCostumer(double energieMoney, DatePicker dateWhen, DatePicker dateThen) {
        this.energieMoney = energieMoney;
        this.dateWhen = dateWhen;
        this.dateThen = dateThen;
    }

    public double getEnergieMoney() {
        return energieMoney;
    }

    public DatePicker getDateWhen() {
        return dateWhen;
    }

    public DatePicker getDateThen() {
        return dateThen;
    }
}
