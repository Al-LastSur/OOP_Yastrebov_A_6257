package practice01.OwnPractice;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> productList;
    public VendingMachine(){
        productList = new ArrayList<>();
    }
    void initProducts(List<Product> productList){
        this.productList = productList;
    }
    void addProduct(Product product){
        productList.add(product);
    }
    Product getProduct(String name){
        for(Product product : productList)
            if (product.getName().equals(name))
                return product;
        return null;
    }



   
   

    
}
