package lecture01;

import java.util.ArrayList;

public class Robot3 {
    enum State {
        On , Off
    }
    private static int defaultIndex;
    private static ArrayList<String> names;
    
    static {
        defaultIndex = 1;
        names = new ArrayList<String>();
    }
    /** Robot Level */
    private int level;
    /**Robot Name */
    private String name;

    private State state;
    /**Create a Robot
     * @param name Robot Name don't use any Digit as the First letter
     * @param level Robot Level
     */
    private Robot3(String name, int level) {
        if ((name.isEmpty()
            || Character.isDigit(name.charAt(0)))
            || Robot3.names.indexOf(name) != -1)
        {
            this.name = String.format("DefaultName_%d", defaultIndex ++);
        } else{
            this.name = name;
        }

        Robot3.names.add(this.name);
        this.level = level;
        this.state = State.Off;

        //region other constructors

        //public Robot3(String name)
        // {
        //     if ((name.isEmpty()
        //     || Character.isDigit(name.charAt(0)))
        //     || Robot3.names.indexOf(name) == -1)
        //     {
        //         this.name = String.format("DefaultName_%d", defaultIndex ++);
        //     } else{
        //         this.name = name;
        //     }
    
        //     Robot3.names.add(this.name);
        //     this.level = 1;
        //     this.state = State.Off;
        // }

        // public Robot3()
        // {
        //     this.name = String.format("DefaultName_%d", defaultIndex ++);
            
        //     Robot3.name.add(this.name);
        //     this.level = 1;
        //     this.state = State.Off;
        // }
        //#endregion
        }
        // #region correct constructors
            public Robot3(String name){
                this(name,1);
            }

            public Robot3(){
                this("");
            }
    // Methods to on\off the subsystems
    public void power(){
        if (this.state == State.Off){
            this.powerOn();
            this.state = State.On;
        } else {
            this.powerOff();
            this.state = State.Off;
        }
        System.out.println();
    }
    private void powerOn(){
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }
    private void powerOff(){
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
    public void work(){
        if (this.state == State.On){
            System.out.println("Working... ");
        }
    }
    @Override
    public String toString(){
        return String.format("%s %d\n", this.name, this.level);
    }
}
