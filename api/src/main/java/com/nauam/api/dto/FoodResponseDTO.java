package com.nauam.api.dto;

import com.nauam.api.model.Food;

import java.util.UUID;

public record FoodResponseDTO(UUID uuid, String title, String image, Integer price) {
    public FoodResponseDTO(Food food) {
        this(food.getUuid(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
