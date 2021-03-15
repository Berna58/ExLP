/**
 * Realizado a Março de 2021
 * @author Berna
 */
public class Porto 
{
    
    private int ctNavios;
    private int noMaxNavios;
    private Navio[] navios;

    /**
     *
     * @param noMaxNavios
     */
    public Porto(int noMaxNavios) 
    {
        this.noMaxNavios = noMaxNavios;
        navios = new Navio[noMaxNavios];
        ctNavios = 0;
    }

    /**
     * Recebe o valor dos getNavios
     *
     * @return the value of navios
     */
    public Navio[] getNavios() 
    {
        return navios;
    }

    /**
     * Recebe o valor do noMaxNavios
     *
     * @return the value of noMaxNavios
     */
    public int getNoMaxNavios() 
    {
        return noMaxNavios;
    }

    /**
     *
     * @param n
     */
    public void novoNavio(Navio n)
    {
        if(ctNavios == noMaxNavios) 
        {
            System.out.println("Número máximo de navios (" + noMaxNavios + ") atingido!");
            return;
        }
            
        boolean enc = false;
        for(int i=0;i<ctNavios;i++)
        {
            if(n.getMatricula().equals(navios[i].getMatricula())) 
            {
                enc = true;
                System.out.println("Matricula existente: " + n.getMatricula());
            }
        }
        if (!enc) 
        {
            navios[ctNavios] = n;
            ctNavios++;
        } 
    }
    
    /**
     * Capacidade Total dos Navios
     * 
     * @return TOTAL
     */
    public float getCapacidadeTotal()
    {
        float total = 0;
        for(int i=0; i<ctNavios; i++)
        {
            if( navios[i] instanceof Petroleiro)
                total += ((Petroleiro) navios[i]).getCarga();
            if( navios[i] instanceof PortaContentores)
                total += ((PortaContentores) navios[i]).getNoContentores() * 10;
        }
        return total;
    }
    
    /**
     * Main do Programa
     * 
     * @param args
     */
    public static void main(String[] args) 
    {
        Porto porto = new Porto(10);
        Petroleiro petro1 = new Petroleiro("1"); petro1.setCarga(200);
        PortaContentores pConta1 = new PortaContentores("0001"); pConta1.setNoContentores(50);
        PortaContentores pConta2 = new PortaContentores("0002"); pConta2.setNoContentores(20);
        Navio n = new Navio("1");
        Petroleiro petro2 = new Petroleiro("2"); petro2.setCarga(200);
        
        porto.novoNavio(petro1);
        porto.novoNavio(petro2);
        porto.novoNavio(pConta1);
        porto.novoNavio(pConta2);
        porto.novoNavio(n);
        
        System.out.println("Capacidade total = " + porto.getCapacidadeTotal() + " toneladas.");
    }
}
