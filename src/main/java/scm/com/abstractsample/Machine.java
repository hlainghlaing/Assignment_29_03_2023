package scm.com.abstractsample;

public abstract class Machine {
    public abstract void start();
    public abstract void stop();
    
    public void commonMethod() {
        System.out.println("We are machine");
    }
}
