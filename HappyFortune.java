package com.annotations;

import org.springframework.stereotype.Component;

@Component("myFortuneService")
public class HappyFortune implements FortuneTeller {

    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
