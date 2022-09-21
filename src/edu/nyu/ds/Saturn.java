package src.edu.nyu.ds;

public class Saturn extends Currency implements Exchangeable{

    public Saturn(double amount) {
        super(amount);
        setcurrencyName("SaturnSilver");
    }

    @Override
    public double toEarthDollars(double amount) {
        double EarthDollars = amount / SSexchangeRate;
        return EarthDollars;
    }

    @Override
    public double fromEarthDollars(double EarthDollars) {
        double amount = EarthDollars * SSexchangeRate;
        return amount;
    }

    @Override
    public void exchange(Currency other, double amount) {
        if (amount > this.gettotalFunds()){
            System.out.println("Unvalid amount: "+getplanetName()+" only has an available balance of "+String.format("%.2f",this.gettotalFunds())+" "+getcurrencyName()
            +", which is lower than "+amount);
            System.out.println("");
        }
        else{
            System.out.println("Convert from "+this.getcurrencyName()+" to "+other.getcurrencyName());
            this.settotalFunds(this.gettotalFunds()-amount);
            other.settotalFunds(other.gettotalFunds()+other.fromEarthDollars(this.toEarthDollars(amount)));
            System.out.println(amount+" "+this.getcurrencyName()+" = "+String.format("%.2f",this.toEarthDollars(amount))
            +" EarthDollars"+" = "+String.format("%.2f",other.fromEarthDollars(this.toEarthDollars(amount)))+" "+other.getcurrencyName());
            System.out.println("Saturn has total: "+String.format("%.2f",this.gettotalFunds()));
            System.out.println(other.getplanetName()+" has total: "+String.format("%.2f",other.gettotalFunds()));
            System.out.println("");
        }
    }

    @Override
    public String getplanetName() {
        return "Saturn";
    }
    
}
