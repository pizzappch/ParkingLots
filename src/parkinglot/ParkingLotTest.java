package parkinglot;


import java.util.Scanner;

public class ParkingLotTest {

    public static void main(String[] args) {
        System.out.println("===============");
        System.out.println("Start ADMIN PC");
        System.out.println("===============");

        Scanner sc = new Scanner(System.in);

        System.out.print("Total Free Parking Number:");
        int tcar = sc.nextInt();
        System.out.print("Now, Free Parking Number:");
        int fcar = sc.nextInt();
        ParkingLot pkl = new ParkingLot(tcar, fcar);

        System.out.println("Total Free Parking Number:" + tcar);
        System.out.println("Now, Free Parking Number:" + fcar);

        int input = -2;
        int num = 0;
        while (input != 3) {
            System.out.println("=============================Transaction : " + ++num + "=============================");
            System.out.println("Start(0)/n Car in(1) /n Car out(2)/n Shutdown(3)/n Reset(4)/n Restart(5)");
            input = sc.nextInt();

            switch (input) {
                case 0:
                    pkl.start();
                    break;
                case 1:
                    pkl.countCarInSide();
                    break;
                case 2:
                    pkl.countCarOutSide();
                    break;
                case 3:
                    pkl.shutDown();
                    break;
                case 4:
                    pkl.reset();
                    break;
                case 5:
                    System.out.print("Total Free Parking Number:");
                    int tcar1 = sc.nextInt();
                    System.out.print("Now, Free Parking Number:");
                    int fcar1 = sc.nextInt();
                    pkl.restart(tcar1, fcar1);
                    System.out.println("Total Free Parking Number:" + tcar1);
                    System.out.println("Now, Free Parking Number:" + fcar1);
                    break;
                default:
                    pkl.error();
            }
            System.out.println(pkl);
        }
        System.out.println("=========================================================================");
    }
}

 


