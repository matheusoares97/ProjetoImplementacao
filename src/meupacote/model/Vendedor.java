/** Classe Vendedor com objetos, valores e seus métodos.
 * 
 * @author Matheus Soares
 * 
 */
package meupacote.model;

/**@author Matheus_Soares
 * 
 * @see Classe sem nenhum tipo extensão de outras classes.
 * 
 */
public class Vendedor extends Funcionario {
    
    private String areadetrabalho;
    private double comissao;
    private int numerocodigo;
    
   private Gerente meuGerente;

   /** @autor Edilson Bernardo
    * 
    * Método para retorno do nome do setor que o vendedor trabalha
    * 
     *   @return String  - Nome da AreadeTrabalho do Vendedor */
    public String getAreadetrabalho() {
        return areadetrabalho;
    }

    /**@param areadetrabalho 
     * 
     * Parâmetro para pegar o nome da Area de Trabalho.
     * 
     */
    public void setAreadetrabalho(String areadetrabalho) {
        this.areadetrabalho = areadetrabalho;
    }

    /** @autor Edilson Bernardo 
     * 
     * Método para retorno do valor da comissão que o vendedor 
     * ganha por produto vendido.
     * 
     *   @return double  - Valor da Comissão ganha */
    public double getComissao() {
        return comissao;
    }

    /**@param comissao 
     * 
     * Parâmetro para pegar o valor da Comissão do Vendedor.
     * 
     */
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    /** @autor Matheus Soares
     * 
     * Método para retornar o nome do gerente da classe Gerente.
     * 
     *   @return Gerente  - Gerente do Vendedor */
    public Gerente getMeuGerente() {
        return meuGerente;
    }

    /**@param meuGerente 
     * 
     * Parâmetro para pegar o nome do Gerente do Vendedor a partir
     * da classe do Gerente.
     * 
     */
    public void setMeuGerente(Gerente meuGerente) {
        this.meuGerente = meuGerente;
    }

    /** @autor Kerolayne Cardoso
     *
     * Método para retorno do número, que é o código do vendedor
     * 
     *   @return int  - Nr do Código do Vendedor */
    public int getNumerocodigo() {
        return numerocodigo;
    }

    /** @autor Kerolayne Cardoso
     * 
     * @param numerocodigo 
     * 
     * Parâmetro para pegar o número que vai ser o Código do Vendedor.
     * 
     */
    public void setNumerocodigo(int numerocodigo) {
        this.numerocodigo = numerocodigo;
    }

}