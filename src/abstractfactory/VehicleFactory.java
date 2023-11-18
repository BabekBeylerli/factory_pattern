package abstractfactory;

public interface VehicleFactory {
    Vehicle getVehicle(String modelName, Double motor, String type);
}
