package openclose;

public class StandardCinema extend Cinema {
    public StandardCinema(double price){
        this.price = price;
    }
    @Override
    Double calculateAdminFee(){
        return this.price * 10/100;
    }

}