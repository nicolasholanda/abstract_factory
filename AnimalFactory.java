public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal criar(String tipoDeAnimal) {
        switch(tipoDeAnimal) {
            case "Gato":
                return new Gato();
            case "Cachorro":
                return new Cachorro();
            default:
                return null;
        }
    }
}
