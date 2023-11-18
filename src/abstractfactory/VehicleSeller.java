package abstractfactory;

public class VehicleSeller {
    public static void main(String[] args) {
        CarFactory carFactory=new CarFactory();
        Vehicle car=carFactory.getVehicle("car",2.4,"sedan");
        System.out.println(car);
    }
}
