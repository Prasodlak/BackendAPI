package com.greenfox.frontend.services;

import com.greenfox.frontend.models.Append;
import org.springframework.stereotype.Service;

@Service
public class AppendServiceImpl implements AppendService {

    @Override
    public Append addA(String appended) {
        return new Append(appended + "a");
    }
}
