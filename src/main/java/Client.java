public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1909", 200);
        Item item2 = new Item("1919", 220);

        cart.addItem(item1);
        cart.addItem(item2);

        // Pay with paypal strategy
        cart.pay(new PaypalStrategy("mihandoost.p@gmail.com", "1234"));

        // Pay with credit strategy
        cart.pay(new CreditCardStrategy("parsa","6037-9971-7108-5922","5417","07/99"));

    }
}
