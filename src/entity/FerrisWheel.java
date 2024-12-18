package entity;

public class FerrisWheel extends Attraction {


    public FerrisWheel() {
        super("FerrisWheell", 4, 1.20, 2, 18, 0, 0, 850);
    }

    @Override
    public void useAttraction(User user, double entranceFee) {
        super.useAttraction(user, entranceFee);
    }

    @Override
    public void maintenance(int userInUseCount) {
        if (userInUseCount >= 1200) {
            super.maintenance(userInUseCount);
        } else {
            System.out.println("Maintenance not needed yet.");
        }
    }

    public void photo ( int userInCount, double entranceFee, double revenue){
        double totalRevenue = userInCount * entranceFee; // Ingresos totales por entradas

        if (userInCount == 4) {
            double photoRevenue = 5; // Ingresos adicionales por fotos
            double totalWithPhotos = totalRevenue + photoRevenue + revenue; // Ingresos totales con fotos
            double photoPercentage = (photoRevenue / totalWithPhotos) * 100; // Porcentaje de ingresos por fotos

            System.out.println("Total revenue with photos: " + totalWithPhotos);
            System.out.println("Photos represent " + photoPercentage + "% of the total revenue.");
        } else {
            System.out.println("No photos this time.");
        }
    }

}
