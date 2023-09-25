public class ChairFactory implements  FurnitureFactory{
    @Override
    public FurnitureItem createFurniture() {
        return new Chair();
    }
}
