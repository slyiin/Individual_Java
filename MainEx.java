import java.util.Scanner;

public class MainEx {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("~~~~WELCOME TO DESERTIST~~~~");
        System.out.println("");

        
        System.out.println("");

        String a[] = { "vegetable salad", "fruit salad", "mango float", "ice cream", "chocolate cake" };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your favorite dessert: ");

        int choice = sc.nextInt();

        try {
            if (choice < 0 || choice > 4) {
                sc.close();
                throw new NameException("There is no other available dessert.");
            }
            System.out.println(a[choice]);

        } catch (NameException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
