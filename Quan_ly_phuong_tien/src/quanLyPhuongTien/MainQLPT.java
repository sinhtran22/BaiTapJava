package quanLyPhuongTien;

import java.util.List;
import java.util.Map;

import java.util.Map;

public class MainQLPT {

	public static void main(String[] args) {
		VehicleManagement ql = new VehicleManagement();

		ql.addVehicle(new Car("29-C1", "Yamaha", 2002, "Yellow", new Owner("12345", "Truong Tuan Tu", "akhe@gmail.com"), 4, "gasoline"));
		ql.addVehicle(new Car("43-C1", "Toyota", 1998, "Red", new Owner("23456", "Phung Thanh Do", "ekha@gmail.com"), 6, "diesel"));
		ql.addVehicle(new Car("29-C1", "Honda", 2000, "Green", new Owner("34567", "Ho Quang Hieu", "kdek@gmail.com"), 12, "diesel"));
		ql.addVehicle(new Motobike("56-B2", "Yamaha", 2005, "Black", new Owner("45678", "Nguyen Tan Dat", "ank@gmail.com"), 160));
		ql.addVehicle(new Motobike("25-Y1", "Honda", 1999, "Pink", new Owner("56789", "Bao Thanh Thien", "ctn@gmail.com"), 125));
		ql.addVehicle(new Motobike("92-F1", "Yamaha", 1993, "Green", new Owner("67891", "Tran Viet Sinh", "tkdemm@gmail.com"), 150));
		ql.addVehicle(new Truck("67-H1", "Suzuki", 2000, "Blue", new Owner("78910", "Nguyen Hoang Long", "btck@gmail.com"), 2000));
		ql.addVehicle(new Truck("26-C1", "Suzuki", 1998, "White", new Owner("34567", "Nguyen Lam Khue", "nmte@gmail.com"), 5000));
		ql.addVehicle(new Truck("92-G1", "Toyota", 2001, "Gray", new Owner("91011", "Le Cong Huy", "mtnm@gmail.com"), 10000));
		
	    Vehicle v1 = ql.findByLicenseNumber("92-F1");
	    System.out.println("2 - Phuong tien tim theo so xe: ");
	    System.out.println("- Số xe: " + v1.getLicenseNumber());
	    System.out.println("- Nhà sản xuất: " + v1.getManufacturer());
	    System.out.println("- Năm sản xuất: " + v1.getYear());
	    System.out.println("- Màu xe: " + v1.getColor());
	    
	    System.out.println("---------------------------");
	    List<Vehicle> v2 = ql.findByID("34567");
	    System.out.println("3 - Tim PTGT cua chu xe co so CMND tuong ung: " + v2.size());
	    
	    System.out.println("----------------------------------------");
	    System.out.println("4 - So luong phuong tien truoc khi xoa: " + ql.getVehicles().size());
	    ql.xoaPTGTCuaNSX("Honda");
	    System.out.println("So luong phuong tien sau khi xoa: " + ql.getVehicles().size());
	    System.out.println("----------------------------------------");
	    
        System.out.println("6 - Danh sach cac phuong tien giao thong theo so xe giam dan: ");
	    ql.sortByLicenseNumber();

	}

}