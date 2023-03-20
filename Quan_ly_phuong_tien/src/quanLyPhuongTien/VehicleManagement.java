package quanLyPhuongTien;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class VehicleManagement {
	
private List<Vehicle> vehicles;
    
    public VehicleManagement() {
        this.vehicles = new ArrayList<>();
    }
    
    public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	// Yeu cau 1 - Thêm phương tiện giao thông
    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }
    
    // Yeu cau 2 - Tìm kiếm phương tiện giao thông theo số xe
    public Vehicle findByLicenseNumber(String numberOfCar) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getLicenseNumber() == numberOfCar) {
                return vehicle;
            }
        }
        return null;
    }
    
    // Yeu cau 3 - Tìm phương tiện giao thông của chủ xe có số cmnd tương ứng
    public List<Vehicle> findByID(String idNumber) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getOwner().getIdNumber() == idNumber) {
                result.add(vehicle);
            }
        }
        return result;
    }
    
    // Yeu cau 4 - Xóa tất cả các phương tiện giao thông của một nhà sản xuất bất kỳ
    public void xoaPTGTCuaNSX(String manufacturer) {
    	for (int i = 0; i < vehicles.size(); i++) {
    		if (vehicles.get(i).getManufacturer() == manufacturer) {
    			vehicles.remove(i);
    		}
    	}
    }
    
    // Yeu cau 6 - Sắp xếp các phương tiện giao thông theo số xe giảm dần
    public void sortByLicenseNumber() {
        Collections.sort(vehicles);
        Collections.reverse(vehicles);
        for (Vehicle vehicle : vehicles) {
        	System.out.println(vehicle.getLicenseNumber());
    	}
    }
    
}