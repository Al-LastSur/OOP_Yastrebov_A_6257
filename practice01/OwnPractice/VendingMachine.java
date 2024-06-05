package practice01.OwnPractice;
// import java.util.ArrayList;
import java.util.List;

interface VendingMachine {
    
    void initProducts(List<Product> productList);
    void addProduct(Product product);
    Product getProduct(String name);
    
}
