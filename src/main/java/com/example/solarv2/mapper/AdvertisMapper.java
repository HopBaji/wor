package com.example.solarv2.mapper;



import com.example.solarv2.Request.AdvertisRequest;
import com.example.solarv2.Response.AdvertisResponse;
import com.example.solarv2.model.Advertisement;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


import java.util.List;

@Mapper(componentModel = "spring")
    public interface AdvertisMapper {

        @Mapping(target = "id", ignore = true)
        @Mapping(target = "createDateTime", ignore = true)
        @Mapping(target = "seller", constant = "user")
        @Mapping(target = "category", source = "category")
        @Mapping(target = "condition", source = "condition")
        @Mapping(target = "name", source = "name")
        @Mapping(target = "description",source = "description")
        Advertisement toAdvertisement(AdvertisRequest advertisRequest);

        AdvertisResponse toAdvertisResponse(Advertisement advertisement);

        List<AdvertisResponse> toListAdvertisResponse(List<Advertisement> items);

        @AfterMapping
        default void setDefaultValues(@MappingTarget Advertisement entity) {
            if (entity.getSubcategory() == null || entity.getSubcategory().isEmpty()) {
                entity.setSubcategory("General");
            }
        }
    }

