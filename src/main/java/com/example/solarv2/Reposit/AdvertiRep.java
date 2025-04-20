package com.example.solarv2.Reposit;

import com.example.solarv2.model.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdvertiRep extends JpaRepository<Advertisement,Long> {

}
