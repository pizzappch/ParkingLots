package parkinglot;

import java.sql.Time;
import java.util.Scanner;

 

public class ServiceCharge {

    private int costWhenOverFreeForTwoWheel = 10;
    private int costWhenOverFreeForThreeWheel = 30;
    private int costWhenOverFreeForFourWheel = 30;

    public int getCostWhenOverFreeForTwoWheel() {
        return costWhenOverFreeForTwoWheel;
    }

    public int getCostWhenOverFreeForThreeWheel() {
        return costWhenOverFreeForThreeWheel;
    }

    public int getCostWhenOverFreeForFourWheel() {
        return costWhenOverFreeForFourWheel;
    }
    
    public void setCostWhenOverFreeForTwoWheel(int costWhenOverFreeForTwoWheel) {
        this.costWhenOverFreeForTwoWheel = costWhenOverFreeForTwoWheel;
    }

 

    public void setCostWhenOverFreeForThreeWheel(int costWhenOverFreeForThreeWheel) {
        this.costWhenOverFreeForThreeWheel = costWhenOverFreeForThreeWheel;
    }

 

    public void setCostWhenOverFreeForFourWheel(int costWhenOverFreeForFourWheel) {
        this.costWhenOverFreeForFourWheel = costWhenOverFreeForFourWheel;
    }

 

    public float getCost(Time t, int numberWheels) {
        float cost = 0;
        Time latestTime = new Time(System.currentTimeMillis());
        System.out.println("latestTime:"+latestTime.toString());
        System.out.println("Time of car in:"+t.toString());

                int wn = -1;
                Scanner sc = new Scanner(System.in);
                while (wn != 2 && wn != 3 && wn != 4) {
                    System.out.println("Please Check Wheels again!!");
                    System.out.print("How many wheel for this car?:");
                    wn = sc.nextInt();
                    switch (wn) {
                        case 2: cost = this.getCostWhenOverFreeForTwoWheel();
                            break;

                        case 3: cost = this.getCostWhenOverFreeForFourWheel();
                            break;

                        case 4:
                                cost = this.getCostWhenOverFreeForFourWheel();
                            break;

                        default:                                
                            break;
                    }
        }
        return cost;

 

    }
}