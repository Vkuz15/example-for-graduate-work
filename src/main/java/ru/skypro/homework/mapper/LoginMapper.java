package ru.skypro.homework.mapper;

import io.swagger.v3.oas.annotations.media.Schema;
import org.mapstruct.Mapper;
import ru.skypro.homework.dto.Login;
import ru.skypro.homework.model.LoginModel;

@Mapper(componentModel = "spring")
public interface LoginMapper {

    @Schema(description = "Преобразование объекта модели Login в объект DTO Login")
    LoginModel toDTO(Login model);

    @Schema(description = "Преобразование объекта DTO Login в объект модели Login")
    Login toModel(LoginModel dto);
}
