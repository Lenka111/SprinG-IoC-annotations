package com.annotations;


import org.springframework.stereotype.Component;

//will register this bean id (thatSillyCoach)automatically
@Component("thatSillyCoach")
public class TennisCoach implements Coach {

    HappyFortune happyFortune;

   public TennisCoach(HappyFortune happyFortune){
        this.happyFortune = happyFortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

   @Override
    public String getDailyFortune() {
        return happyFortune.getFortune();
    }
}
