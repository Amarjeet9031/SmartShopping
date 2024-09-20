import java.util.Scanner;

public class Main {
    static  Scanner sc=new Scanner(System.in);

        public static void mainOps ()
        {
            while (true) {
                System.out.println("Press 1.User Details\nPress 2.Product Deatils"
                        + "\nPress 3.Customers Details\nPress 4.To chea \n"
                        + "Press 5.Category Details\nPress 6.to check all Product details absed on Stock\n"
                        + "Press 7 for quit");
                int input = sc.nextInt();

                switch (input) {
                    case 1:
                        AllOperation.UserOperation();
                        System.out.println("=======================================");
                        break;
                    case 2:
                        AllOperation.ProductOperation();
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

                        break;
                    case 3:
                        AllOperation.CustomerOperation();
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        break;
                    case 7:
                        System.exit(0);

                        System.out.println("wrong input");
                }
            }

        }

        public static void main (String[]args)
        {

            mainOps();

        }
    }

