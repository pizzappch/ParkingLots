package parkinglot;

import java.util.Scanner;
import java.sql.Time;



public class Vehicle {

    private String numberPlate;
    private int ticketID;
    private int numberWheels;
    private float cost;
    private Time time;

    public Vehicle() {

    }

    public String setNumberPlate() {
        Scanner sc = new Scanner(System.in);

//        String[] myArray = new String[car];
        System.out.print("Enter the License plate : ");
        this.numberPlate = sc.next();

        return numberPlate;

    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public int setNumberWheels(int numberWheels) {

        this.numberWheels = numberWheels;
        return numberWheels;
    }

    public int setNumberWheels() {
        Scanner sc = new Scanner(System.in);
       
//        String[] myArray = new String[car];
        System.out.print("Enter number of wheels : ");
        this.numberWheels = sc.nextInt();
        return numberWheels;
        
        

    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;

    }

    public String setTime() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Time : "); // Time: 10:3
        int h = sc.nextInt();//Hour
        System.out.print(" : ");
        int m = sc.nextInt();//Minutes
//        System.out.println("/n");

        Time t = new Time(h, m, 0);

        this.time = t;
        String time = t.toString();

        return time;
    }

    public void setCost() {
        this.cost = cost;
    }

    public int getTicketID() {

        return this.ticketID;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public float getCost() {
        ServiceCharge scg = new ServiceCharge();
        return scg.getCost(this.time, this.numberWheels);
    }

    public String getTimeInString() {
        return time.toString();
    }

    public Time getTime() {
        return time;
    }

}
