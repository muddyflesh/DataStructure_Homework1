package src.edu.nyu.ds;

public abstract class Currency implements Exchangeable{

    public String currencyName;

    public double totalFunds;

    public Currency(double amount){
        settotalFunds(amount);
    }
    public abstract String getplanetName();

    public void settotalFunds(double amount){
        if (amount <= 0){
            System.out.println("Please input a valid amount of funds");
        }
        else{
            this.totalFunds = amount;
        }
        
    }

    public double gettotalFunds(){
        return totalFunds;
    }

    public void setcurrencyName(String name){
        this.currencyName = name;
    }

    public String getcurrencyName(){
        return currencyName;
              
    }

    public abstract double toEarthDollars(double amount);

    public abstract double fromEarthDollars(double EarthDollars);
}
