package Domain;

import java.util.ArrayList;

public class UsageCustomer {
    private ArrayList<Customers> customers;
    private ArrayList<GasCustomer> gasCustomers;
    private ArrayList<EnergieCostumer> energieCustomer;

    public UsageCustomer() {
        this.customers = new ArrayList<>();
        this.energieCustomer = new ArrayList<>();
        this.gasCustomers = new ArrayList<>();
    }

    //toevoegen in een arraylist
    public void addCustomer(Customers customers) {
        this.customers.add(customers);
    }
    public void addGasCustomer(GasCustomer gasCustomers) {this.gasCustomers.add(gasCustomers);}
    public void energieCustomer(EnergieCostumer energieCustomer){
        this.energieCustomer.add(energieCustomer);
    }


    public void checkPrice() {

//        double priceGas = 4.0;
//        double priceEnergie = 4.5;
//        double v1 = 0;
//        double v2 = 0;
//        double total = 0;
//        double a = 0;


            for (Customers c : this.customers) {
//                total = c.getCustomerNumber();
//                System.out.println(total);
                System.out.println(c.getYearMoney());
            }

//            for (GasCustomer g : this.gasCustomers) {
//                v1 = g.getGasMoney() * priceGas;
//                for (EnergieCostumer e : this.energieCustomer) {
//                    v2 = e.getEnergieMoney() * priceEnergie;
//
//                }
//            }
//
//            a = v1 + v2;
//
//            if (total > a) {
//                System.out.println("Je bespaar nog geld");
//            } else if (total < a) {
//                System.out.println("Je verlies geld");
//            } else {
//                System.out.println("Je zit net in budget");
//            }

    }



    //Testen of het werkt.
    public void printCustomer() {
        for (Customers e: this.customers){
            System.out.println(e.getYearMoney());
        }
    }

    public void printGas() {
        for (GasCustomer g: this.gasCustomers) {
            System.out.println(g.getGasMoney());
        }
    }

    public void printEnergie() {
        for (EnergieCostumer e: this.energieCustomer){
            System.out.println(e.getEnergieMoney());
        }
    }


}
