import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Exer2 {
    public static List<Integer> retornaMenorEMaiorValorDeVendas(List<List<Integer>> tickets) {
      Integer minValor = 0;
      Integer maxValor = 0;

      for(List<Integer> li: tickets){
        for(Integer i: li){
              if(!(maxValor == 0 && minValor == 0)){
                if((i != 0) && (i <= 500 && i>= 20)){
                  if (i > maxValor){
                    maxValor = i;
                  }
                  if (i < minValor){
                    minValor = i;
                  }
                }
              } else {
                 minValor = i;
                 maxValor = i;
              }
        }
      }

      List <Integer> valoresFinais = new ArrayList();
      valoresFinais.add(minValor);
      valoresFinais.add(maxValor);
      return valoresFinais;
    }
}