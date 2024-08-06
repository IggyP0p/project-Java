public class App 
{

    public static void main(String args[]) 
    {
        controleRemoto cr = new controleRemoto(new Navio());

        cr.mover();

        controleRemoto cr1 = new controleRemoto(new Helicoptero());

        cr1.mover();

        controleRemoto cr2 = new controleRemoto(new Caminhao());

        cr2.mover();
    }
}