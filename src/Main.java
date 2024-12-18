import entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FerrisWheel ferrisWheel = new FerrisWheel();
        RollerCoaster rollerCoaster = new RollerCoaster();
        HorrorHouse horrorHouse = new HorrorHouse();
        Horses horses = new Horses();

        //Jordi, que mide 1.42 metros y tiene 40 euros.
        User user = new User("Jordi", 40.00, 40, 1.42);

        System.out.println("User Jordi se ha creado por defecto");
        user.setSelectedAttraction(horrorHouse);
        horrorHouse.useAttraction(user, horrorHouse.getEntranceFee());
        horrorHouse.maintenance(2000);

        User user1 = new User("Roman", 40.00, 40, 1.42);

        System.out.println("User Roman se ha creado por defecto");
        user1.setSelectedAttraction(ferrisWheel);
        ferrisWheel.useAttraction(user1, ferrisWheel.getEntranceFee());
        ferrisWheel.maintenance(2000);

        User user2 = new User("Ana", 50.00, 30, 1.65);

        System.out.println("User Ana se ha creado por defecto");
        user2.setSelectedAttraction(rollerCoaster);
        rollerCoaster.useAttraction(user2, rollerCoaster.getEntranceFee());
        rollerCoaster.maintenance(100);

        User user3 = new User("Carlos", 25.00, 25, 1.75);

        System.out.println("User Carlos se ha creado por defecto");
        user3.setSelectedAttraction(horrorHouse);
        horrorHouse.useAttraction(user3, horrorHouse.getEntranceFee());
        horrorHouse.maintenance(600);

        User user4 = new User("María", 60.00, 35, 1.60);

        System.out.println("User María se ha creado por defecto");
        user4.setSelectedAttraction(horses);
        horses.useAttraction(user4, horses.getEntranceFee());
        horses.maintenance(200);

        User user5 = new User("Pedro", 80.00, 45, 1.80);

        System.out.println("User Pedro se ha creado por defecto");
        user5.setSelectedAttraction(horrorHouse);
        horrorHouse.useAttraction(user5, horrorHouse.getEntranceFee());
        horrorHouse.maintenance(2000);

        UserService.users.add(user);
        UserService.users.add(user1);
        UserService.users.add(user2);
        UserService.users.add(user3);
        UserService.users.add(user4);
        UserService.users.add(user5);

        Scanner entrada = new Scanner(System.in);
/**
 * crear un usuario, ver usuarios, borrar un usuario, añadir saldo,
 * retirar saldo, utilizar una atracción (determinando cuál quiere disfrutar) y mantenimiento de una atracción.
 */
        int option = 0;
        while(option != 8){
            System.out.println(" --- Welcome to the main app menu ---");
            System.out.println("What would you like to do? Choose the option below:");
            System.out.println("Option 1: Create user");
            System.out.println("Option 2: See users");
            System.out.println("Option 3: Delete user");
            System.out.println("Option 4: Increase budget");
            System.out.println("Option 5: Take out budget");
            System.out.println("Option 6: Choose the attraction to use");
            System.out.println("Option 7: Check the maintenance");
            System.out.println("Option 8: Exit");

            option = entrada.nextInt();
            entrada.nextLine();

            switch (option){
                case 1:
                    System.out.println("Creating a new user...");
                    System.out.println("Assign the name: ");
                    String name = entrada.nextLine();
                    System.out.println("Assign the budget: ");
                    double budget = entrada.nextDouble();
                    System.out.println("Assign the age: ");
                    int age = entrada.nextInt();
                    System.out.println("Which is the height?");
                    double height = entrada.nextDouble();
                    UserService.createUser(name, budget, age, height);
                    break;
                case 2:
                    System.out.println("There are the users...");
                    UserService.seeUsers();
                    break;
                case 3:
                    System.out.println("Please, entre the id to delete: ");
                    int idToDelete = entrada.nextInt();
                    UserService.deleteUser(idToDelete);
                    break;
                case 4:
                    System.out.println("How much you would like to add?");
                    double increaseBudget = entrada.nextDouble();
                    System.out.println("Which user id?");
                    int idToIncrease = entrada.nextInt();
                    UserService.increaseBudget(increaseBudget, idToIncrease);
                    break;
                case 5:
                    System.out.println("Which amount you would like to take out?");
                    double takeoutAmount = entrada.nextDouble();
                    System.out.println("Which user id you would like to act?");
                    int idToTakeOut = entrada.nextInt();
                    UserService.takeOutBudget(takeoutAmount, idToTakeOut);
                    break;
                case 6:
                    System.out.println("Choose the attraction to use: 1/ RollerCoaster, 2/FerrisWheel, 3/HorrorHouse, 4/Hourses");
                    int attractionToUse = entrada.nextInt();
                    System.out.println("Whom is going to use it, please put the id:");
                    int idAttractionToAssign = entrada.nextInt();
                    UserService.choseAttraction(attractionToUse, idAttractionToAssign);
                    break;
                case 7:
                    System.out.println("Check the maintance...");
                    UserService.checkMaintanance();
                    break;
                case 8:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option. Please put the number, only number from 1 to 8");
            }
        }
        entrada.close();

    }
}