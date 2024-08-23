public class ProfessorExistenteException extends Exception {
    //Caso haja a tentativa de incluir um professor já existente no sistema
    public ProfessorExistenteException(String message)
    {
        super(message);
    }
}
