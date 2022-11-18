import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Exer1 {
    public static Integer ultimaParada(Integer combustivel,Integer consumo,List<Integer> postosDeGasolina) {

      Integer maxDist = consumo * combustivel;
      Integer maxDistPossivel = -1;
      Integer postoNaoExiste;

      for(int dist: postosDeGasolina){

          if(dist <= maxDist && dist > maxDistPossivel) {
            maxDistPossivel = dist;
           }
      }

       return maxDistPossivel;
    }
}