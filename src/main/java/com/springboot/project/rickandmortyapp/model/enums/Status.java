package com.springboot.project.rickandmortyapp.model.enums;

public enum Status {
        ALIVE("Alive"),
        DEAD("Dead"),
        UNKNOWN("unknown");
        private String value;

        Status(String value) {
            this.value = value;
        }
}