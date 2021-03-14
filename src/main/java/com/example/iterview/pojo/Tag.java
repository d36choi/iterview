package com.example.iterview.pojo;

import lombok.Getter;

@Getter
public enum Tag {

    NETWORK(1,"네트워크"),
    OS(2,"운영체제"),
    BACKEND(3,"백엔드"),
    FRONTEND(4,"프론트엔드");

    private final int number;
    private final String name;


    Tag(int number, String name) {
        this.number = number;
        this.name = name;
    }
}
