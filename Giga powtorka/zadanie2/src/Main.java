public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Pen","PE-K4001",900);
        Product p2 = new Product("Pencil","PC-K4002",600);
        Product p3 = new Product("Ruler","RU-K4003",400);
//        Product p4 = new Product();

        Cart cart = new Cart();

        cart.addItem(p1);
        cart.addItem(p2);
        cart.addItem(p3);

        cart.printItems();
        cart.cartSize();
        System.out.println("====================");
        cart.removeItem("PE-K4001");
        cart.printItems();
        System.out.println("====================");
        cart.findItem("PC-K4002");
        System.out.println("====================");
        cart.clearCart();
    }
}