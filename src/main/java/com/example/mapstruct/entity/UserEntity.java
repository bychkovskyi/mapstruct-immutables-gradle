package com.example.mapstruct.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserEntity {
    private final String userName;

    public UserEntity() {
        this.userName = "";
    }
}
