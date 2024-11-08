package ru.skypro.homework.mapper;

import io.swagger.v3.oas.annotations.media.Schema;
import org.mapstruct.Mapper;
import ru.skypro.homework.dto.User;
import ru.skypro.homework.model.UserModel;

@Mapper(componentModel = "spring", uses = {LoginMapper.class})
public interface UserMapper {

    @Schema(description = "Преобразование объекта модели User в объект DTO User")
    UserModel toDTO(User model);

    @Schema(description = "Преобразование объекта DTO User в объект модели User")
    User toModel(UserModel dto);
}
