package entity;

public class HorrorHouse extends Attraction {

    // Constructor que pasa los valores específicos de HorrorHouse al constructor de Attraction
    public HorrorHouse() {
        super("HorrorHouse", 5.0, 1.10, 4, 18, 0, 0, 850);
    }

    @Override
    public void useAttraction(User user, double entranceFee) {
        super.useAttraction(user, entranceFee);
    }

    @Override
    public void maintenance(int userInUseCount) {
        if (userInUseCount >= 2000) {
            super.maintenance(userInUseCount);
        } else {
            System.out.println("Maintenance not needed yet.");
        }
    }

    // Método adicional para manejar el descanso y el reparto de agua
    public String breakTime(int userInUseCount, double entranceFee, double revenue) {
        double totalRevenue = (userInUseCount * entranceFee) + revenue;

        int workers = 8; // Número de trabajadores que consumen agua
        double costPerWater = 0.5; // Costo por botella de agua
        double totalWaterCostPerBreak = workers * costPerWater; // Costo total de agua por descanso

        int breaks = userInUseCount / 10; // Cada 10 actuaciones se toma un descanso
        double totalWaterCost = breaks * totalWaterCostPerBreak; // Costo total del agua para todos los descansos

        if (totalWaterCost <= totalRevenue) {
            return "Se han repartido " + (breaks * workers) + " aguas.";
        } else {
            return "No queda agua.";
        }
    }
}
