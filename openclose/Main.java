package openclose;

public class Main {
    public static void main(String[]args){
        StandardCinema standardCinema = new StandardCinema(price:100);
        Double adminFee = standardCinema.calculateAdminFee();
        Systen.out.println(adminFee);
    }
}