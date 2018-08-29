package com.yfzm.util.utildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AutoTest {

    @Autowired
    private WrapBean wrapBean;

    public int getNumber(int a, int b) {
        return a + b;
    }

    public int getNumber() {
        return getNumber(wrapBean.getpA(), wrapBean.getpB());
    }
}
