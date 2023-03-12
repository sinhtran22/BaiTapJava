package Quanlyhocsinh;
import java.util.ArrayList;

public class School {
	
	private String tenLop;
	private ArrayList<Student> Hocsinh;
	
	public School(String tenLop) {
		this.tenLop = tenLop;
		Hocsinh = new ArrayList<>();
	}
	
	public void addHS(Student hocsinh) {
		Hocsinh.add(hocsinh);
	}
	
	public void show_listHS() {
		System.out.println("Lop " + tenLop + " gom cac hoc sinh sau: ");
        for (Student hocsinh : Hocsinh) {
            System.out.println(hocsinh);
        }
	}
	
	public void show_listHS20() {
        System.out.println("Danh sach hoc sinh 20 tuoi la:");
        for (Student hocsinh : Hocsinh) {
            if (hocsinh.getTuoi() == 20) {
                System.out.println(hocsinh);
            }
        }
    }
	
	public int demSoLuongHSTheoDieuKien(int tuoi, String queQuan) {
        int count = 0;
        for (Student hocSinh : Hocsinh) {
            if (hocSinh.getTuoi() == 23 && hocSinh.getQueQuan().equals("Da Nang")) {
                count++;
            }
        }
        return count;
    }
}
