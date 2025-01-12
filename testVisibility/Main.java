package testVisibility;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean continueChoosing = true;
    public static void main(String[] args) {
        ArrayList<MachineType> lyMachineTypes = new ArrayList<>();
        ArrayList<MachineType> onMachineTypes = new ArrayList<>();

        MachineType washingMachineType = new MachineType("Washing machine", 50);
        MachineType dryingMachineType = new MachineType("Drying machine", 60);

        Shop washing = new Shop("Washing Type", lyMachineTypes);
        Shop Drying = new Shop("Drying Type", onMachineTypes);

        Machine W1 = new Machine("1", "Used", washingMachineType);
        Machine W2 = new Machine("2", "Free", washingMachineType);
        Machine W3 = new Machine("3", "Free", washingMachineType);
        Machine W4 = new Machine("4", "Free", washingMachineType);
        Machine W5 = new Machine("5", "Free", washingMachineType);
        
        Machine D1 = new Machine("1", "Used", dryingMachineType);
        Machine D2 = new Machine("2", "Free", dryingMachineType);
        Machine D3 = new Machine("3", "Used", dryingMachineType);
        Machine D4 = new Machine("4", "Free", dryingMachineType);
        Machine D5 = new Machine("5", "Free", dryingMachineType);

       /* onMachineTypes.add(new Machine("1", "Used", washingMachineType));*/
         washing.addMachine(W1);
         washing.addMachine(W2);
         washing.addMachine(W3);
         washing.addMachine(W4);
         washing.addMachine(W5);

         Drying.addMachine(D1);
         Drying.addMachine(D2);
         Drying.addMachine(D3);
         Drying.addMachine(D4);
         Drying.addMachine(D5);

        boolean continueChoosing = true;
            System.out.println("Welcome to the washing HOUSE");
        while (continueChoosing) {
            
            System.out.println("Choose machine type:");
            System.out.println("1. Washing machine");
            System.out.println("2. Drying machine");
            System.out.println("3. Display all machines");
            System.out.println("4. Exchange coins");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayMachine(washing);
                  
                    continueChoosing = WashingMachine(washing);
                    
                    
                    break;
                case 2:
                    displayMachine(Drying);
                    continueChoosing = WashingMachine(Drying);
                    
                    break;
                case 3:
                    displayMachines(washing);
                    displayMachines(Drying);
                     
                        char y;
                        System.out.print("Do you want to chose again(y/n): ");
                         y = scanner.next().charAt(0);
                    if(y=='Y'||y=='y'){
                        continueChoosing = true;
                    }else if(y=='N'||y=='n'){
                        continueChoosing = false;
                    }
                    break;
                case 4:
                    System.out.println("How much do you want to exchange?");
                    int coinsToExchange = scanner.nextInt();
                    int sum = coinsToExchange / 10;
                    System.out.println("Coins exchanged successfully! You exchanged " + sum + " coins.");
                    break;
                case 5:
                    continueChoosing = false;
                    System.out.println("Exiting the washing HOUSE. Goodbye!");
                    break;
                default:
                    System.out.println("Please choose again.");
                    break;
            }
        }
    }

    public static void displayMachineTypes(Shop shop) {
        System.out.println("" + shop.getShopName() + ":");
        for (MachineType machineType : shop.getMachineTypes()) {
            System.out.println(machineType);
        }
    }

    public static void displayMachines(Shop shop) {
        System.out.println("All Machines in " + shop.getShopName() + ":");
        for (Machine machine : shop.getMachines()) {
            System.out.println(machine);
        }
    }

    public static void displayMachine(Shop shop) {
        ArrayList<MachineType> machineTypes = shop.getMachineTypes();
        System.out.println("Machine " + shop.getShopName() + ":");
        for (Machine machine : shop.getMachines()) {
            System.out.println(machine);
        }
    }
     public static boolean WashingMachine(Shop shop) {
    boolean way = true;
    while (way) {
        System.out.println("Choose a washing machine :");

        int machineChoice = scanner.nextInt();

        if (machineChoice >= 1 && machineChoice <= shop.getMachines().size()) {
            Machine selectedMachine = shop.getMachines().get(machineChoice - 1);

            if (selectedMachine.getStatus().equals("Free")) {
                System.out.println("You selected: " + selectedMachine);
                System.out.println("Start washing Machine: " + selectedMachine.getMachineId() +
                        " Price: " + selectedMachine.getType().getPrice());
                System.out.println("Do you want to start? y/n");
                char startChoice = scanner.next().charAt(0);

                if (startChoice == 'y' || startChoice == 'Y') {
                    System.out.println("Washing cycle started.");
                    continueChoosing = false;
                    way = false;
                     
                } else {
                    System.out.println("You chose not to start the washing cycle. Choose again? y/n");
                    char chooseAgain = scanner.next().charAt(0);
                    if (!(chooseAgain == 'y' || chooseAgain == 'Y')) {
                        way = false;
                    }
                }
            } else {
                System.out.println("Sorry, the machine is in use. Please choose again.");
            }
        } else {
            System.out.println("Invalid choice. Please enter a valid machine number.");
        }
    }
    return continueChoosing;
}
}

