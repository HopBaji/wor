package com.example.solarv2.Request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AdvertisRequest {
    @NotBlank(message = "Наименование должно быть передано")
    private String name;
    @NotBlank
    private String category;
    @NotBlank
    private String subcategory;
    @NotBlank
    private String condition;
    @Positive
    private Integer sel;
    private String description;
    private String address;
    @PastOrPresent
    private LocalDateTime createDateTime;
}
