public class ProfessorLimiteException extends Exception {
    // Caso haja a tentativa de incluir mais de 5 professores
    public ProfessorLimiteException(String message)
    {
        super(message);
    }
}
