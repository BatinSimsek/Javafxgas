package Domain;

import javafx.scene.control.DatePicker;

public class Energie {

    private double money;
    private DatePicker dateWhen;
    private DatePicker dateThen;

    public Energie(double money, DatePicker dateWhen, DatePicker dateThen){
        this.money = money;
        this.dateWhen = dateWhen;
        this.dateThen = dateThen;
    }

    public double getMoney() {
        return money;
    }

    public DatePicker getDateWhen() {
        return dateWhen;
    }

    public DatePicker getDateThen() {
        return dateThen;
    }
}
