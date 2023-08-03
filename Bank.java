import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        for(Branch b : branches) {
            if (branchName.equals(b.getName())) {
                return false;    // already exists;
            }
        }
        branches.add(new Branch(branchName));
        return true;            // customer not found, add to the List;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch tempBranch = findBranch(branchName);
        if(tempBranch != null) {
            return tempBranch.newCustomer(customerName,initialTransaction);
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch tempBranch = findBranch(branchName);
        if(tempBranch != null) {
            return tempBranch.addCustomerTransaction(customerName,transaction);
        } else {
            return false;
        }
    }

    private Branch findBranch(String name) {
        for (Branch b : branches) {
            if (name.equals(b.getName())) {
                return b;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction) {

        Branch branchCheck = findBranch(branchName);
        int count = 1;
        int countT = 1;
        boolean flag = false;

        if (branchCheck != null) {
            flag = true;
            System.out.println("Customer details for branch " + branchCheck.getName());
            for (Customer c : branchCheck.getCustomers()) {
                System.out.printf("Customer: %s[%d]%n", c.getName(), count);
                count++;
                if (printTransaction) {
                    ArrayList<Double> trans = c.getTransactions();
                    for (int i = 0; i < c.getTransactions().size(); i++) {
                        System.out.println("[" + (i+1) + "]  Amount " + c.getTransactions().get(i));
                    }
                }
            }
        }
        return flag;
    }
}
