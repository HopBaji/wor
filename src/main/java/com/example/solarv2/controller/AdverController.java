package com.example.solarv2.controller;


import com.example.solarv2.Reposit.AdvertiRep;
import com.example.solarv2.Request.AdvertisRequest;
import com.example.solarv2.Service.AdvertisServices;
import com.example.solarv2.model.Advertisement;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("v1/advertisements")
@Tag(name = "Сервис объявлений", description = "API доступа к объявлениям")

public class AdverController {

    private final AdvertisServices advertisService;

    public AdverController(AdvertisServices advertisService) {
        this.advertisService = advertisService;
    }


    @PostMapping()
    @Operation(summary = "Создание объявления")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Успех"),
            @ApiResponse(responseCode = "400", description = "Неверно переданные данные"),
            @ApiResponse(responseCode = "500", description = "Ошибка работы сервиса")
    })
    @ResponseStatus(HttpStatus.CREATED)
    public void createAdvertisement(
            @Parameter(description = "Запрос на отправку уведомления")
            @RequestBody @Valid AdvertisRequest advertisementRequest) {
        advertisService.createAdvertisement(advertisementRequest);

    }
    //Выводит записи из БД
    @Autowired
    private AdvertiRep advertiRep;
    @Operation(summary = "Вывод всех записей из бд")
    @GetMapping
    public List<Advertisement> getAllAdvertisement() {
        return advertiRep.findAll();
    }




}
