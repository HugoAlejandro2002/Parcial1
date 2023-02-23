package parcial1.Parcial1.Ejercicio1;

import java.util.ArrayList;

public class Cabina {
    private static Cabina instance = null;
    private int peajeCobrado = 0;
    private ArrayList<Vehiculo> vehiculosRegistrados = new ArrayList<>();

    private Cabina() {
        System.out.println("works");
    }

    public static Cabina getInstance() {
        if (instance == null) {
            instance = new Cabina();
        }
        return instance;
    }

    public void cobrarPeaje(Vehiculo vehiculo) {
        switch (vehiculo.getMarca()) {
            case "vehiculo 1":
                peajeCobrado += 6;
                break;
            case "vehiculo 2":
                peajeCobrado += 5;
                break;
            case "vehiculo 3":
                peajeCobrado += 4;
                break;
            case "vehiculo 4":
                peajeCobrado += 3;
                break;
            case "vehiculo 5":
                peajeCobrado += 2;
                break;
            default:
                peajeCobrado += 10;
                break;
        }

        vehiculosRegistrados.add(vehiculo);
        if(vehiculosRegistrados.size()%6 == 0){
            verPeajeRecaudado();
        }

    }

    public void verPeajeRecaudado(){
        System.out.println("Se recaudo: "+peajeCobrado+" Bs");
    }

    public void mostrarVehiculosPasados(){
        for(int i=0;i<vehiculosRegistrados.size();i++){
            System.out.println("Numero "+(i+1));
            vehiculosRegistrados.get(i).showInfo();
            
        }
    }
}
