import po23s.http.ClienteHttp;


public class Po23sCchCripto {
    public static void main(String[] args) {
        ClienteHttp teste = new ClienteHttp();

        String resultado = teste.buscaDados("https://www.mercadobitcoin.net/api/ETH/ticker");

        System.out.println(resultado);
    }
}