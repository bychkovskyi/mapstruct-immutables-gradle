package com.example.mapstruct;

import com.example.mapstruct.dto.UserDto;
import com.example.mapstruct.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.assertj.core.api.Assertions.assertThat;

class UserMapperTest {

    @Test
    void map() {
        UserMapper mapper = Mappers.getMapper(UserMapper.class);

        UserDto foo = mapper.map(new UserEntity("foo"));

        assertThat(foo.getUserName()).isEqualTo("foo");
    }
}