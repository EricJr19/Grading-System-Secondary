/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradingsystem;

/**
 *
 * @author ernest lloyd
 */
 import java.util.Scanner;

public class  GradingSystem {

    public static  void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String USERNAME = "Admin";
        String PASSWORD = "Admin123";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Grading System!");

        // Login process
        boolean loggedIn = false;
        int attempts = 3;

        while (!loggedIn && attempts > 0) {
            System.out.print("Enter username: ");
            String usernameInput = scanner.nextLine();

            System.out.print("Enter password: ");
            String passwordInput = scanner.nextLine();

            if (usernameInput.equals(USERNAME) && passwordInput.equals(PASSWORD)) {
                System.out.println("Login successful!");
                loggedIn = true;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Invalid credentials. Attempts left: " + attempts);
                } else {
                    System.out.println("Too many invalid attempts. Exiting...");
                }
            }
        }

        if (loggedIn) {
            
            System.out.println("Grade System functionalities would be here.");
            

             int choice;

        do {
            System.out.println("-----------------------------");
            System.out.println("Welcome to the Grading System");
            System.out.println("-----------------------------");
            System.out.println("Input the Information of Student = 1");
            System.out.println("Exit = 0");

            System.out.print("Enter your choice (1 or 0): ");
            while (!console.hasNextInt()) {
                System.out.println("Invalid input. Please enter 1 or 0.");
                console.next(); 
            }
            choice = console.nextInt();
            console.nextLine(); 
            if (choice != 1 && choice != 0) {

                System.out.println("Invalid input. Please enter 1 or 0.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("");
                    System.out.println("Student Information");
                    System.out.println("-----------------------------");

                    System.out.print("Enter Student Full Name: ");
                    String fullName = console.nextLine();           
                    

                    System.out.print("Enter grade level : ");
                    
                    String course = console.nextLine();

                    System.out.print("Enter Student Address: ");
                    String address = console.nextLine();

                    System.out.print("Enter Student Age: ");
                    int age = console.nextInt();
                    console.nextLine();

                    System.out.print("Enter Student ID: ");
                    long StudentId = console.nextLong();
                    console.nextLine(); 

                    System.out.println("-----------------------------");
                    System.out.println("Student Grades");
                       double g1, g2, g3, g4 , g5 , g6 , g7, g8;

        do {
            System.out.print("Enter Math : ");
            g1 = console.nextDouble();
        } while (g1 < 0 || g1 > 100);

        do {
            System.out.print("Enter English : ");
            g2 = console.nextDouble();
        } while (g2 < 0 || g2 > 100);

        do {
            System.out.print("Enter Filipino : ");
            g3 = console.nextDouble();
        } while (g3 < 0 || g3 > 100);
        
        do {
            System.out.print("Enter Science : ");
            g4 = console.nextDouble();
        } while (g4 < 0 || g4 > 100);
        
         do {
            System.out.print("Enter Araling panlipunan : ");
            g5 = console.nextDouble();
        } while (g5 < 0 || g5 > 100);
         
          do {
            System.out.print("Enter Mapeh : ");
            g6 = console.nextDouble();
        } while (g6 < 0 || g6 > 100);
          
           do {
            System.out.print("Enter TLE : ");
            g7 = console.nextDouble();
        } while (g7 < 0 || g7 > 100);
           
           do {
            System.out.print("Enter ESP : ");
            g8 = console.nextDouble();
        } while (g8 < 0 || g8 > 100);

        

        double sum = g1 + g2 + g3 + g4 + g5 + g6 + g7 + g8;
        double avg = sum / 8;

        


                        System.out.println("Student's Information");

                        System.out.println("-----------------------------");

                        System.out.println("Name: " + fullName);
                        System.out.println("School Year: " + course);
                        System.out.println("Address: " + address);
                        System.out.println("Age: " + age);
                        System.out.println("Student ID" + StudentId);
                        System.out.println("-----------------------------");
                        System.out.println("[GRADES]");
                        System.out.println("Math : " + g1);
                        System.out.println("English : " + g2);
                        System.out.println("Filipino : " + g3);
                        System.out.println("Science  : " + g4);
                        System.out.println("Araling Panlipunan :" + g5);
                        System.out.println("MAPEH : " + g6);
                        System.out.println("TLE : " + g7);
                        System.out.println("ESP :" + g8);



                        System.out.println("-----------------------------");
                        System.out.println(" Average: " + avg);
                        System.out.println("-----------------------------");

                        if (avg >= 94 && avg <= 100) {
                            System.out.println("Excellent (94-100%) - A+");
                        } else if (avg >= 91 && avg <= 93) {
                            System.out.println("Very Good  (91-93%) - A");
                        } else if (avg >= 88 && avg <= 90) {
                            System.out.println("Good  (88-90%) - B+");
                        } else if (avg >= 85 && avg <= 87) {
                            System.out.println("Satisfactory  (85-87%) - B");
                        } else if (avg >= 80 && avg <= 84) {
                            System.out.println("Fair Enough  (80-84%) - B-");
                        } else if (avg >= 75 && avg <= 79) {
                            System.out.println("Pass  (75-79%) - C ");
                        } else if (avg >= 0 && avg <= 74) {
                            System.out.println(" Fail  (70-74%) - F ");
                        } else {
                            System.out.println(" Below C - Keep grinding for success!");
                        }
                        break;















                case 0:
                    System.out.println("Exiting the Grading System. Goodbye!");
                    break;
            }
               if (choice != 0) {
                System.out.print("Do you want to continue? (1: Yes, 0: No): ");
                int continueChoice;
                while (!console.hasNextInt()) {
                    System.out.println("Invalid input. Please enter 1 or 0.");
                    console.next(); 
                }
                continueChoice = console.nextInt();
                console.nextLine(); 

                if (continueChoice !=1) {
                    System.out.println("Goodbye and Merry Christmass");
                    
                } else {
                   System.out.println("Thank you and Merry Christmass");
                   
                }
            }
        } while (choice != 0);

        

        }
    }
}
