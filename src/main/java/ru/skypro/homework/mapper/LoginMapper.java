package ru.skypro.homework.mapper;

import org.mapstruct.Mapper;
import ru.skypro.homework.dto.Login;
import ru.skypro.homework.model.LoginModel;

@Mapper(componentModel = "spring")
public interface LoginMapper {

    LoginModel toDTO(Login model);

    Login toModel(LoginModel dto);
}
