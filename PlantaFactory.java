public class PlantaFactory implements AbstractFactory<Planta> {
    @Override
    public Planta criar(String planta) {
        switch(planta) {
            case "Coqueiro":
                return new Coqueiro();
            case "Cajueiro":
                return new Cajueiro();
            default:
                return null;
        }
    }
}
