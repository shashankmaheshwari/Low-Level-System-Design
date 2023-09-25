public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory1 = new SofaFactory();
        FurnitureItem item1=factory1.createFurniture();
        item1.display();


        FurnitureFactory factory2 = new ChairFactory();
        FurnitureItem item2=factory2.createFurniture();
        item2.display();
    }
}