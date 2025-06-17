package po23s.model;

import org.json.JSONObject;




public class Slicer {

    static private JSONObject Jsoncovert(String json, java.awt.Frame parent){
        JSONObject obj = new JSONObject(json);
        
        obj = obj.getJSONObject("ticker");
                    
        return obj;
    }

    static public String JsonGetNome(String json, java.awt.Frame parent){
       try {
            
        JSONObject cortar = Jsoncovert(json, parent);

        String parte  = cortar.getString("pair");
        int tam = parte.length()-3;
        String cortado = parte.substring(3, 3+tam);

        return cortado;
 
       } catch (Exception e) {
        return "Erro";
       }

        
    }

    static public String JsonGetCompra(String json, java.awt.Frame parent){

        try {
            JSONObject compra = Jsoncovert(json, parent);
            String valor  = compra.getString("buy");
            return valor;
        } catch (Exception e) {
            return "Erro";
        }

       
    }

    
    static public String JsonGetVenda(String json, java.awt.Frame parent){

        try {
            JSONObject venda = Jsoncovert(json, parent);
            String valor  = venda.getString("sell");
            return valor;
        } catch (Exception e) {
            return "Erro";
        }
      

    }
}


