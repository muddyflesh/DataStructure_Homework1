package src.edu.nyu.ds;

public interface Exchangeable {
    
    //all in terms of Earth Dollar
    public double MMexchangeRate = 1.30;
    public double NNexchangeRate = 2.00;
    public double SSexchangeRate = 0.87;

    public abstract void exchange(Currency other , double amount);
}
