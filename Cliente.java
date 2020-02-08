public class Cliente {
    public static void main(String[] args) {
        AbstractFactory<Animal> fabricaDeAnimais = FactoryProvider.getFactory("Animal");
        
        Animal cachorro = fabricaDeAnimais.criar("Cachorro");
        System.out.println(cachorro.fazerBarulho());
        System.out.println(cachorro.getAnimal());
        
        Animal gato = fabricaDeAnimais.criar("Gato");
        System.out.println(gato.fazerBarulho());
        System.out.println(gato.getAnimal());
        
        AbstractFactory<Planta> fabricaDePlantas = FactoryProvider.getFactory("Planta");
        
        Planta coqueiro = fabricaDePlantas.criar("Coqueiro");
        System.out.println(coqueiro.getPlanta());
        
        Planta cajueiro = fabricaDePlantas.criar("Cajueiro");
        System.out.println(cajueiro.getPlanta());
    }
}
