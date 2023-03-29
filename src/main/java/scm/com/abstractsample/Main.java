package scm.com.abstractsample;

public class Main {

    public static void main(String[] args) {
        // Abstract machine class references to Car Object
        Machine mac=new Car();
        mac.start();
        mac.stop();
        mac.commonMethod();
        
        // declare & Instantiate Car Object
        Car car=new Car();
        car.start();
        car.stop();
        car.commonMethod();
        
        // declare & Instatiate MotorBike
        MotorBike motor=new MotorBike();
        motor.start();
        motor.stop();
        motor.commonMethod();
    }

}
