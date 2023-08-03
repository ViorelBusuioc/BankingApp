import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransaction) {
        for(Customer c : customers) {
            if (name.equals(c.getName())) {
                return false;    // already exists
            }
        }
        customers.add(new Customer(name, initialTransaction));
        return true;        // added to the list
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        for(Customer c : customers) {
            if (name.equals(c.getName())) {
                c.addTransaction(transaction);
                return true;     // customer found and transaction added;
            }
        }
        return false;           // customer not found;
    }

    private Customer findCustomer(String name) {
        for(Customer c : customers) {
            if (name.equals(c.getName())) {
            return c;
            }
        }
        return null;
    }

}
