import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Character choice, clear;

        Set<Integer> hashset = new HashSet<Integer>();

        while (true) {
            System.out.println("");
            System.out.println("WELCOME TO HASHSET");
            System.out.println("");
            System.out.println("SELECT YOUR CHOICE");
            System.out.println("============================");
            System.out.println("A. Add numbers");
            System.out.println("B. Remove numbers");
            System.out.println("c. Display numbers");
            System.out.println("D. Clear numbers");
            System.out.println("E. Exit");
            System.out.println("=============================");
            System.out.println("");
            System.out.println("Enter your letter choice: ");
            choice = input.next().charAt(0);
            choice = Character.toLowerCase(choice);
            System.out.println("");

            switch (choice) {
                case 'a':
                    System.out.println("Enter the number you want to add: ");
                    int add = input.nextInt();
                    System.out.println("");

                    if (hashset.contains(add)) {
                        System.out.println("Value is already exists! Value not added.");
                    } else {
                        hashset.add(add);
                        System.out.println("Number " + add + "is successfully added to HashSet!");
                    }
                    break;

                case 'b':
                    System.out.println("Enter number you want to remove: ");
                    int remove = input.nextInt();
                    System.out.println("");

                    if (hashset.contains(remove)) {
                        hashset.remove(Integer.valueOf(remove));
                        System.out.println("Number " + remove + "is successfully removed!");
                        break;
                    }

                    break;

                case 'c':
                    System.out.println("Displaying numbers in HashSet");
                    System.out.println("=====================");

                    Iterator<Integer> it_set = hashset.iterator();
                    while (it_set.hasNext()) {
                        System.out.println(it_set.next());
                    }

                    System.out.println("=======================");
                    break;

                case 'd':
                    System.out.println("Are you sure you want to clear?(y/n: ");
                    clear = input.next().charAt(0);
                    clear = Character.toLowerCase(clear);
                    switch (clear) {
                        case 'y':
                            System.out.println("Clearing hashset...");
                            hashset.clear();
                            System.out.println("=================");
                            System.out.println("All cleared!");
                            System.out.println("=================");
                            break;

                        case 'n':
                            System.out.println("HashSet not cleared!");
                            break;
                    }
                    break;

                case 'e':
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid! Please input properly!");
            }
        }
    }
}