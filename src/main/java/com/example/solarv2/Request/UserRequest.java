package com.example.solarv2.Request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserRequest {
    @NotBlank()
    private Long id;
    @NotBlank()
    private String username;
    @NotBlank()
    private String password;
}
