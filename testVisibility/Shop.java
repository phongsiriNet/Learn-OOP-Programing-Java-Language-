package testVisibility;
import java.util.ArrayList;
class Shop {
    private String shopName;
    private ArrayList<MachineType> machineTypes;
    private ArrayList<Machine> machines;

    public Shop(String shopName, ArrayList<MachineType> machineTypes) {
        this.shopName = shopName;
        this.machineTypes = machineTypes;
        this.machines = new ArrayList<>();
    }

    public String getShopName() {
        return shopName;
    }

    public ArrayList<MachineType> getMachineTypes() {
        return machineTypes;
    }

    public ArrayList<Machine> getMachines() {
        return machines;
    }

    public void addMachine(Machine machine) {
        machines.add(machine);
    }
}