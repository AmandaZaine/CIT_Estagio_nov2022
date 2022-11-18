import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Exer3 {
    public static Integer calculaNumeroDaSenha(List<String> senha) {

      List<String> senhaBin = new ArrayList();

      for(int s = 0; s <= 9; s++){
        int verd = 0;
        int fals = 0;

        for(int i = 0; i<=9; i++){
            if(senha.get(i).charAt(s) == '1'){
             verd++;
           } else {
             fals++;
           }
        }

        if (verd != fals){

           if(verd > fals){
            senhaBin.add("1");
           }else{
             senhaBin.add("0");
           }

         } else {
           senhaBin.add("1");
         }
      }

      String senhaString = String.join("", senhaBin);

      return Integer.parseInt(senhaString, 2);
    }
}