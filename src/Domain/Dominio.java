package Domain;

import Dados.SalvarDados;
import java.awt.Label;
import ProtocolosExtensions.CreatLista;
import ProtocolosExtensions.Protocolo;


public class Dominio {
    
    SalvarDados sd = new SalvarDados();
    CreatLista cl = new CreatLista();
    public Protocolo p;
    public Protocolo c;
    private String aux ="d";
    
    public void creatProtocolFuncion(String a ,String b ,String c ,String d){
         p = new Protocolo(a, b, c, d);
         aux += String.valueOf(p);
         cl.addLista(p);
         sd.salvarProtocolos(p);
    }
    
    public String pegarProtocolo(){
        String aux = sd.getProtocolos();
        return aux;
    }
    public static void main(String[] args) {
        Dominio dom = new Dominio();
        String cod , data, tipo , status ;
        cod = "123";
        data ="11/11/2001";
        tipo = "vacina covid -19";
        status = "NEM FABRICARAM AINDA...!!! #LUTO";
        dom.creatProtocolFuncion(cod, data, tipo, status);
       // String aux = dom.pegarProtocolo();
       // System.out.println("aux = " + aux);
    }
    
}
