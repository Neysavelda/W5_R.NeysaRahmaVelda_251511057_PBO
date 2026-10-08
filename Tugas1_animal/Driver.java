public class Driver {
    public static void main(String[] args) {
        Dog dog = new Dog("Muso", "Indonesia", 4);
        Chicken chicken = new Chicken("Wilson", "Spanyol", 2);
        Lion lion = new Lion("Simba", "Afrika", 4);

        // 1. Dog
        System.out.println("1. Dog");
        dog.displayInfo();
        System.out.println();

        // 2. Chicken
        System.out.println("2. Chicken");
        chicken.displayInfo();
        System.out.println();

        // 3. Lion
        System.out.println("3. Lion");
        lion.displayInfo();
    }
}