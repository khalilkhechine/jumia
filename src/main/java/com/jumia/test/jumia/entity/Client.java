package com.jumia.test.jumia.entity;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Client extends User {

    private String address;
    private String phoneNumber;
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Command> commands;
}
