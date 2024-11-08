package ru.skypro.homework.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import ru.skypro.homework.dto.Role;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "app_user")
public class UserModel {

    @Schema(description = "id пользователя")
    @Id
    private Integer id;

    @Schema(description = "Логин пользователя")
    private String email;

    @Schema(description = "Имя пользователя")
    private String firstName;

    @Schema(description = "Фамилия пользователя")
    private String lastName;

    @Schema(description = "Телефон пользователя")
    private String phone;

    @Schema(description = "Роль пользователя")
    private Role role;

    @Schema(description = "Ссылка на аватар пользователя")
    private String image;
}
