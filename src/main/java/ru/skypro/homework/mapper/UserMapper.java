package ru.skypro.homework.mapper;

import org.mapstruct.Mapper;
import ru.skypro.homework.dto.User;
import ru.skypro.homework.model.UserModel;

@Mapper(componentModel = "spring", uses = {LoginMapper.class})
public interface UserMapper {

    UserModel toDTO(User model);

    User toModel(UserModel dto);
}
