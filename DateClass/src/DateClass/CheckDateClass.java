package DateClass;

public class CheckDateClass {
	private int year;
	private int month;
	private int day;

	public CheckDateClass(int year, int month, int day) {
		if (year <= 0 || month <= 0 || month > 12 || (day <= 0 && day > 31)) {
			System.out.println("Gia tri ngay thang nam khong hop le.");
			return;
		}
		System.out.println("Gia tri ngay thang nam nhap vao hop le.");
	}

	public void CheckNamNhuan(int year, int month, int day) {
		if (month == 2 && year % 4 == 0 || year % 400 == 0) {
			if (day == 29) {
				System.out.println("Nam " + year + " la nam nhuan.");
				return;
			}
			if (day > 29) {
				System.out.println("Gia tri ngay thang nam khong hop le.");
				return;
			}
			System.out.println("Nam " + year + " Khong phai la nam nhuan.");
		}

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day > 31) {
				System.out.println("Gia tri ngay thang nam khong hop le.");
				return;
			}
			System.out.println("Nam " + year + " Khong phai la nam nhuan.");
			System.out.println("Ngay sinh cua ban la: " + year + "/" + month + "/" + day);
			return;
		}
		if (day > 30) {
			System.out.println("Gia tri khong hop le.");
			return;
		}
		System.out.println("Nam " + year + " Khong phai la nam nhuan.");
		System.out.println("Ngay sinh cua ban la: " + year + "/" + month + "/" + day);
		return;
	}

}