package com.example.solarv2.mapper;

import com.example.solarv2.Request.AdvertisRequest;
import com.example.solarv2.Request.UserRequest;
import com.example.solarv2.Response.AdvertisResponse;
import com.example.solarv2.Response.UserResponse;
import com.example.solarv2.model.Advertisement;
import com.example.solarv2.model.User;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "username", source = "username")
    @Mapping(target = "password", source = "password")
    User toUser(UserRequest userRequest);

    UserResponse toUserResponse(User user);

    List<UserResponse> toListUserResponse(List<User> items);


}
