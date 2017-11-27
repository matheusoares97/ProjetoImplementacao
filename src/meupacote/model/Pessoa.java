/** Classe Pessoa contendo objetos, seus valores e respectivos métodos.
 * 
 * @author Matheus Soares
 *
 */
package meupacote.model;

/** @author Matheus_Soares
 * 
 * @see Classe sem nenhuma extensão de outras classes.
 * 
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private boolean dataNacimento;


    /** Método para retorno do nome da pessoa, no caso o comprador
     *   @return String  - Nome da Pessoa */
    public String getNome() {
        return nome;
    }

    /**@param nome 
     * 
     * Parâmetro pra pegar o nome da Pessoa que vai ser o comprador.
     * 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /** Método para retorno da idade da pessoa
     *   @return int  - Valor da Idade */
    public int getIdade() {
        return idade;
    }

    /**@param idade 
     * 
     * Parâmetro para pegar a Idade da Pessoa/Comprador.
     * 
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /** Método para retorno da data de nascimento da pessoa
     * 
     * @see Método com assinatura/valor não muito apropriado para uma data.
     * 
     *   @return boolean  - Data de Nascimento da Pessoa */
    public boolean isDataNacimento() {
        return dataNacimento;
    }

    /**@param dataNacimento 
     * 
     * Parâmetro para pegar a Data de Nascimento da Pessoa/Comprador.
     * 
     * @see Parâmetro com assinatura/valor não muito apropriado para uma data.
     * 
     */
    public void setDataNacimento(boolean dataNacimento) {
        this.dataNacimento = dataNacimento;
    }
    
}