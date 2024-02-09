package com.springtest.firstProject;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile("local")
public class LocalEngine implements Engine {
    public LocalEngine() {
        System.out.println("Engine run local");
    }

    public void go() {
        System.out.println("drive");
    }
}
