package Quanlyhocsinh;

public class MainQLHS {

	public static void main(String[] args) {
		School school = new School("12A1");

        school.addHS(new Student("Tran Viet Sinh", 23, "Da Nang"));
        school.addHS(new Student("Tran Viet Shen", 23, "Da Nang"));
        school.addHS(new Student("Nguyen Thanh Duy", 20, "Quang Nam"));
        school.addHS(new Student("Lam Khue", 18, "Ha Noi"));
        school.addHS(new Student("Nguyen Huu Thinh", 26, "Dak Lak"));


        school.show_listHS();
        
        System.out.println("--------------------------------");

        school.show_listHS20();

        System.out.println("--------------------------------");

        int count = school.demSoLuongHSTheoDieuKien(23, "Da Nang");
        System.out.println("Co " + count + " hoc sinh 23 tuoi va que o Da Nang");
	}

}
