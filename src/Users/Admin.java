package Users;
/*
 * Object:Class tem como objetivo validar usuarios adm.
 */
public class Admin {
    //status : ok
    final String name ="admin";
    final String senha = "1234";
    
    public int verificarUserAdm(String name , String senha){
        int aux = 0;
        if(this.name.equals(name)){
            aux += 1;
            if (this.senha.equals(senha)){
            aux += 1;
            }
        }
        return aux ;
    }
}
