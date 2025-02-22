package com.github.devlucasjava.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
public class Product {

    private String id;
    private String name;
    private String description;
    private double price;
    private double estoque;

    @JsonIgnore
    private final Random random = new Random();

    @JsonIgnore
    private final List<String> newid = new ArrayList<>();

    public String getId() {
        if (id == null) {
            for (int i = 0; i < 8; i++) {
                int n = random.nextInt(10);
                newid.add(String.valueOf(n));
            }
            id = String.join("", newid);
        }
        return id;
    }
}
