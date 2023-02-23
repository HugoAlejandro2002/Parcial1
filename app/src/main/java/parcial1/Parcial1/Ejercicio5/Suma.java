package parcial1.Parcial1.Ejercicio5;

public class Suma extends AbstractExpression {

    public Suma(int digit){
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        if(context.aparecioMultiplicacion) {
            if (context.input.startsWith("+")) {
                context.input = context.input.substring(digit);
            }
        }else{
            throw new ArithmeticException();
        }
    }
}
