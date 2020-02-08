public class FactoryProvider {
    public static AbstractFactory getFactory(String tipoDeFabrica) {
        switch(tipoDeFabrica){
            case "Animal":
                return new AnimalFactory();
            case "Planta":
                return new PlantaFactory();
            default:
                return null;
        }
    }
}
