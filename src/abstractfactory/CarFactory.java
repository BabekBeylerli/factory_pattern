package abstractfactory;

public class CarFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String modelName, Double motor, String type) {
        return new Car(modelName,motor,type);
    }
}
