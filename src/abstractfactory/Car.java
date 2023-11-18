package abstractfactory;

public class Car implements Vehicle {
    private String modelName;
    private Double motor;
    private String type;

    public Car(String modelName, Double motor, String type) {
        this.modelName = modelName;
        this.motor = motor;
        this.type = type;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public Double getMotor() {
        return motor;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", motor=" + motor +
                ", type='" + type + '\'' +
                '}';
    }
}
