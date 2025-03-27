package com.example.solarv2.adverrtRepo;

import com.example.solarv2.model.advertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface advertiRep extends JpaRepository<advertisement,Integer> {
}
