package FPP_std_prog_xm;
import java.util.ArrayList;
import java.util.List;

public class MilesCounter {
	public static List<Vehicle> convertArray(Object[] vehicleArray) {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		for(int i= 0; i<vehicleArray.length;i++) {
			vehicles.add((Vehicle)vehicleArray[i]);
			
		}
		return vehicles;
	}
	
	
	public static int computeTotalMiles(List <Vehicle> vehicleList) {
		int distanceTravelled = 0;
		
		for(int i=0; i<vehicleList.size();i++) {
			Vehicle vehicle = vehicleList.get(i);
			distanceTravelled += vehicle.getMilesUsedToday();
		}
		return distanceTravelled;
	}
}
