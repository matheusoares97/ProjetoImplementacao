/**Classe Gerente com seus objetos, valores e métodos específicos.
 *
 * @author Matheus Soares
 *
 */
package meupacote.model;

/** @author Matheus_Soares
 * 
 * @see Classe Gerente extendida da classe Funcionário.
 * 
 */
public class Gerente extends Funcionario {
    
    private String nomecodigo;
    private int senhaprincipal;
    private double salario;
    

    /** Método para retorno do nome do gerente que é o código dele
     *   @return String  - NomeCódigo com Gerente */
    public String getNomecodigo() {
        return nomecodigo;
    }

    /**@param nomecodigo 
     * 
     * Parâmetro para pegar o Nome, que vai ser o Código do Gerente.
     * 
     */
    public void setNomecodigo(String nomecodigo) {
        this.nomecodigo = nomecodigo;
    }

    /** Método para retorno da senha princípal do gerente
     *   @return int  - Nr da SenhaPrincípal */
    public int getSenhaprincipal() {
        return senhaprincipal;
    }

    /**@param senhaprincipal
     * 
     * Parâmetro para pegar a Senha Princípal do Gerente.
     * 
     */
    public void setSenhaprincipal(int senhaprincipal) {
        this.senhaprincipal = senhaprincipal;
    }
    
    /** Método para retorno do salário do Gerente
     * 
     * @deprecated Esse método está obsoleto.
     * 
     * @return double  - Valor do Salário */
    public double getSalario() {
        return salario;
    }

    /**@param salario 
     * 
     * @deprecated Parâmetro obsoleto
     * 
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
