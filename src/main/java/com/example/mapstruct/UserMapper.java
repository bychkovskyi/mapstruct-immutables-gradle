package com.example.mapstruct;

import com.example.mapstruct.dto.UserDto;
import com.example.mapstruct.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserDto map(UserEntity entity);
}
