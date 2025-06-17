// Classe Moeda
package po23s.model;

import static po23s.model.Slicer.*;

import java.awt.Frame;

public class Moeda {
    private String nomeMoeda, compraMoeda, vendaMoeda;

    public Moeda(String resultado, Frame parent) throws Exception{
        if (JsonGetNome(resultado, parent).equals("Erro")) {
            throw new Exception("Erro");
        }else{
            nomeMoeda = JsonGetNome(resultado, parent);
        }
        if (JsonGetCompra(resultado, parent).equals("Erro")) {
            throw new Exception("Erro");
        }else{
            compraMoeda = JsonGetCompra(resultado, parent);
        }
        if (JsonGetVenda(resultado, parent).equals("Erro")) {
            throw new Exception("Erro");
        }else{
            vendaMoeda = JsonGetVenda(resultado, parent);
        }
        
    }

    public String getNomeMoeda() {
        return nomeMoeda;
    }
    public void setNomeMoeda(String nomeMoeda) {
        this.nomeMoeda = nomeMoeda;
    }
    public String getCompraMoeda() {
        return compraMoeda;
    }
    public void setCompraMoeda(String compraMoeda) {
        this.compraMoeda = compraMoeda;
    }
    public String getVendaMoeda() {
        return vendaMoeda;
    }
    public void setVendaMoeda(String vendaMoeda) {
        this.vendaMoeda = vendaMoeda;
    }
}