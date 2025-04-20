package com.example.solarv2.Service;




import com.example.solarv2.Reposit.AdvertiRep;

import com.example.solarv2.Request.AdvertisRequest;

import com.example.solarv2.mapper.AdvertisMapper;

import com.example.solarv2.model.Advertisement;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public  class AdvertisServices {

    private final AdvertisMapper advertisMapper;
    private final AdvertiRep advertiRep;


    @PostConstruct
    public void preInitialisation() {
        log.info("Создание бина AdvertisementService");
    }

    public void createAdvertisement(AdvertisRequest advertisRequest) {
        log.info("Создание объявления: {}", advertisRequest);
        Advertisement advertisement = advertisMapper.toAdvertisement(advertisRequest);
        advertiRep.save(advertisement);
    }


}