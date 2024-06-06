package practice01.OwnPractice;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrink implements VendingMachine{
    private List<Product> productList;
    public VendingMachineHotDrink(){
        productList = new ArrayList<>();
    }

    @Override
    public void initProducts(List<Product> productList) {
        this.productList = productList;

    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
        throw new UnsupportedOperationException("Unimplemented method 'addProduct'");
    }

    @Override
    public Product getProduct(String name) {
       for (Product product : productList) {
        if (product.getName().equals(name)){
            return product;
        }
       } return null;

    }

    public Product getProduct(String name, int temperature){
        for (Product product : productList) {
            if (product.getName().equals(name) && ((HotDrink)product).getTemperature() == temperature) {
                return product;
            }
           } return null;
    }

}
