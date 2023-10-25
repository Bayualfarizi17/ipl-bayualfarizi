package openclose;

public class DeluxeCinema extend Cinema {
    public DeluxeCinema(double price){
        this.price = price;
    }
       @Override
    Double calculateAdminFee(){
        return this.price * 20/100;
    }

}