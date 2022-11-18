import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

class Exer5 {
    public static List<Integer> calculaPorcentagemSorteio(List<Boolean> assinante,List<Integer> minutosAssistidos) {

      List<Integer> percentChances = new ArrayList<>();

      Double divisor = 0.0;
      int qtd = assinante.size();

      for(int i=0; i<qtd; i++){
        Double minEmDoub2 = Double.valueOf(minutosAssistidos.get(i));
        Double minAssit = minEmDoub2/60.0;
        if(assinante.get(i)){
          divisor += (2 * Math.ceil(minAssit));
        } else {
          divisor += Math.ceil(minAssit);
        }
      }

      Double constanteProp = 1.0/divisor;

      for(int j=0; j<qtd; j++){
        Double minEmDoub = Double.valueOf(minutosAssistidos.get(j));
        Double tempAssist = Math.ceil(minEmDoub/60.0);
        Double chanceParcial = constanteProp*tempAssist*100.0;

        if(assinante.get(j)){
          percentChances.add(2*chanceParcial.intValue());
        } else {
          percentChances.add(chanceParcial.intValue());
        }
      }

      return percentChances;
    }
}



