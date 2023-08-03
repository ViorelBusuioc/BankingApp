public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);



        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Melbourne", true);
        bank.listCustomers("Adelaide", true);

//        System.out.println(bank.listCustomers("Melbourne", true));
//        System.out.println(bank.listCustomers("Adelaide", true));


//        Branch branch = new Branch("Galati");
//        branch.newCustomer("Vasile Ion", 200.23);
//        branch.newCustomer("Gicu Grozac", 4000.00);
//        System.out.println(branch.getCustomers());

    }
}
