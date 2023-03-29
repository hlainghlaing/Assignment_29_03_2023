package scm.com.abstractsample;

public class MotorBike extends Machine{

    @Override
    public void start() {
        System.out.println("MortorBike Started.");
    }

    @Override
    public void stop() {
        System.out.println("MotorBike Stopped.");
    }
    
}
