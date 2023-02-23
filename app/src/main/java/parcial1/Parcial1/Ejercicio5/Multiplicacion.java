package parcial1.Parcial1.Ejercicio5;


public class Multiplicacion extends AbstractExpression {

    public Multiplicacion(int digit){
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("*")){
            context.aparecioMultiplicacion = true;
            context.input= context.input.substring(digit);
        }
    }
}
