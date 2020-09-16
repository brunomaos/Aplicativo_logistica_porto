package Users;
/**
 * Objetivo validar usuario employee.
 * @author bruno
 */
public class Employee {
    //status: ok
    final String name = "employee";
    final String senha = "1234";

    public int verificarUserEmployee(String name , String senha){
        int aux = 0;
        if(this.name.equals(name)){
            aux += 1;
            if(this.senha.equals(senha)){
                aux += 1;
            }
        }
        return aux;
    }
}
