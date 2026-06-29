import model.Meat;
import model.Apple;
import model.Food;
import service.ShoppingCart;
import model.constants.Colour;

public class Main {

public static void main(String[] args) {
Meat meat = new Meat(5, 100);
Apple redApple = new Apple(10, 50, Colour.red);
Apple greenApple = new Apple(8, 60, Colour.green);
Food[] food = {meat, redApple, greenApple};

ShoppingCart shoppingCart = new ShoppingCart(food);

System.out.println("Total price: " + shoppingCart.getTotalPrice());
System.out.println("Total price with discount: " + shoppingCart.getTotalPriceWithDiscount());
System.out.println("Total price vegetarian: " + shoppingCart.getTotalPriceVegetarian());

}
}
