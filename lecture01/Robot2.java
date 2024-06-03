package lecture01;
public class Robot2 {
    /**Robot level */
    private int level;
    /**Robot name */
    private String name;
/**
 * 
 * @param name Robot Name don't start it with digit 
 * @param level Robol level
 */    
    public Robot2(String name, int level) {
        this.name = name;
        this.level = level;
    }
    //Methods to on\off to subsystems

    public void powerOn(){
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }
    public void powerOff(){
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }
    public int getLevel(){
        return this.level;
    }
    public String getName(){
        return this.name;
    }
    //*Load BIOS*/
    private void startBIOS(){ System.out.println("Start BIOS... ");}
    /**Load OS*/
    private void startOS(){ System.out.println("Start OS... ");}
    /**Greatings */
    private void sayHi(){ System.out.println("Hello, World!");}
    /**SAying Good Buy */
    private void sayBye(){ System.out.println("Goodbye, World!");}
    //*Shut down OS */
    private void stopOS(){ System.out.println("Stop OS...");}
    /**Shut down BIOS */
    private void stopBIOS(){ System.out.println("Stop BIOS...");}
    /**Working */
    public void work(){System.out.println("Working... ");}
}
