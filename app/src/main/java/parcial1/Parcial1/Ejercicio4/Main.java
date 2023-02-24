package parcial1.Parcial1.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Cine cine = new Cine();
        MegaPaquete megaPaqueteBuilder = new MegaPaquete();
        PaqueteMediano paqueteMedianoBuilder = new PaqueteMediano();
        PaqueteNormal paqueteNormalBuilder = new PaqueteNormal();


        cine.setBuilder(megaPaqueteBuilder);
        cine.buildProduct();
        Paquete megaPaquete = cine.getPaquete();
        megaPaquete.showInfo();

        cine.setBuilder(paqueteMedianoBuilder);
        cine.buildProduct();
        Paquete paqueteMediano = cine.getPaquete();
        paqueteMediano.showInfo();

        cine.setBuilder(paqueteNormalBuilder);
        cine.buildProduct();
        Paquete paqueteNormal = cine.getPaquete();
        paqueteNormal.showInfo();


    }
}
