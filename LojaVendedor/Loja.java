public class Loja {

    /*
     * características: nome,ramo ,ano de fundação, vendedor e os comportamentos:
     *admitirVendedor e demitirVendedor 
     */
    
    private String nome;
    private String ramo;
    private int anoFundacao;
    private String vendedor;
    protected Vendedor v;
    
    public Loja() 
    {
        this.v = new Vendedor();
    }
    
    public void admitirVendedor() 
    {
    
    }
    
    public void demitirVendedor() 
    {
    
    }
}