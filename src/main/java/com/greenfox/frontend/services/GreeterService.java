package com.greenfox.frontend.services;

import com.greenfox.frontend.models.ErrorMessage;
import com.greenfox.frontend.models.Greeter;

public interface GreeterService {

    Greeter getGreeter(String name, String title);
    ErrorMessage getError(String name, String title);
}
