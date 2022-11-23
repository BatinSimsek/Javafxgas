package Domain;

import gui.gas.Gas;

import java.util.ArrayList;

public class UsageCustomer {
    private ArrayList<Customer> customers;
    private ArrayList<GasCustomer> gasCustomers;
    private ArrayList<EnergieCostumer> energieCustomer;

    public UsageCustomer() {
        this.customers = new ArrayList<>();
        this.energieCustomer = new ArrayList<>();
        this.gasCustomers = new ArrayList<>();
    }

    public void addCustomer(Customer customers) {
        this.customers.add(customers);
    }

    public void addGasCustomer(GasCustomer gasCustomers) {
        this.gasCustomers.add(gasCustomers);
    }

    public void energieCustomer(EnergieCostumer energieCustomer){
        this.energieCustomer.add(energieCustomer);
    }


}
