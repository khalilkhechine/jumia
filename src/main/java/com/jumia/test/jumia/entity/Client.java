package com.jumia.test.jumia.entity;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
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
