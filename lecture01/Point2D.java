package lecture01;
/**
 * Method 2D Point
 */
public class Point2D {
    private int x, y;
    /**
     * Constructor 
     * @param valueX coordinate X
     * @param valueY coordinate Y
     */
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }
    public Point2D(int value) {
        // this.x = value;
        this(value, value);
    }
    public Point2D() {
        this(0);
    }
    // public Point2D() {
    //     x = 0;
    //     y = 0;
    // }
    // public Point2D(int value) {
    //     x = value;
    //     y = value;
    // } 


    public String getInfo(){
        return String.format("x: %d; y: %d",x,y);
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }
    public void setY(int value) {
        this.y = value;
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
