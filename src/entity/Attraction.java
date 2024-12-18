package entity;

public abstract class Attraction {

    private String name;
    private double entranceFee;
    private double minHeight;
    private int maximumCapacity;
    private int minAge;
    private int userInUse;
    private int userInUseCount = 0;
    private double revenue;

    public Attraction() {

    }

    public Attraction(String name, double entranceFee, double minHeight, int maximumCapacity, int minAge, int userInUse, int userInUseCount, double revenue) {
        this.name = name;
        this.entranceFee = entranceFee;
        this.minHeight = minHeight;
        this.maximumCapacity = maximumCapacity;
        this.minAge = minAge;
        this.userInUse = userInUse;
        this.userInUseCount = userInUseCount;
        this.revenue = 0;
    }

    public boolean isValid(User user) {
        if (user.getHeight() >= minHeight && user.getBudget() >= entranceFee) {
            System.out.println("User is valid, can take the attraction");
            return true;
        }
        return false;
    }


    public void useAttraction(User user, double entranceFee) {
        if (isValid(user)) {
            user.leftBudget(entranceFee); // Llamamos al método que resta el presupuesto
            userInUse++;
            userInUseCount++;
            System.out.println("User with name: " + user.getName() +
                    " is using the attraction: " + name +
                    " and selected attraction: " + user.getSelectedAttraction());
        } else {
            System.out.println("The user with name: " + user.getName() +
                    " can't use this attraction: " + name);
        }
    }


    /**
     * En el método se mostrará el nombre de la atracción,
     * el número de usuarios que han utilizado la atracción y la cantidad de dinero
     * ganada en esta atracción.
     */
    public void maintenance(int userInUseCount) {

        int qtyUserTotal = this.userInUseCount;
        double totalRevenue = qtyUserTotal * entranceFee;

        System.out.println("Attraction: " + name);
        System.out.println("Total users: " + qtyUserTotal);
        System.out.println("Total revenue: " + totalRevenue);

    }

    public double getEntranceFee() {
        return entranceFee;
    }

}
