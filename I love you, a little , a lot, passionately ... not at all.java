// En este kata utilizo el operador módulo para saber qué frase coincide con el número de pétalos de una flor.


public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
    
    if (nb_petals % 6 == 1) {
      return "I love you";
    } else if (nb_petals % 6 == 2) {
      return "a little";
    } else if (nb_petals % 6 == 3) {
      return "a lot";
    } else if (nb_petals % 6 == 4) {
      return "passionately";
    } else if (nb_petals % 6 == 5) {
      return "madly";
    } else {
      return "not at all";
    }
    
    }
}
