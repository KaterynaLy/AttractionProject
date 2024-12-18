package entity;

public class User {
    private static int idCounter = 0; // Contador estático para generar IDs únicos
    private int id;
    private String name;
    private double budget;
    private int age;
    private double height;
    private Attraction selectedAttraction;


    public User(String name, double budget, int age, double height) {
        this.id = idCounter++; // Asigna un ID único e incrementa el contador
        this.name = name;
        this.budget = budget;
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        User.idCounter = idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Método en la clase User para restar el presupuesto
    public void leftBudget(double entranceFee) {
        if (budget >= entranceFee) {
            budget -= entranceFee;
            System.out.println("New budget after entrance fee: " + budget);
        } else {
            System.out.println("Not enough budget to pay for the entrance.");
        }
    }
    public Attraction getSelectedAttraction() {
        return selectedAttraction;
    }

    public void setSelectedAttraction(Attraction selectedAttraction) {
        this.selectedAttraction = selectedAttraction;
    }


}
