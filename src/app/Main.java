package app;

// Виправте цей клас
public class Main {

    public static void main(String[] args) {

        Customer customer = getCustomer(getData());
        String output = "Customer: " + customer.getName() +
                ", phone " + customer.getPhone();
        getOutput(output);
    }

    public static String[] getData() {
        return new String[]{"David", "5-557-987-457"};

    }

    public static Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1]);
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
