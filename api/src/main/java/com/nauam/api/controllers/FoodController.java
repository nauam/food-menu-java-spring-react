package com.nauam.api.controllers;

import com.nauam.api.dto.FoodRequestDTO;
import com.nauam.api.dto.FoodResponseDTO;
import com.nauam.api.model.Food;
import com.nauam.api.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity<FoodResponseDTO> save(@RequestBody FoodRequestDTO foodRequestDTO) {
        return Optional.of(repository.save(new Food(foodRequestDTO)))
                .map(food -> new ResponseEntity<>(new FoodResponseDTO(food), HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/{uuid}")
    public ResponseEntity<FoodResponseDTO> findByUuid(@PathVariable UUID uuid) {
        return repository.findById(uuid)
                .map(food -> new ResponseEntity<>(new FoodResponseDTO(food), HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{uuid}")
    public ResponseEntity<?> deleteByUuid(@PathVariable UUID uuid) {
        Optional<Food> foodModelOptional = repository.findById(uuid);

        if(foodModelOptional.isEmpty())
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Food not found");

        repository.delete(foodModelOptional.get());
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Food deleted success");
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> findAll() {
        return repository.findAll().stream().map(FoodResponseDTO::new).toList();
    }
}
