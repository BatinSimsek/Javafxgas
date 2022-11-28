package Domain;

import java.util.ArrayList;

public class UsageCustomer {
    public static ArrayList<Customers> customers = new ArrayList<>();;
    public static ArrayList<GasCustomer> gasCustomers = new ArrayList<>();;
    public static ArrayList<EnergieCostumer> energieCustomer = new ArrayList<>();

    private int energy;
    private int gas;

    //toevoegen in een arraylist
    public void addCustomer(Customers customers) {
        UsageCustomer.customers.add(customers);
    }
    public void addGasCustomer(GasCustomer gasCustomers) {UsageCustomer.gasCustomers.add(gasCustomers);}
    public void energieCustomer(EnergieCostumer energieCustomer){UsageCustomer.energieCustomer.add(energieCustomer);}

    public void getInformation(int e, int g){
        this.energy = e;
        this.gas = g;
    }
    public void checkPrice() {
        double total;
        double totalcost = 0;
        double v = 0;
        double v1 = 0;

        for (Customers a : customers) {
            for (GasCustomer g : gasCustomers){
                for(EnergieCostumer e : energieCustomer){
                    totalcost = a.getYearMoney();
                    v = this.energy * e.getEnergieMoney();
                    v1 = this.gas * g.getGasMoney();
                }
            }
        }

        total = v + v1;

        if (totalcost > total) {
            System.out.println("Je bespaar nog geld");
        } else if (totalcost < total) {
            System.out.println("Je verlies geld");
        } else {
            System.out.println("Je zit net in budget");
        }
    }


}
