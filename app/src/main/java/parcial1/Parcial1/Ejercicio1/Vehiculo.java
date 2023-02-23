package parcial1.Parcial1.Ejercicio1;

public class Vehiculo {
    private String placa;
    private String marca;
    private String color;

    public Vehiculo(String placa, String marca, String color) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void showInfo() {
        System.out.println("* Placa: "+placa);
        System.out.println("* Marca: "+marca);
        System.out.println("* Color: "+color);
    }




}
