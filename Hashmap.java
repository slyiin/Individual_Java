import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Character choice, clear;

        Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

        while (true) {
            System.out.println("");
            System.out.println("WELCOME TO HASHMAP");
            System.out.println("");
            System.out.println("SELECT YOUR CHOICE");
            System.out.println("============================");
            System.out.println("A. Add numbers");
            System.out.println("B. Remove numbers");
            System.out.println("c. Display numbers");
            System.out.println("D. clear numbers");
            System.out.println("E. Exit");
            System.out.println("===============================");
            System.out.println("");
            System.out.println("Enter your letter choice: ");
            choice = input.next().charAt(0);
            choice = Character.toLowerCase(choice);
            System.out.println("");

            switch (choice) {
                case 'a':
                    System.out.println("Note: Only enters composite numbers.");
                    System.out.println("Enter number you want to add: ");
                    int add = input.nextInt();
                    System.out.println("");

                    int j = add / 2;
                    int isPrime = 0;

                    if (add == 0 || add == 1) {
                        System.out.println("Enter key number you want to add: ");
                        int key = input.nextInt();
                        System.out.println("");

                        hashmap.put(key, add);
                        System.out.println(key + " => " + add + "is successfully added to HashMap!");
                    } else {
                        for (int i = 2; i <= j; i++) {
                            if (add % i == 0) {
                                System.out.println("Enter key you want to add: ");
                                int key = input.nextInt();
                                System.out.println("");

                                hashmap.put(key, add);
                                System.out.println(key + " => " + add + "is successfully added to HashMap!");
                                isPrime = 1;
                                break;
                            }
                        }
                        if (isPrime == 0) {
                            System.out.println("Integer is a prime number. It is not added in HashMap.");
                        }
                    }
                    break;

                case 'b':
                    System.out.println("Enter key you want to remove: ");
                    int remove = input.nextInt();
                    System.out.println("");

                    if (hashmap.containsKey(remove)) {
                        System.out.println(remove + " => " + hashmap.get(remove) + "is successfully removed.");
                        hashmap.remove(remove);
                    }

                    break;

                case 'c':
                    System.out.println("Displaying numbers in HashMap");
                    System.out.println("====================");

                    hashmap.entrySet().forEach(entry -> {
                        System.out.println(entry.getKey() + " => " + entry.getValue());
                    });

                    System.out.println("===================");

                    break;

                case 'd':
                    System.out.println("Are you sure you want to clear?(y/n: ");
                    clear = input.next().charAt(0);
                    clear = Character.toLowerCase(clear);
                    switch (clear) {
                        case 'y':
                            System.out.println("Clearing hashmap...");
                            hashmap.clear();
                            System.out.println("=================");
                            System.out.println("All cleared!");
                            System.out.println("=================");
                            break;

                        case 'n':
                            System.out.println("HashMap not cleared!");
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
