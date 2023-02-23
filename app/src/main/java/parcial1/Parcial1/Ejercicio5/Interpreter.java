package parcial1.Parcial1.Ejercicio5;


import java.util.ArrayList;
import java.util.List;

public class Interpreter extends AbstractExpression {
      private List<AbstractExpression> grammar = new ArrayList<>();
      private Context context;

      public Interpreter(String msgToInterpreter){
                                // asegurando que el msg original no tenga espacios - regla gramatica
          context = new Context(msgToInterpreter.replace(" ",""));
          for ( String charOriginal :  msgToInterpreter.split(" ")) {
              switch (charOriginal){
                  case "*":
                      grammar.add(new Multiplicacion(charOriginal.length()));
                      break;
                  case "+":
                      grammar.add(new Suma(charOriginal.length()));
                      break;
                  default:
                      grammar.add(new Numero(charOriginal.length()));
                      break;


              }
          }
      }

      public int evaluateMsg(){
          for (AbstractExpression expression:grammar) {
              expression.interpreter(context);
          }
          return context.output;
      }


    @Override
    public void interpreter(Context context) {

    }
}
