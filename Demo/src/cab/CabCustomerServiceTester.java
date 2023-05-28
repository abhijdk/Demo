package cab;

public class CabCustomerServiceTester {
    public static void main(String[] args) {
        CabCustomerService service = new CabCustomerService();

        CabCustomer customer1 = new CabCustomer(1, "John", "A", "B", 3, "1111111111");
        CabCustomer customer2 = new CabCustomer(2, "Smith", "C", "D", 6, "2222222222");

        service.addCabCustomer(customer1);
        service.addCabCustomer(customer2);

        System.out.println(service.printBill(customer1));
        System.out.println(service.printBill(customer2));
    }
}
