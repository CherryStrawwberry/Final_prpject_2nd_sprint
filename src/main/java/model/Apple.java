package model;
import model.constants.Discount;
import model.constants.Colour;



public class Apple extends Food{
    private String colour;
    public Apple(int amount, double price, String colour) {
        isVegetarian = true;
        this.amount = amount;
        this.price = price;
        this.colour = colour;
    }

    @Override 
    public double getDiscount() {
        return colour.equals(Colour.RED) ? Discount.DISCOUNT : Discount.NO_DISCOUNT;
    }
}
