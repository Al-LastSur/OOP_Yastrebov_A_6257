package practice01.OwnPractice;

public class program {
    public static void main(String[] args) {
        Product product1 = new BottleOfWater("1", 100, 500);
        Product product2 = new BottleOfWater("2", 200, 450);
        Product product3 = new BottleOfWater("3", 300, 350);
        Product product4 = new BottleOfWater("4", 400, 250);

        VendingMachine vendingMachine = new VendingMachineBottleOfWater();
        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);
        vendingMachine.addProduct(product4);

        // System.out.println(vendingMachine.getProduct("4").getCost());
    }
}
