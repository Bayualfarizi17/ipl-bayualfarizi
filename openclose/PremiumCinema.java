package openclose;

public class PremiumCinema extend Cinema {
    public PremiumCinema(double price){
        this.price = price;
    }
       @Override
    Double calculateAdminFee(){
        return this.price * 12/100;
    }

}