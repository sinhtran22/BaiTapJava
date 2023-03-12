package ChuyenTien;

public class MainChuyenTien {
    public static void main(String[] args) {

        Account accountA = new Account("A001", "Sinh", 5000000);
        Account accountB = new Account("B001", "Khue", 1000000);


        System.out.println("Tài khoản " + accountA.name + ": " + accountA.balance);
        System.out.println("Tài khoản " + accountB.name + ": " + accountB.balance);


        accountA.credit(1000000);


        accountA.debit(2000000);


        accountA.transferTo(accountB, 3000000);


        System.out.println("Tài khoản " + accountA.name + ": " + accountA.balance);
        System.out.println("Tài khoản " + accountB.name + ": " + accountB.balance);
    }
}