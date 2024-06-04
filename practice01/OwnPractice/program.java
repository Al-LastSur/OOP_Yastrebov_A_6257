package practice01.OwnPractice;

public class program {
    public static void main(String[] args) {
        Product product1 = new Product("1", 100);
        Product product2 = new Product("2", 200);
        Product product3 = new Product("3", 300);
        Product product4 = new Product("4", 400);
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);
        vendingMachine.addProduct(product4);

        System.out.println(vendingMachine.getProduct("4").getCost());
    }
}
