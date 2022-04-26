package com.greenfox.frontend.services;

import com.greenfox.frontend.models.ErrorMessage;
import com.greenfox.frontend.models.Greeter;
import org.springframework.stereotype.Service;

@Service
public class GreeterServiceImpl implements GreeterService {

    @Override
    public Greeter getGreeter(String name, String title) {
        return new Greeter(name, title);
    }

    @Override
    public ErrorMessage getError(String name, String title) {
        if (name == null && title == null) {
            return new ErrorMessage("Please provide a name and a title!");
        }
        else if (name != null && title == null) {
            return new ErrorMessage("Please provide a title!");
        }
        return new ErrorMessage();
    }
}
