package po23s.model;

import static po23s.model.Slicer.*;

public class Moeda {

    private String nomeMoeda, compraMoeda, vendaMoeda;

    Moeda(String resultado){
        nomeMoeda = JsonGetNome(resultado);
        compraMoeda = JsonGetCompra(resultado);
        vendaMoeda = JsonGetVenda(resultado);
    }

}