/**Essa class auxiliara o historico de protocolos no porto
 * Auxilia class : dominio / inter_historico
 */
package Dados;

import ProtocolosExtensions.Protocolo;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SalvarDados {
    private String arquivo = "";
    
    public String salvarProtocolos(Protocolo p){
        try{
            FileWriter fw = new FileWriter("Protocolos.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println(p);
            
            pw.flush();
            pw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(SalvarDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Protocolo adicionado.";
    }

    public String getProtocolos() {
        Path caminhoTxt = Paths.get("Protocolos.txt");
        try {
            byte[] texto = Files.readAllBytes(caminhoTxt);
            arquivo = new String(texto);
        } catch (IOException ex) {
            System.out.println("Nao foi possivel ler  arquivo");
        }
        return arquivo;
    }
       
    
}
