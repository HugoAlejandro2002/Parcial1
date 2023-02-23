package parcial1.Parcial1.Ejercicio5;

public class Main {

    public static void main (String[]args){
        String msg="2 * 3 + 5 + 5 + 5";
        Interpreter parser = new Interpreter(msg);
        System.out.println(msg);
        System.out.println("resultado: "+parser.evaluateMsg());
    }
}
