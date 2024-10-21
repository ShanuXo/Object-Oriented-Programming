package CarManagementShowroom;

import java.util.Scanner;

public class Main {
    public static void main_menu() {
        System.out.println();
        System.out.println("====== *** Welcome to Car Showroom Management System *** ======");
        System.out.println();
        System.out.println("====== ***ENTER YOUR CHOICE *** ======");
        System.out.println();
        System.out.println("1] ADD SHOWROOM \t\t\t 2] ADD EMPLOYEE \t\t\t 3] ADD CARS");
        System.out.println();
        System.out.println("4] GET SHOWROOMS \t\t\t 5] GET EMPLOYEE \t\t\t 6] GET CARS");
        System.out.println();
        System.out.println("====== *** ENTER 0 TO EXIT *** ======");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom[] showroom = new Showroom[5];
        Employee[] employee = new Employee[5];
        Cars[] cars = new Cars[5];
        int showroom_Counter = 0;
        int employee_Counter = 0;
        int car_Counter = 0;
        int choice = 100;
        while (choice != 0) {
            main_menu();
            choice = sc.nextInt();
            while (choice != 9 && choice != 0) {
                switch (choice) {
                    case 1:
                        showroom[showroom_Counter] = new Showroom();
                        showroom[showroom_Counter].set_details();
                        showroom_Counter++;
                        System.out.println("1] ADD SHOWROOM ");
                        System.out.println("9] GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[employee_Counter] = new Employee();
                        employee[employee_Counter].set_details();
                        employee_Counter++;
                        System.out.println("2] ADD EMPLOYEE ");
                        System.out.println("9] GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        cars[car_Counter] = new Cars();
                        cars[car_Counter].set_details();
                        car_Counter++;
                        System.out.println("3] ADD CARS ");
                        System.out.println("9] GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < showroom.length; i++) {
                            if(showroom[i]!=null)
                            {
                                showroom[i].get_details();
                            }                           
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9] GO BACK TO MAIN MENU");
                        System.out.println("0] EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employee.length; i++) {
                            if(employee[i]!=null)
                            {
                                employee[i].get_details();
                            }  
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9] GO BACK TO MAIN MENU");
                        System.out.println("0] EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < cars.length; i++) {
                            if(cars[i]!=null)
                            {
                                cars[i].get_details();
                            }  
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9] GO BACK TO MAIN MENU");
                        System.out.println("0] EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }

            }

        }
    }
}
