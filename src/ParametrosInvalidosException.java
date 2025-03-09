public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem); //passará a mensagem para o contrutor da classe pai
    }
}