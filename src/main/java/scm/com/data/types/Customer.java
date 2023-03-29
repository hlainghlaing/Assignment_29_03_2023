package scm.com.data.types;

public class Customer {

    // declare variables with data types
    private int customerID;
    private String customerName;
    private String customerPh;
    private String customerAddress;

    public Customer() {
    }

    public Customer(int customerID, String customerName, String customerPh, String customerAddress) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerPh = customerPh;
        this.customerAddress = customerAddress;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPh() {
        return customerPh;
    }

    public void setCustomerPh(String customerPh) {
        this.customerPh = customerPh;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

}
