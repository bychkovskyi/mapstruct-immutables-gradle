package com.example.mapstruct.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class UserDtoTest {

    @Test
    void name() {
        final UserDto foo = new UserDto("foo");

        assertThat(foo.getUserName()).isEqualTo("foo");
    }
}
