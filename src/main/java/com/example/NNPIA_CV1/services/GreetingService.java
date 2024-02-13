package com.example.NNPIA_CV1.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Greetings";
    }
}
