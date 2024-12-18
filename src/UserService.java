import entity.*;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    public static final List<User> users = new ArrayList<>();

    public static void createUser(String name, double budget, int age, double height) {
        User user = new User(name, budget, age, height);
        users.add(user);
        System.out.println("The user was created successfully: " + user);
    }

    public static void seeUsers() {
        if (users.isEmpty()) {
            System.out.println("No users to show up");
        } else {
            for (User u : users) {
                System.out.println(u);
                System.out.println("ID: " + u.getId() + ", Name: " + u.getName() + ", Budget: " + u.getBudget());
            }
        }
    }

    public static void deleteUser(int idToDelete) {
        boolean userFound = false;
        for (User user : users) {
            if (idToDelete == user.getId()) {
                users.remove(user);
                System.out.println("User with ID " + idToDelete + " deleted.");
                userFound = true;
                break; // Salimos del bucle después de eliminar el usuario
            }
        }
        if (!userFound) {
            System.out.println("There is no user with this ID: " + idToDelete);
        }
    }

    public static void increaseBudget(double increaseBudget, int idToIncrease) {
        boolean userFound = false;
        for (User user : users) {
            if (idToIncrease == user.getId()) {
                user.setBudget(user.getBudget() + increaseBudget);
                System.out.println("Budget was increased for user: " + idToIncrease + ". Updated budget: " + user.getBudget());
                userFound = true;
                break;
            }
        }
        if (!userFound) {
            System.out.println("There is no user with this ID: " + idToIncrease);
        }
    }

    public static void takeOutBudget(double takeOutAmount, int idToTakeOut) {
        boolean userFound = false;
        for (User user : users) {
            if (idToTakeOut == user.getId()) {
                userFound = true;
                if (user.getBudget() >= takeOutAmount) {
                    user.setBudget(user.getBudget() - takeOutAmount);
                    System.out.println("Successfully withdrew " + takeOutAmount + " from user " + idToTakeOut + ". Updated budget: " + user.getBudget());
                } else {
                    System.out.println("There is not enough money to give back.");
                }
                break;
            }
        }
        if (!userFound) {
            System.out.println("There is no user with this ID: " + idToTakeOut);
        }
    }

    public static void choseAttraction(int attractionToUse, int idAttractionToAssign) {
        for (User user : users) {
            if (idAttractionToAssign == user.getId()) {
                switch (attractionToUse) {
                    case 1:
                        System.out.println("You have chosen: RollingCoaster");
                        RollerCoaster rollerCoaster = new RollerCoaster();
                        user.setSelectedAttraction(rollerCoaster); // Asigna la atracción al usuario
                        rollerCoaster.useAttraction(user, 8); // Pasa el usuario y la entrada al método
                        break;
                    case 2:
                        System.out.println("You have chosen: FerrisWheel");
                        FerrisWheel ferrisWheel = new FerrisWheel();
                        user.setSelectedAttraction(ferrisWheel); // Asigna la atracción al usuario
                        ferrisWheel.useAttraction(user, 4); // Pasa el usuario y la entrada al método
                        break;
                    case 3:
                        System.out.println("You have chosen: HorrorHouse");
                        HorrorHouse horrorHouse = new HorrorHouse();
                        user.setSelectedAttraction(horrorHouse); // Asigna la atracción al usuario
                        horrorHouse.useAttraction(user, 5); // Pasa el usuario y la entrada al método
                        break;
                    case 4:
                        System.out.println("You have chosen: Horses");
                        Horses horses = new Horses();
                        user.setSelectedAttraction(horses); // Asigna la atracción al usuario
                        horses.useAttraction(user, 2); // Pasa el usuario y la entrada al método
                        break;
                    default:
                        System.out.println("Try one more time: 1-4");
                }
                break; // Sale del bucle después de encontrar al usuario
            }
        }
    }

    public static void checkMaintanance() {
        System.out.println("Checked, all is ok.");
    }
}
