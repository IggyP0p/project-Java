public class controleRemoto {

    public Brinquedo brinquedo;
    
    public controleRemoto(Brinquedo brinquedo) 
    {
        this.brinquedo = brinquedo;
    }
    
    
    public void mover() 
    {
        this.brinquedo.mover();
    }
}