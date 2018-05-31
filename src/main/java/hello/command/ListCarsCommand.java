package hello.command;

import hello.command.base.IBusinessCommand;
import hello.exception.business.base.BusinessCommandException;

import javax.inject.Named;

@Named()
public class ListCarsCommand implements IBusinessCommand<String, String> {

    @Override
    public String execute(String s) throws BusinessCommandException {
        System.out.println("Cheguei no ListCarsCommand");
        return null;
    }

}
