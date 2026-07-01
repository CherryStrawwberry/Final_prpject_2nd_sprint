package service;

import model.Food;

public class ShoppingCart {
    private Food[] food; 

    private double totalPrice;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }
    public double getTotalPrice() {
        totalPrice = 0;
        for (Food item : food) {
            totalPrice += item.getPrice() * item.getAmount();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        totalPrice = 0;
        for (Food item : food) {
            totalPrice += (item.getPrice() * item.getAmount()) - (item.getPrice() * item.getAmount() * item.getDiscount() / 100);
        }
        return totalPrice;
    }

    public double getTotalPriceVegetarian() {
        totalPrice = 0;
        for (Food item : food) {
            if (item.isVegetarian()) {
                totalPrice += item.getPrice() * item.getAmount();
            }
        }
        return totalPrice;
    }
}
