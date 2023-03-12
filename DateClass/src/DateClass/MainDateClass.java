package DateClass;
import java.util.Scanner;

public class MainDateClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao gia tri Nam: ");
		int year = input.nextInt();

		System.out.println("Nhap vao gia tri Thang: ");
		int month = input.nextInt();

		System.out.println("Nhap vao gia tri Ngay: ");
		int day = input.nextInt();
		
		CheckDateClass data = new CheckDateClass(year, month, day);
	    data.CheckNamNhuan(year, month, day);
	}

}
