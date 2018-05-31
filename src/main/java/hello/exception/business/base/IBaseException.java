package hello.exception.business.base;

/**
 * Every exception must throw an ErrorCode
 */
public interface IBaseException {

    ErrorCode getErrorCode();

}
