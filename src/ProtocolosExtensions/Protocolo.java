/**Essa class representa o objeto protocolo
 * (*)atributos apenas.
 */
package ProtocolosExtensions;

import java.util.Date;

public class Protocolo {
    String codDoProtocolo;
    String data;
    String tipoDeCarga;
    String statusProtocolos;

    public Protocolo(String codDoProtocolo, String data, String tipoDeCarga,
    /*quebra de linha*/ String statusProtocolos) {
        
        this.codDoProtocolo = codDoProtocolo;
        this.data = data;
        this.tipoDeCarga = tipoDeCarga;
        this.statusProtocolos = statusProtocolos;
    }
    
 
    @Override
    public String toString(){
        return "Codigo do protocolo; " + this.codDoProtocolo 
                + "\nData do protocolo; " + this.data 
                + "\nTipo de carga; "+ this.tipoDeCarga 
                + "\nStatus do protocolo ;"+ this.statusProtocolos ;
    }

    public String getCodDoProtocolo() {
        return codDoProtocolo;
    }

    public String getData() {
        return data;
    }

    public String getTipoDeCarga() {
        return tipoDeCarga;
    }

    public String getStatusProtocolos() {
        return statusProtocolos;
    }
    
    
}
