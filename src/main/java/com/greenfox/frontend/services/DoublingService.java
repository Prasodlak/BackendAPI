package com.greenfox.frontend.services;

import com.greenfox.frontend.models.Doubling;
import com.greenfox.frontend.models.ErrorMessage;

public interface DoublingService {

    Doubling getDoubling(int input);
    ErrorMessage getError();
}
