package hello.exception.business;

import hello.exception.business.base.BusinessCommandException;
import hello.exception.business.base.ErrorCode;

public class CarNotFoundException extends BusinessCommandException {

    public CarNotFoundException(){
        super(ErrorCode.NOT_FOUND);
    }

}
