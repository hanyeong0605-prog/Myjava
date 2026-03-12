package ch06_abstract_interface.cafeinterface;

public class coffe extends Americano05{
    private String t ;

    public coffe(String name, double price, double waterAmount,String t) {
        this.t = t;
        super(name, price, waterAmount);
    }
}
