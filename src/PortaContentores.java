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
     * Get do NoContentores
     * @return 
     */
    public int getNoContentores() 
    {
        return noContentores;
    }

    /**
     * Set do NoContentores
     * @param noContentores
     */
    public void setNoContentores(int noContentores) 
    {
        this.noContentores = noContentores;
    }
    
    
}
