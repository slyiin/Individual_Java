import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_Implementation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Character choice, clear;

        List<Integer> arraylist = new ArrayList <Integer>();


        while(true){
            System.out.println("");
            System.out.println("WELCOME TO ARRAYLIST");
            System.out.println("");
            System.out.println("SELECT YOUR CHOICE");
            System.out.println("============================");
            System.out.println("A. Add numbers");
            System.out.println("B. Remove numbers");
            System.out.println("c. Display numbers");
            System.out.println("D. clear numbers");
            System.out.println("E. Exit");
            System.out.println("============================");
            System.out.println("");
            System.out.println("Enter your letter choice: ");
            choice = input.next().charAt(0);
            choice = Character.toLowerCase(choice);
            System.out.println("");

            switch(choice){
                case 'a':
                System.out.println("Enter number you want to add: ");
                int add = input.nextInt();
                System.out.println("");

                if(add > 0){
                    arraylist.add(add);
                    System.out.println("Number " + add + " is successfull added to ArrayList!");
                    break;
                }
                else{
                    System.out.println("Invalid! Your number is negative integer.");
                    break;
                }

                case 'b':
                System.out.println("Enter number you want to remove: ");
                int remove = input.nextInt();
                System.out.println("");

                if(arraylist.contains(remove)){
                    arraylist.remove(Integer.valueOf(remove));
                    System.out.println("Number " + remove + " is successfully removed!");
                    break;
                }

                case 'c' :
                System.out.println("Displaying number in ArrayList");
                System.out.println("");
                for (Integer number : arraylist) {
                    System.out.println(number);
                }
                System.out.println("======");
                break;

                case 'd':
                System.out.println("Are you sure you want to clear?(y/n): ");
                clear = input.next().charAt(0);
                clear = Character.toLowerCase(clear);
                switch(clear){
                    case 'y':
                    System.out.println("Clearing arraylist...");
                    arraylist.clear();
                    System.out.println("=================");
                    System.out.println("All cleared!");
                    System.out.println("=================");
                    break;
                    
                    case 'n' :
                    System.out.println("Arraylist not cleared!");
                    break;
                }
                break;

                case 'e' :
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid! Please input properly!");
            }
        }
        }
        
    }
