package Users;
/**
 * Objetivo validar usuario employee.
 * @author bruno
 */
public class Employee {
    //status: ok
    String name = "employee";
    String senha = "1234";

    public int verificarUserEmployee(String name , String senha){
        int aux = 0;
        if(this.name.endsWith(name)){
            aux += 1;
            if(this.senha.endsWith(senha)){
                aux += 1;
            }
        }
        return aux;
    }
}
