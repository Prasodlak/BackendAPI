package com.greenfox.frontend.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doubling {

    private int received;
    private int result;

    public Doubling(int received) {
        this.received = received;
        this.result = received * 2;
    }
}
