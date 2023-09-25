public class SofaFactory implements  FurnitureFactory{
    @Override
    public FurnitureItem createFurniture() {
        return new Sofa();
    }
}
