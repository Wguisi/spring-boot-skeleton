package hello.exception.business.base;

public class BusinessCommandException extends Exception implements IBaseException {

    /** Código específico para uma exceção. */
    private ErrorCode errorCode;

    /**
     * Construção padrão com uma mensagem de erro.
     *
     * @param message
     */
    public BusinessCommandException(String message) {
        super(message);
    }

    public BusinessCommandException(Exception e) {
        super(e);
    }

    public BusinessCommandException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessCommandException() {
        super();
    }

    public BusinessCommandException(ErrorCode errorCode) {
        super(errorCode.getDescription());
        this.errorCode = errorCode;
    }

    public BusinessCommandException(ErrorCode errorCode, Throwable cause) {
        super(errorCode.getDescription(), cause);
        this.errorCode = errorCode;
    }

    public BusinessCommandException(Throwable cause) {
        super(cause);
    }

    /**
     * @return the errorCode
     */
    @Override
    public ErrorCode getErrorCode() {
        return errorCode;
    }

}
