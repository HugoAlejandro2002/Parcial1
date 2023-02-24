package parcial1.Parcial1.Ejercicio3;


public class Main {
    public static void main(String[] args) {
        Artefacto television = FactoryArtefacto.make("television");
        television.setPrecio(1500);
        television.showInfo();

        Artefacto radio = FactoryArtefacto.make("radio");
        radio.setPrecio(20);
        radio.showInfo();

        Artefacto batidora = FactoryArtefacto.make("batidora");
        batidora.setPrecio(80);
        batidora.showInfo();

        Artefacto refrigerador = FactoryArtefacto.make("refrigerador");
        refrigerador.setPrecio(150);
        refrigerador.showInfo();

        Artefacto microondas = FactoryArtefacto.make("microondas");
        microondas.setPrecio(290);
        microondas.showInfo();


    }
}
