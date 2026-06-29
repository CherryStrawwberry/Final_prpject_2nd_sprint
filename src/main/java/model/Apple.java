package model;
import model.constants.Discount;
import model.constants.Colour;



public class Apple extends Food implements Discountable{
    private String colour;
    public Apple(int amount, double price, String colour) {
        isVegetarian = true;
        this.amount = amount;
        this.price = price;
        this.colour = colour;
    }

    @Override 
    public double getDiscount() {
        if(colour.equals(Colour.red)) {
            return Discount.discount;
        } else {
            return Discount.noDiscount;
        }
    }
}
