package com.recipes.controller;


import com.recipes.domain.Recipe;
import com.recipes.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class RecipeController {


@Autowired
private RecipeRepository repository;

    @RequestMapping(value = "/recipes",method = GET)
    public Page<Recipe> findAll(Pageable page) {

        return repository.findAll(page);
    }

    @RequestMapping(path="/recipes",method = POST)
    public Recipe create(@RequestBody Recipe recipe) {

        return repository.save(recipe);
    }
}
