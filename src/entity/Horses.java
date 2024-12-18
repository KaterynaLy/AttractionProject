package entity;

public class Horses extends Attraction {


    public Horses() {
        super("Horses", 2, 0.9, 20, 2, 0, 0, 699);
    }

    @Override
    public void useAttraction(User user, double entranceFee) {
        super.useAttraction(user, entranceFee);
    }

    @Override
    public void maintenance(int userInUseCount) {
        if(userInUseCount >= 700) {
            super.maintenance(userInUseCount);
        } else {
            System.out.println("Maintenance not needed yet.");
        }
    }


    /**
     * que mostrará el mensaje
     * "Se han limpiado XXX caballitos", teniendo en cuenta que la atracción tiene 20 caballitos y se limpia
     * completamente cada 50 personas que la utilizan.
     */
    public void cleanAttraction(int userInUseCount){
        if(userInUseCount == 50) {
            System.out.println("It was 20 horses cleaned");
        }
        System.out.println();
    }
}
