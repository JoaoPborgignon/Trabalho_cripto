package po23s.model;
public class Urlmk {
    public static String link(String request){
        return "https://www.mercadobitcoin.net/api/" + request + "/ticker";
    }
}
