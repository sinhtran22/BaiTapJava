package dongvatvasukethua;

public class MainAnimal {

	public static void main(String[] args) {
		System.out.println("Thong tin cua cho: ");
		Dog dog1 = new Dog("Golden", 4, "Male", "Brown", 8);
		dog1.hienThiThongTin();
		
		System.out.println("------------------------");
		
		System.out.println("Thong tin cua meo: ");
		Cat cat1 = new Cat("Meo Anh long dai", 3, "Female", "Yellow", 4);
		cat1.hienThiThongTin();
	}

}
