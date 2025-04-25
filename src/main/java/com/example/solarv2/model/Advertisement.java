package com.example.solarv2.model;

import com.example.solarv2.enums.CategoryEnum;
import com.example.solarv2.enums.ConditionEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;


@Table(name = "объявление")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "Название")
    private String name;
    @Column(name = "Описание")
    private String description;
    @Column(name = "цена")
    private int sel;
    private String Subcategory;
    @Column(name = "Категория")
    @Enumerated(EnumType.STRING)
    private CategoryEnum category;
    @Column(name = "продавец")
    private String seller;
    @Column(name = "Время создания")
    private LocalDateTime createDateTime;
    @Column(name = "адрес")
    private String address;
    @Column(name = "состояние")
    @Enumerated(EnumType.STRING)
    private ConditionEnum condition;


}

