package lecture01;

public class Robot1 {
            /**Robot Level*/
        public int level;
        /**Robot Name */
        public String name;
        /**
         * 
         * @param name The Name mutsn't start from digit
         * @param level Robot's level
         */
        public Robot1 (String name, int level){
            this.name = name;
            this.level = level;
        }
        //Methods to on\off the subsystems
        /**Load in BIOS */
        public void startBIOS(){ System.out.println("Start BIOS... ");}
        /**Load OS*/
        public void startOS(){ System.out.println("Start OS... ");}
        /**Greatings */
        public void sayHi(){ System.out.println("Hello, World!");}
        /**Shut down BIOS */
        public void stopBIOS(){ System.out.println("Stop BIOS...");}
        /**Shut down OS */
        public void stopOS(){ System.out.println("Stop OS...");}
        /**Saying GoodBye */
        public void sayBye(){ System.out.println("Goodbye, World!");}
        /**Working */
        public void work(){System.out.println("Working...");}
    }
