package parkinglot;
/**The ParkingLot is a class
 * Is has freeParking and totalParking
 * @author Wichanart,Supapit,Phenpitcha
 */
public class ParkingLot {

    private int freeParking;
    private int totalParking;

    /**@param totalParking get number of total parking 
     * @param freeParking get number of free parking
        
    */
    public ParkingLot(int totalParking, int freeParking) {
        this.totalParking = totalParking;
        this.freeParking = freeParking;
    }

    /** @return free parking
     */
    public int getFreeParking() {
        return this.freeParking;
    }
    
    /**@param a set number of free parking
     */
    public void setFreeParking(int a) {
        this.freeParking = a;
    }
    
    /**@param a set number of total parking
     */
    public void setTotalParking(int a) {
        this.totalParking = a;
    }

    /** @return total parking
     */
    public int getTotalParking() {
        return totalParking;
    }
     /**This method is count car in, 
      * 
      */
    public void countCarInSide() {

        if (this.freeParking - 1 >= 0 && this.freeParking <= this.totalParking) {
            this.freeParking = this.freeParking - 1;
            this.showFreePark();
        } else {
            System.out.println("You should check car parking, You can Reset(4) or Restart(5)");
        }
    }

    public void countCarOutSide() {
        if (this.freeParking + 1 >= 0 && this.freeParking < this.totalParking) {
            this.freeParking = this.freeParking + 1;
            this.showFreePark();
        } else {
            System.out.println("You should check car parking, You can Reset(4) or Restart(5)");
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
        System.out.println("Again please");
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