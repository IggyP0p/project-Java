public class ProfessorInexistenteException extends Exception {
    //Caso haja a tentativa de excluir um professor inexistente no cadastro
    public ProfessorInexistenteException(String message)
    {
        super(message);
    }
}
