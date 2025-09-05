package learnermanagement;
import java.util.*;


public class hello {  
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        String[] name = new String[100];
        int[] xp = new int[100];
        int[] age = new int[100];
        int count = 0;



        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add learner");
            System.out.println("2. Display learners");
            System.out.println("3. Show average XP");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            option = scanner.nextInt(); 

            switch (option) {
                case 1:
                    System.out.println("Adding learner");
                    System.out.println("Enter name:");
                    name[count] = scanner.next();
                    System.out.println("Enter age:");
                    int temp = scanner.nextInt();
                    if (temp>=18 && temp<=65){
                        age[count] = temp;
                    } else {
                        System.out.println("Invalid age");
                        break;
                    }
                    System.out.println("Enter XP:");
                    xp[count] = scanner.nextInt();
                    count++;
                    break;
                case 2:
                    System.out.println("Displaying learners");
                    for (int i = 0; i < count; i++) {
                        System.out.println("Learner " + (i + 1) + ": Name: " + name[i] + ", Age: " + age[i] + ", XP: " + xp[i]);
                    }
                    
                    break;
                case 3:
                    System.out.println("Showing average XP");
                    if (count == 0) {
                        System.out.println("No learners to calculate average XP.");
                    } else {
                        int totalXP = 0;
                        for (int i = 0; i < count; i++) {
                            totalXP += xp[i];
                        }
                        double averageXP = (double) totalXP / count;
                        System.out.println("Average XP: " + averageXP);
                    }
                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }

        } while (option != 4);  

    }
    
    
}
