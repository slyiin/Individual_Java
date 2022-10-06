public class Main {
  public static void main(String[] args) {
    Food<String> dessert = new Food<String>("vegetable salad");

    
    dessert.setName("fruit salad");
    System.out.println(dessert.getName());
  }    
}