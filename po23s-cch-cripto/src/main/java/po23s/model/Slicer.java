package po23s.model;


import org.json.JSONObject;

public class Slicer {

    static private JSONObject Jsoncovert(String json){
        JSONObject obj = new JSONObject(json);
        obj = obj.getJSONObject("ticker");
        return obj;
    }

    static public String JsonGetNome(String json){
        JSONObject cortar = Jsoncovert(json);
        String parte  = cortar.getString("pair");
        int tam = parte.length()-3;
        String cortado = parte.substring(3, 3+tam);

        return cortado;

    }

    static public String JsonGetCompra(String json){
        JSONObject compra = Jsoncovert(json);
        String valor  = compra.getString("buy");
        return valor;
    }

    
    static public String JsonGetVenda(String json){
        JSONObject venda = Jsoncovert(json);
        String valor  = venda.getString("sell");

        return valor;

    }
}


