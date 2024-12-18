package entity;

public class RollerCoaster extends Attraction {


    public RollerCoaster() {
        super("RollingCoaster", 8, 1.40, 6, 18, 0, 0, 520);
    }

    @Override
    public void useAttraction(User user, double entranceFee) {
        super.useAttraction(user, entranceFee);
    }

    @Override
    public void maintenance(int userInUseCount) {
        int maxUsers = 500;

        if (userInUseCount > maxUsers) {
            System.out.println("In maintenance");
            super.maintenance(userInUseCount);
        } else {
            System.out.println("Maintenance not needed yet.");
        }
    }

    public void paintRollerCoaster(int userInUseCount, double entranceFee){
        double m = 0;
        double totalRevenue = entranceFee * userInUseCount;

        if(totalRevenue < 600){
            m = totalRevenue/10;
            System.out.println("The can be painted this qty of meters: " + m);
        } else {
            System.out.println("It can be printed whole attraction");
        }
    }
}
