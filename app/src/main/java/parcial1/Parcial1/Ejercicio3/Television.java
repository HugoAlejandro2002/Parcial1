package parcial1.Parcial1.Ejercicio3;

public class Television extends Artefacto{

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void showInfo(){
        System.out.println("Television con precio: "+precio);
    }
}

