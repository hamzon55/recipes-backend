package com.recipes.repository;


import com.recipes.domain.Recipe;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends PagingAndSortingRepository<Recipe, Long> {
    List<Recipe> findByName(@Param("name") String name);

}
