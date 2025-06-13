
import po23s.http.ClienteHttp;
import po23s.model.Moeda;


public class Po23sCchCripto {
    public static void main(String[] args) {
        ClienteHttp teste = new ClienteHttp();

        String resultado = teste.buscaDados("https://www.mercadobitcoin.net/api/BTC/ticker");

        
        Moeda coin = new Moeda(resultado);

        System.out.println(coin.getNomeMoeda());
    }
}
