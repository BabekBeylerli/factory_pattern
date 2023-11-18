package abstractfactory;

public class MotorcycleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String modelName, Double motor, String type) {
        return new Motorcycle(modelName,motor,type);
    }
}
