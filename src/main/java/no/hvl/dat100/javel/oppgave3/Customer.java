package no.hvl.dat100.javel.oppgave3;

public class Customer {
    private String names;
    private String emails;
    private int customer_ids;
    private PowerAgreementType agreements;
    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        names = name;
        emails = email;
        customer_ids = customer_id;
        agreements = agreement;
    }

    //set
    public void setNames(String names){
    this.names = names;
    }
    public void setEmails(String emails){
        this.emails = emails;
    }
    public void setCustomer_ids(int customer_ids){
        this.customer_ids = customer_ids;
    }
    public void setAgreements(PowerAgreementType agreements){
        this.agreements = agreements;
    }
    //get
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
