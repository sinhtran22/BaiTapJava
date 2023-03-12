package ChuyenTien;
;
public class Account {
    private String id; 
    String name;
    int balance;


    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    public void credit(int amount) {
        if (amount > 0) {
            balance += amount; 
            System.out.println("Nạp tiền thành công. Số dư mới của tài khoản " +name+ " là " + balance);
        } else {
            System.out.println("Số tiền không hợp lệ. Nạp tiền thất bại.");
        }
    }


    public void debit(int amount) {
        if (amount < 0) { 
            System.out.println("Số tiền không hợp lệ. Thanh toán thất bại.");
        } else if (amount > balance) { 
            System.out.println("Số dư không đủ để thanh toán. Thanh toán thất bại.");
        } else {
            balance -= amount; 
            System.out.println("Thanh toán thành công. Số dư mới của tài khoản " +name+ " là " + balance);
        }
    }

    // Phương thức chuyển tiền từ tài khoản này sang tài khoản khác
    public void transferTo(Account account, int amount) {
        if (amount < 0) { // Kiểm tra số tiền chuyển phải là số dương
            System.out.println("Số tiền không hợp lệ. Chuyển tiền thất bại.");
        } else if (amount > balance) { // Kiểm tra số tiền chuyển không được lớn hơn số dư tài khoản
            System.out.println("Số dư không đủ để chuyển tiền. Chuyển tiền thất bại.");
        } else {
            balance -= amount; // Trừ số tiền khỏi số dư tài khoản của tài khoản nguồn
            account.credit(amount); // Nạp số tiền vào số dư tài khoản của tài khoản đích
            System.out.println("Chuyển tiền thành công. Số dư mới của " + name + " là " + balance +
                    ", số dư mới của " + account.name + " là " + account.balance);
        }
    }
}
