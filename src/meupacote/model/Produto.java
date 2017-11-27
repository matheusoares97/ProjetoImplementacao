/**Classe Produto com objetos contendo valores e métodos em cada.
 * 
 *@autor Matheus Soares
 * 
 */
package meupacote.model;

/** @author Matheus_Soares
 * 
 * @see Classe sem nenhuma extensão.
 * 
 */
public class Produto {
    
    private String nome;
    private int codigo;
    private double valor;
    

    /** Método para retorno do nome do produto
     *   @return String - Nome do Produto*/
    public String getNome() {
        return nome;
    }

    /**@param nome 
     * 
     * Parâmetro para pegar o nome de cada Produto.
     * 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /** Método para retorno do código do produto
     *   @return int  - Nr do Código */
    public int getCodigo() {
        return codigo;
    }

    /**@param codigo 
     * 
     * Parâmetro para pegar o Código do Produto.
     * 
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /** Método para retorno do valor do produto
     *   @return double  - Valor do Produto */
    public double getValor() {
        return valor;
    }

    /**@param valor 
     * 
     * Parâmetro para pegar o valor do Produto.
     * 
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}