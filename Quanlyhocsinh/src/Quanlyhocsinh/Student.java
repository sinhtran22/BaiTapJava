package Quanlyhocsinh;

public class Student {
	
	private String hoten;
	private int tuoi;
	private String quequan;

	public Student(String hoten, int tuoi, String quequan) {
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.quequan = quequan;
	}

	public String getHoTen() {
		return hoten;
	}

	public void setHoTen(String hoten) {
		this.hoten = hoten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getQueQuan() {
		return quequan;
	}

	public void setQueQuan(String queQuan) {
		this.quequan = quequan;
	}
	
	@Override
    public String toString() {
        return "- Ho ten: " + hoten + " | Tuoi: " + tuoi + " | Que quan: " + quequan;
    }

}
