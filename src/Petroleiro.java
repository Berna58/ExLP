/**
 * Realizado a Março de 2021
 * @author Berna
 */
public class Petroleiro extends Navio 
{
    private float carga;

    /**
     *
     * @param matricula
     */
    public Petroleiro(String matricula) 
    {
        super(matricula);
    }

    /**
     *
     * @return carga navio
     */
    public float getCarga() 
    {
        return carga;
    }

    /**
     *
     * @param carga
     */
    public void setCarga(float carga) 
    {
        this.carga = carga;
    }
    
    
}
