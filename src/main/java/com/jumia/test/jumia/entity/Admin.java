package com.jumia.test.jumia.entity;


import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Admin extends User{

    private String job;
}
