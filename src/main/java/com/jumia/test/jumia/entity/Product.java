package com.jumia.test.jumia.entity;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Float price;
    private String name;
    private String description;
    private Integer quantity;
    @ManyToOne
    private Category category;
}
