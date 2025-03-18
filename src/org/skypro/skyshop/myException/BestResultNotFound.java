package org.skypro.skyshop.myException;

import java.io.IOException;

public class BestResultNotFound extends Exception {

    public BestResultNotFound(String request){
        super(request);
    }
}
