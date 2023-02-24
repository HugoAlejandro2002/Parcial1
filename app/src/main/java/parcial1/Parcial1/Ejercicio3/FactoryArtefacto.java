package parcial1.Parcial1.Ejercicio3;


public class FactoryArtefacto {

    public static Artefacto make(String artifactType){
        Artefacto artefacto;
        switch (artifactType.toLowerCase()){
            case "television":
                artefacto = new Television();
                break;
            case "radio":
                artefacto = new Radio();
                break;
            case "batidora":
                artefacto = new Batidora();
            case "refrigerador":
                artefacto = new Refrigerador();
                break;
            case "microondas":
                artefacto = new Microondas();
                break;
            default:
                throw new IllegalArgumentException();
        }
        return artefacto;
    }
}
