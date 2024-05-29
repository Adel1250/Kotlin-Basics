public class Customer {

    private final String name;

    public Customer(String s){
        name = s;
    }

    public String getName() {
        return name;
    }

    public void placeOrder() {
        System.out.println("A new order is placed by " + name);
    }
}