package com.greenfox.frontend.services;

import com.greenfox.frontend.models.Doubling;
import com.greenfox.frontend.models.ErrorMessage;
import org.springframework.stereotype.Service;

@Service
public class DoublingServiceImpl implements DoublingService {

    @Override
    public Doubling getDoubling(int input) {
        return new Doubling(input);
    }

    @Override
    public ErrorMessage getError() {
        return new ErrorMessage("Please provide an input!");
    }
}
