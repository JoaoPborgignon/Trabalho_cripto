package po23s.model;

import java.util.ArrayList;


public class Util {
    public static String link(String request){
        return "https://www.mercadobitcoin.net/api/" + request + "/ticker";
    }

    public static boolean isOnArray(Moeda teste, ArrayList<Moeda> lista){
        for (int i = 0; i < lista.size(); i++) {
            if (teste.getNomeMoeda().equals(lista.get(i).getNomeMoeda())) {
                return true;
            }
        }
        return false;
    }
}
