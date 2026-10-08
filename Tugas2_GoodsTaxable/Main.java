public class Main {
    public static void main(String[] args) {
        Goods[] barang = {
            new Food("Roti", 10000, 250),
            new Toy("Lego", 200000, 6),
            new Book("Project Hail Mary", 300000, "Andy Weir"),
        };

        for (Goods g : barang) {
            g.display();
            System.out.println("-----");
        }
    }
}