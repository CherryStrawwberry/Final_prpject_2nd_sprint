import model.Meat;
import model.Apple;
import model.Food;
import service.ShoppingCart;
import model.constants.Colour;

public class Main {

    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);
        Food[] food = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(food);

        System.out.printf("Total price: %.1f%n", shoppingCart.getTotalPrice());
        System.out.printf("Total price with discount: %.1f%n", shoppingCart.getTotalPriceWithDiscount());
        System.out.printf("Total price vegetarian: %.1f%n", shoppingCart.getTotalPriceVegetarian());
    }
}
