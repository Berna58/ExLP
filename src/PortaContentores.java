/**
 * Realizado a Março de 2021
 * @author Berna
 */
public class PortaContentores extends Navio 
{
    
    private int noContentores;
    
    /**
     *
     * @param matricula
     */
    public PortaContentores(String matricula) 
    {
        super(matricula);
    }

    /**
     *
     * @return 
     */
    public int getNoContentores() 
    {
        return noContentores;
    }

    /**
     *
     * @param noContentores
     */
    public void setNoContentores(int noContentores) 
    {
        this.noContentores = noContentores;
    }
    
    
}
