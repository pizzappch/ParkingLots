
public class ParkingLot {

    private int freeParking;
    private int totalParking;


    public ParkingLot(int totalParking, int freeParking) {
        this.totalParking = totalParking;
        this.freeParking = freeParking;
    }

    public ParkingLot(int a) {
        this.totalParking = a;
        this.freeParking = a;
    }

    public int getFreeParking() {
        return this.freeParking;
    }

    public void setFreeParking(int a) {
        this.freeParking = a;
    }

    public void setTotalParking(int a) {
        this.totalParking = a;
    }

    public int getTotalParking() {
        return totalParking;
    }

    public void countCarInSide() {

        if (this.freeParking - 1 >= 0 && this.freeParking <= this.totalParking) {
            this.freeParking = this.freeParking - 1;
            this.showFreePark();
        } else {
            System.out.println("You should check car parking");
        }
    }

    public void countCarOutSide() {
        if (this.freeParking + 1 >= 0 && this.freeParking < this.totalParking) {
            this.freeParking = this.freeParking + 1;
            this.showFreePark();
        } else {
            System.out.println("You should check car parking");
        }
    }

    public void showFreePark() {
        System.out.println("(Show on Board)Free Parking : " + this.freeParking);
        System.out.println("(Show on admin's PC)Free Parking : " + this.freeParking);
    }

    public void shutDown() {
        System.out.println("Shut down");
    }

    public void reset() {
        System.out.println("Reset");
        this.freeParking = totalParking;

    }

    public void error() {
        System.out.println("Again,please");
    }

    public void restart(int totalParking1, int freeParking1) {
        System.out.println("Restart");
        this.totalParking = totalParking1;
        this.freeParking = freeParking1;
    }

    public void start() {
        System.out.println("Start");
        this.freeParking = this.totalParking;

    }

    @Override
    public String toString() {
        return "ParkingLots2{" + "freeParking=" + freeParking + ", totalParking=" + totalParking + '}';
    }

}
