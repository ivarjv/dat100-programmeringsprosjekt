package no.hvl.dat100.javel.oppgave3;

import static no.hvl.dat100.javel.oppgave3.PowerAgreementType.SPOTPRICE;

public class Customer {
    String names;
    String emails;
    int customer_ids;
    PowerAgreementType agreements;
    public Customer() {
        names = "Nils";
        emails = "Nils123@hotamil.com";
        customer_ids = 81549300;
        agreements = SPOTPRICE;
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
        return names ;
    }
    public String getNames() {
    return names;
    }
    public String getEmails() {
        return emails;
    }
    public int getCustomer_ids() {
        return customer_ids;
    }

    public PowerAgreementType getAgreements() {
        return agreements;
    }

    // TODO - getter/setter methods for all objectvariables

    // TODO - toString method
    public String toString() {
        return names + " " + emails + " " + customer_ids + " " + agreements;
    }
}
