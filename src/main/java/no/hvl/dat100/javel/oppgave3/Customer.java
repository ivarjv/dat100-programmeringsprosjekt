package no.hvl.dat100.javel.oppgave3;

public class Customer {
    String names;
    String emails;
    int customer_ids;
    PowerAgreementType agreements;
    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        names = name;
        emails = email;
        customer_ids = customer_id;
        agreements = agreement;
    }

    //set
    public void setCustomer(String name, String email, int customer_id,PowerAgreementType agreement){
        this.names = name;
        this.emails = emails;
        this.customer_ids = customer_ids;
        this.agreements = agreements;
    }

    //get
    public String getCustomer() {
        return names + emails + customer_ids+ agreements;
    }

    // TODO - getter/setter methods for all objectvariables

    // TODO - toString method
    public String toString() {
        return names + " " + emails + " " + customer_ids + " " + agreements;
    }
}
