package practice01.OwnPractice;

public class program {
    public static void main(String[] args) {
        Product product1 = new BottleOfWater("1", 100, 500);
        Product product2 = new BottleOfWater("2", 200, 450);
        Product product3 = new BottleOfWater("3", 300, 350);
        Product product4 = new BottleOfWater("4", 400, 250);
        Product product5 = new HotDrink("5", 500, 200, 35);
        Product product6 = new HotDrink("6", 500, 200, 15);
        Product product7 = new HotDrink("7", 500, 200, 40);
        Product product8 = new HotDrink("8", 500, 200, 80);

        VendingMachine vendingMachine = new VendingMachineBottleOfWater();
        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);
        vendingMachine.addProduct(product4);



        VendingMachine DrinksMachine = new VendingMachineHotDrink();
        vendingMachine.addProduct(product5);
        vendingMachine.addProduct(product6);
        vendingMachine.addProduct(product7);
        vendingMachine.addProduct(product8);
        


        System.out.println(vendingMachine.getProduct("4").getCost());
        System.out.println(DrinksMachine.getProduct("5").getCost());
    }
}
