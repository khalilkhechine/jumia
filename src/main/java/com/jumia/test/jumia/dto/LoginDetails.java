package com.jumia.test.jumia.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginDetails {

    private String email;
    private String password;
}
