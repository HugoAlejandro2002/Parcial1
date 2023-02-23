package parcial1.Parcial1.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("A", "vehiculo 1", "red");
        Vehiculo vehiculo2 = new Vehiculo("B", "vehiculo 2", "yellow");

        Vehiculo vehiculo3 = new Vehiculo("C", "vehiculo 3", "blue");
        Vehiculo vehiculo4 = new Vehiculo("D", "vehiculo 4", "sky");
        Vehiculo vehiculo6 = new Vehiculo("E", "vehiculo 5", "green");
        Vehiculo vehiculo5 = new Vehiculo("E", "vehiculo 6", "green");


        Cabina.getInstance().cobrarPeaje(vehiculo6);
        Cabina.getInstance().cobrarPeaje(vehiculo1);
        Cabina.getInstance().cobrarPeaje(vehiculo2);
        Cabina.getInstance().cobrarPeaje(vehiculo3);
        Cabina.getInstance().cobrarPeaje(vehiculo4);
        Cabina.getInstance().cobrarPeaje(vehiculo5);




    }
}
