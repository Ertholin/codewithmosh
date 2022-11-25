package exceptions;

import java.io.IOException;

public class Account {
    private float balance;
    public void deposit(float value) throws IOException{
        if(value <= 0)
            throw new IOException();
    }

//    // Custom exception
//    public void withdraw(float value) throws InsufficientFundsException {
//        if (value > balance)
//            throw new InsufficientFundsException();
//    }

    // Chaining Exception (Wrapping an exception inside a new General exception)
    public void withdraw(float value) throws AccountException {
        if (value > balance) {
            throw new AccountException(new InsufficientFundsException());
        }
    }
}
