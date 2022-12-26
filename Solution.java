import java.util.ArrayList;
import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total no of account to be created:");
        int n = sc.nextInt();
        Account accounts[] = new Account[n];

        for (int i = 0; i < n; i++) {
            accounts[i] = new Account();
        }

        boolean enter = true;

        while (enter) {
            System.out.println("  Welcome to TBI Bank  ");
            System.out.println("1. Set Details. ");
            System.out.println("2. Get Details. ");
            System.out.println("3. Update Detail. ");
            System.out.println("4. Check Balance.");
            System.out.println("5. Deposit.");
            System.out.println("6. Withdraw. ");
            System.out.println("7. Exit. ");

            System.out.print("Enter your choice : ");

            int temp2 = sc.nextInt();
            int index, Ac_no;
            float amount;

            switch (temp2) {
                case 1:
                    System.out.print("Enter index of account ");
                    index = sc.nextInt();
                    accounts[index].setDetails();
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    Ac_no = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (accounts[i].getAccountno() == Ac_no) {
                            accounts[i].getDetails(accounts[i].getAccountno());
                            break;
                        }

                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    Ac_no = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (accounts[i].getAccountno() == Ac_no) {
                            accounts[i].updateDetails(accounts[i].getAccountno());
                            break;
                        }

                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    Ac_no = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (accounts[i].getAccountno() == Ac_no) {
                            System.out.println(
                                    "Available Balance : " + accounts[i].getBalance(accounts[i].getAccountno()));
                            break;
                        }

                    }
                    break;
                case 5:
                    System.out.print("Enter account number: ");
                    Ac_no = sc.nextInt();
                    System.out.println("Enter amount you want to deposit");
                    amount = sc.nextFloat();
                    for (int i = 0; i < n; i++) {
                        if (accounts[i].getAccountno() == Ac_no) {
                            accounts[i].deposit(accounts[i].getAccountno(), amount);
                            System.out.println("Your amount is sucessfully deposited in your Account.");
                            break;
                        }

                    }
                    break;
                case 6:
                    System.out.print("Enter account number: ");
                    Ac_no = sc.nextInt();
                    System.out.println("Enter amount you want to Withdraw");
                    amount = sc.nextFloat();
                    for (int i = 0; i < n; i++) {
                        if (accounts[i].getAccountno() == Ac_no) {
                            accounts[i].withdraw(accounts[i].getAccountno(), amount);
                            System.out.println("Your Account is debitted with Rs" + amount);
                            System.out.println(
                                    "Available Balance :" + accounts[i].getBalance(accounts[i].getAccountno()));
                            break;
                        }

                    }

                case 7:
                    enter = false;
                    break;

                default:
                    System.out.println("Wrong Choice!");
                    break;
            }

        }
        sc.close();

    }
}

class Account {
    Scanner sc = new Scanner(System.in);
    private int accountNumber;
    private String accountType;
    private String serviceBranchIFSC;
    private float minimumBalance;
    private float availableBalance;
    private int customerID;
    public String customerName;
    public static int totalAccountsCreated;

    Account() {
        accountNumber = 0;
        accountType = null;
        serviceBranchIFSC = null;
        minimumBalance = 0;
        availableBalance = 0;
        customerID = 0;
        customerName = null;
        totalAccountsCreated++;
        array.add(accountNumber);
        array.add(accountType);
        array.add(serviceBranchIFSC);
        array.add(minimumBalance);
        array.add(availableBalance);
        array.add(customerID);
        array.add(customerName);

    }

    ArrayList<Object> array = new ArrayList<>();

    public void setDetails() {
        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();
        array.set(0, accountNumber);
        sc.nextLine();
        System.out.print("Enter account type: ");
        accountType = sc.nextLine();
        array.set(1, accountType);
        System.out.print("Enter service Branch IFSC: ");
        serviceBranchIFSC = sc.nextLine();
        array.set(2, serviceBranchIFSC);
        System.out.print("Enter minimum balance: ");
        minimumBalance = sc.nextFloat();
        array.set(3, minimumBalance);
        System.out.print("Enter current balance: ");
        availableBalance = sc.nextFloat();
        array.set(4, availableBalance);
        System.out.print("Enter customer ID: ");
        customerID = sc.nextInt();
        array.set(5, customerID);
        sc.nextLine();
        System.out.print("Enter customer name: ");
        customerName = sc.nextLine();
        array.set(6, customerName);
    }

    public void getDetails(int accountNo) {
        System.out.println("Account number: " + this.array.get(0));
        System.out.println("Account type: " + this.array.get(1));
        System.out.println("Service Branch IFSC: " + this.array.get(2));
        System.out.printf("Minimum balance: %.2f\n", this.array.get(3));
        System.out.printf("Available balance: %.2f\n", this.array.get(4));
        System.out.println("Customer ID: " + this.array.get(5));
        System.out.println("Customer name: " + this.array.get(6));

    }

    public void updateDetails(int accountNo) {
        boolean temp = true;
        while (temp) {
            System.out.println("Press 1 to update customerID");
            System.out.println("Press 2 to update minimumBalance");
            System.out.println("Press 3 to update accountType");
            System.out.println("Press 4 to update serviceBranchIFSC");
            System.out.println("Press 5 to update customerName");
            System.out.println("Press 6 to exit");
            System.out.println("Enter Choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    customerID = sc.nextInt();
                    array.set(5, customerID);
                    break;
                case 2:
                    minimumBalance = sc.nextFloat();
                    array.set(3, minimumBalance);
                    break;
                case 3:
                    accountType = sc.nextLine();
                    array.set(1, accountType);
                    break;
                case 4:
                    serviceBranchIFSC = sc.nextLine();
                    array.set(2, serviceBranchIFSC);
                    break;
                case 5:
                    customerName = sc.nextLine();
                    array.set(6, customerName);
                    break;
                case 6:
                    temp = false;
                default:
                    System.out.println("Wrong Choice!");

            }

        }
    }

    public float getBalance(int accountNo) {
        return (float) array.get(4);
    }

    public int getAccountno() {
        return (int) array.get(0);
    }

    public void deposit(int accountNo, float amount) {
        availableBalance += amount;
        System.out.printf("Available Balance : %.2f", availableBalance);
        array.set(4, availableBalance);
        System.out.println();
    }

    public void withdraw(int accountNo, float amount) {
        if (availableBalance < minimumBalance)
            System.out.println("Sorry!, minimum balance reached.");
        else
            availableBalance -= amount;
        this.array.set(4, availableBalance);
    }

}
