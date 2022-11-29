package Domain;

import java.util.ArrayList;

public class UsageCustomer {
    public static ArrayList<Customers> customers = new ArrayList<>();
    public static ArrayList<GasCustomer> gasCustomers = new ArrayList<>();
    public static ArrayList<EnergieCostumer> energieCustomer = new ArrayList<>();
    private int energy;
    private int gas;
    public javafx.scene.control.Label myLabel = new javafx.scene.control.Label();

    public void addCustomer(Customers customers) {
        UsageCustomer.customers.add(customers);
    }

    public void addGasCustomer(GasCustomer gasCustomers) {
        UsageCustomer.gasCustomers.add(gasCustomers);
    }

    public void energieCustomer(EnergieCostumer energieCustomer) {
        UsageCustomer.energieCustomer.add(energieCustomer);
    }

    public void getInformation(int e, int g) {
        this.energy = e;
        this.gas = g;
    }

    public void checkPrice() {
        double total;
        double totalcost = 0;
        double v = 0;
        double v1 = 0;

        for (Customers a : customers) {
            for (Energie g : gasCustomers){
                for(Energie e : energieCustomer){
                    totalcost = a.getYearMoney();
                    v = this.energy * e.getMoney();
                    v1 = this.gas * g.getMoney();
                }
            }
        }

        total = v + v1;

        if (totalcost > total) {
            myLabel.setText("Je totaal geld is : " + totalcost + " Het Restanten is : " + String.valueOf( totalcost - total) + " Je bespaar geld!");
        } else if (totalcost < total) {
            myLabel.setText("Je verlies geld: "  + String.valueOf(totalcost - total));
        } else {
            myLabel.setText("Je zit net in budget: " + totalcost + " Het totalen kosten energie: " + total);
        }
    }
}