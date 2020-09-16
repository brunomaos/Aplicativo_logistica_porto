/**Serve para criar o pedido referente ao protocolo.
 * Usando o objeto protocolo.
 * armazenando em lista.
 */
package ProtocolosExtensions;

import java.util.ArrayList;
import java.util.List;


public class CreatLista {
    List<Protocolo> listaDeProtocolos = new ArrayList<>();  
    
    public void addLista (Protocolo a){
        listaDeProtocolos.add(a);
    }
    
    public Protocolo retornaLista(){
        return listaDeProtocolos.get(0);
    }
    
}

