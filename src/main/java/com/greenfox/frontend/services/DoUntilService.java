package com.greenfox.frontend.services;

import com.greenfox.frontend.models.DoUntil;
import com.greenfox.frontend.models.ErrorMessage;

public interface DoUntilService {

    DoUntil getDoUntil(String operation, Integer input);
    ErrorMessage getError();
}
