/**Classe Funcionário, com seus objetos e valores dados a cada método.
 * 
 * @author Matheus Soares
 * 
 */
package meupacote.model;

/**@author Matheus_Soares
 * 
 * @see Classe Funcionário extendida da classe Pessoa.
 * 
 */
public class Funcionario extends Pessoa {
    
    private String cargo;
    private int senha;
    private double salario;
    
    /** Método para retorno do cargo do funcionário
     *   @return String  - Nome do Cargo */
    public String getCargo() {
        return cargo;
    }

    /**@param cargo 
     * 
     * Parâmetro para pegar o nome do Cargo do Funcionário.
     * 
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /** Método para retorno da senha do funcionário
     *   @return int  - Nr da Senha */
    public int getSenha() {
        return senha;
    }

    /**@param senha 
     * 
     * Parêmetro para pegar a Senha do Funcionário.
     * 
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }

    /** Método para retorno do salário do funcionário
     *   @return double  - Valor do Salário */
    public double getSalario() {
        return salario;
    }

    /**@param salario 
     * 
     * Parâmetro para pegar o valor do Salário do Funcionário.
     * 
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

}

