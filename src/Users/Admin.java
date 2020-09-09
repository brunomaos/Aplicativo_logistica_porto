package Users;
/*
 * Object:Class tem como objetivo validar usuarios adm.
 */
public class Admin {
    //status : ok
    String name ="admin";
    String senha = "1234";
    
    public int verificarUserAdm(String name , String senha){
        int aux = 0;
        if(this.name.endsWith(name)){
            aux += 1;
            if (this.senha.endsWith(senha)){
            aux += 1;
            }
        }
        return aux ;
    }
}
