package quanLyPhuongTien;

import java.util.List;
import java.util.Map;

import java.util.Map;

public class MainQLPT {

	public static void main(String[] args) {
		VehicleManagement ql = new VehicleManagement();

		ql.addVehicle(new Car("29534", "Yamaha", 2015, "Yellow", new Owner("123456789123", "Truong Tuan Tu", "akhe@gmail.com"), 4, "gasoline"));
		ql.addVehicle(new Car("43222", "Toyota", 2017, "Red", new Owner("234567234567", "Phung Thanh Do", "ekha@gmail.com"), 6, "diesel"));
		ql.addVehicle(new Car("29657", "Honda", 2023, "Green", new Owner("345678345678", "Ho Quang Hieu", "kdek@gmail.com"), 12, "diesel"));
		ql.addVehicle(new Motobike("56123", "Yamaha", 2021, "Black", new Owner("456789456789", "Nguyen Tan Dat", "ank@gmail.com"), 160));
		ql.addVehicle(new Motobike("25498", "Honda", 2022, "Pink", new Owner("567891567891", "Bao Thanh Thien", "ctn@gmail.com"), 125));
		ql.addVehicle(new Motobike("92524", "Yamaha", 2018, "Green", new Owner("678910678910", "Tran Viet Sinh", "tkdemm@gmail.com"), 150));
		ql.addVehicle(new Truck("67007", "Suzuki", 2019, "Blue", new Owner("789101789101", "Nguyen Hoang Long", "btck@gmail.com"), 2000));
		ql.addVehicle(new Truck("26309", "Suzuki", 2021, "White", new Owner("345679345679", "Nguyen Lam Khue", "nmte@gmail.com"), 5000));
		ql.addVehicle(new Truck("92126", "Toyota", 2020, "Gray", new Owner("910111910111", "Le Cong Huy", "mtnm@gmail.com"), 10000));
		
	    Vehicle v1 = ql.findByLicenseNumber("92524");
	    System.out.println("2 - Phuong tien tim theo so xe: ");
	    System.out.println("- Số xe: " + v1.getLicenseNumber());
	    System.out.println("- Nhà sản xuất: " + v1.getManufacturer());
	    System.out.println("- Năm sản xuất: " + v1.getYear());
	    System.out.println("- Màu xe: " + v1.getColor());
	    
	    System.out.println("---------------------------");
	    List<Vehicle> v2 = ql.findByID("345679345679");
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