package com.example.solarv2.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdvertisResponse {
    private Long id;
    private String name;
    private String category;
    private String condition;
    private String subcategory;
    private Integer sel;
    private String description;
    private String address;
    private LocalDateTime createDateTime;
}
