package testVisibility;

public class MachineType {    private String machineType;
private double price;

public MachineType(String machineType, double price) {
    this.machineType = machineType;
    this.price = price;
}

public String getMachineType() {
    return machineType;
}

public double getPrice() {
    return price;
}


public String toString() {
    return "Type: " + machineType + ", Price: " + price;
}
}


