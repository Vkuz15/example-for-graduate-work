package ru.skypro.homework.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "login")
public class LoginModel {

    @Schema(minLength = 8, maxLength = 16, description = "Пароль")
    private String password;

    @Schema(minLength = 4, maxLength = 32, description = "Логин")
    @Id
    private String username;
}
