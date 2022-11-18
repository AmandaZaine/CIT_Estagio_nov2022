import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Exer4 {
    public static List<String> calculaTopOcorrenciasDeQueries(String texto,List<String> queries,Integer k) {

      List<Integer> recorrencias = new ArrayList<>();
      Map<Integer, String> recTermo = new HashMap<>();
      List<String> kTermosRec = new ArrayList<>();

      int qtdQueries = queries.size();
      for(int i=0; i<qtdQueries; i++){
        String termo = queries.get(i);
        Pattern pattern = Pattern.compile(termo);
        Matcher matcher = pattern.matcher(texto);

        int qtd = 0;
        while(matcher.find()){
          qtd++;
        }

        recorrencias.add(qtd);
        recTermo.put(qtd, termo);
      }

      recorrencias.sort(Collections.reverseOrder());

      for(int j = 0; j < k; j++){
        int chave = recorrencias.get(j);
        String jTermoRec = recTermo.get(chave);
        kTermosRec.add(jTermoRec);
      }

      return kTermosRec;
    }
}