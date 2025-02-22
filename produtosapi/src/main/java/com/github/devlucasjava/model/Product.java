package com.github.devlucasjava.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
//import javax.persistence.Entity;
import jakarta.persistence.Entity;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "product")
public class Product {

    @Id //o id ele determina que tal coisa vai ser a chave primaria
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private double price;
    @Column(name = "stock")
    private double stock;
    @Column(name = "remote")
    private boolean remote;


    //@JsonIgnore
    //private final Random random = new Random();

    //@JsonIgnore
    //private final List<String> newid = new ArrayList<>();

    //public String getId() {
    //    if (id == null) {
    //        for (int i = 0; i < 8; i++) {
    //            int n = random.nextInt(10);
    //            newid.add(String.valueOf(n));
    //        }
    //        id = String.join("", newid);
    //    }
    //    return id;
//    }
}
