package ru.skypro.homework.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class ExtendedAdModel {

    @Schema(description = "id объявления")
    @Id
    private Integer pk;

    @Schema(description = "Имя автора объявления")
    private String authorFirstName;

    @Schema(description = "Фамилия автора объявления")
    private String authorLastName;

    @Schema(description = "описание объявления")
    private String description;

    @Schema(description = "Логин автора объявления")
    private String email;

    @Schema(description = "Ссылка на картинку объявления")
    private String image;

    @Schema(description = "телефон автора объявления")
    private String phone;

    @Schema(description = "Цена объявления")
    private Integer price;

    @Schema(description = "Заголовок объявления")
    private String title;
}
