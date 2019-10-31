package com.mycalorielibrary.demo.controller;
//methodes repondant aux uri du microservice

import com.mycalorielibrary.demo.model.Meal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MealController {

    @GetMapping(value="/Meal")
    public Meal displayMeal(){
        Meal meal = new Meal(1, "breakfast",540);
        return meal;
    }
}
