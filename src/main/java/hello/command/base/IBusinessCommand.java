package hello.command.base;

import hello.exception.business.base.BusinessCommandException;

/**
 *
 * @param <I> Incoming Parameter
 * @param <O> Outgoing Response
 */
public interface IBusinessCommand<I, O> {

    O execute(I i) throws BusinessCommandException;

}
