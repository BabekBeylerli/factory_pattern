package factory;
public class VehicleSeller {
    public static void main(String[] args) {
        Vehicle car = VehicleFabric.getVehicle("Car", 2.4, "sedan");
        Vehicle motor = VehicleFabric.getVehicle("Motorcycle", 0.4, "sass");

        System.out.println("car : ");
        System.out.println(car);
        System.out.println("motor: ");
        System.out.println(motor);
    }
}
