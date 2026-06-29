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
        for (int i = 0; i < food.length; i++) {
            totalPrice = totalPrice + food[i].getPrice() * food[i].getAmount();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        totalPrice = 0;
        for (int i = 0; i < food.length; i++) {
            totalPrice = totalPrice + (food[i].getPrice() * food[i].getAmount()) - (food[i].getPrice() * food[i].getAmount() * food[i].getDiscount() / 100);
        }
        return totalPrice;
    }

    public double getTotalPriceVegetarian() {
        totalPrice = 0;
        for (int i = 0; i < food.length; i++) {
            if (food[i].isVegetarian()) {
                totalPrice = totalPrice + food[i].getPrice() * food[i].getAmount();
            }
        }
        return totalPrice;
    }
}
