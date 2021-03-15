/**
 * Realizado a Março de 2021
 * @author Berna
 */
public class Navio 
{
    private String matricula;
    private String nome;
    private float comprimento;

    /**
     *
     * @param matricula
     */
    public Navio(String matricula) 
    {
        this.matricula = matricula;
    }

    /**
     * 
     * @return matricula navio
     */
    public String getMatricula() 
    {
        return matricula;
    }

    /**
     *
     * @return nome navio
     */
    public String getNome() 
    {
        return nome;
    }

    /**
     *
     * @return comprimento navio
     */
    public float getComprimento() 
    {
        return comprimento;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    /**
     *
     * @param comprimento
     */
    public void setComprimento(float comprimento) 
    {
        this.comprimento = comprimento;
    }
    
    
}
