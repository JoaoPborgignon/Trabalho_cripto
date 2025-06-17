package po23s.model;


import org.json.JSONException;
import org.json.JSONObject;

import po23s.view.Jdialog_nao_encontrado;


public class Slicer {

    static private JSONObject Jsoncovert(String json, java.awt.Frame parent){
        JSONObject obj = new JSONObject(json);
        try { obj = obj.getJSONObject("ticker");
                    
        } catch (JSONException error ) {
            Jdialog_nao_encontrado nao_encontrado = new Jdialog_nao_encontrado(parent, true);
            nao_encontrado.setVisible(true);
        }
        return obj;
    }

    static public String JsonGetNome(String json, java.awt.Frame parent){
        JSONObject cortar = Jsoncovert(json, parent);
        String parte  = cortar.getString("pair");
        int tam = parte.length()-3;
        String cortado = parte.substring(3, 3+tam);

        return cortado;

    }

    static public String JsonGetCompra(String json, java.awt.Frame parent){
        JSONObject compra = Jsoncovert(json, parent);
        String valor  = compra.getString("buy");
        return valor;
    }

    
    static public String JsonGetVenda(String json, java.awt.Frame parent){
        JSONObject venda = Jsoncovert(json, parent);
        String valor  = venda.getString("sell");

        return valor;

    }
}


