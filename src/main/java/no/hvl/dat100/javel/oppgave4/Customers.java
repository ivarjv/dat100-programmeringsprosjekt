package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {
        customers = new Customer [size];
    }

    // b) count number of non-null references
    public int countNonNull() {


        int count = 0;
        for (Customer c : customers) {
            if (c != null) {
                count++;
            }
        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        boolean funnet = false;
        Customer c = null;

        int i = 0;
        while (i < customers.length && !funnet) {
            if (customers[i] != null && customers[i].getCustomerId() == customer_id) {
                funnet = true;
                c = customers[i];
            }
            i++;
        }

        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;
        int i = 0;

        while (i < customers.length && !inserted) {
            if (customers[i] == null) {
                customers[i] = c;
                inserted= true;
            }
            i++;
        }

        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        boolean deleted = false;
        Customer c = null;
        int i = 0;
        
        while (i < customers.length && !deleted) {
            if (customers[i] != null && customers[i].getCustomerId() == customer_id) {
                c = customers[i];
                customers[i] = null;
                deleted = true;
            }
            i++;
        }

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        int count = countNonNull();

        Customer[] result = new Customer[count];

        int j = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                result[j] = customers[i];
                j++;
            }
        }

        return result;
    }
}