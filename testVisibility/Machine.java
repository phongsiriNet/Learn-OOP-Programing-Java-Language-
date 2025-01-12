package testVisibility;

public class Machine {
    private String machineId;
    private String status;
    private MachineType type;

    public Machine(String machineId, String status, MachineType type) {
        this.machineId = machineId;
        this.status = status;
        this.type = type;
    }

    public String getMachineId() {
        return machineId;
    }

    public MachineType getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Machine ID: " + machineId + ", Type: " + type.getMachineType() + ", Status: " + status;
    }
}