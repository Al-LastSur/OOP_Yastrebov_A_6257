package practice01.OwnPractice;

public abstract class Product {
    //public(available outside the class) private(available only inside the class) protected(available only inside the daughter-classes)
    
    private int cost;
    private String name;

        public Product(String name, int cost){
            this.name = name;
            this.cost = cost;
        }
        public String getName() {
            return name;
        }
        public void setName (String name) {
            this.name =  name;
        }
        public int getCost() {
            return cost;
        }
        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Product{" +
                   "name='" + name + '\'' +
                   ", cost=" + cost +
                   '}';
        }



}
