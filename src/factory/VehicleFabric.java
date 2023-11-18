package factory;

public class VehicleFabric {
    public static Vehicle getVehicle(String modelName, Double motor, String type) {
        Vehicle vehicle;
        if ("Car".equalsIgnoreCase(modelName)) {
            vehicle = new Car(modelName, motor, type);
        } else if ("Motorcycle".equalsIgnoreCase(modelName)) {
            vehicle = new Motorcycle(modelName, motor, type);
        } else throw new RuntimeException("Not Found:");
        return vehicle;
    }

}
