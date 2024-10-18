package com.example.springtest.dtos;

import jakarta.validation.constraints.NotBlank;


public record UserRecordDto(@NotBlank String name, @NotBlank String cpf) {

}
