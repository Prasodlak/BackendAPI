package com.greenfox.frontend.services;

import com.greenfox.frontend.models.DoUntil;
import com.greenfox.frontend.models.ErrorMessage;
import org.springframework.stereotype.Service;

@Service
public class DoUntilServiceImpl implements DoUntilService {

    @Override
    public DoUntil getDoUntil(String operation, Integer input) {
        int result;
        if (operation.equals("sum")) {
            int sum = 0;
            for (int i = 1; i <= input; i++) {
                sum =+ i;
            }
            result = sum;
        }
        else if (operation.equals("factor")) {
            int factor = 1;
            for (int i = 1; i <= input; i++) {
                factor = factor * i;
            }
            result = factor;
        }
    }

    @Override
    public ErrorMessage getError() {
        return new ErrorMessage("Please provide a number!");
    }
}
