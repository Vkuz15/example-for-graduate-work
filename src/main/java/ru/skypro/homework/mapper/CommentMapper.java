package ru.skypro.homework.mapper;

import org.mapstruct.Mapper;
import ru.skypro.homework.dto.Comment;
import ru.skypro.homework.model.CommentModel;

@Mapper(componentModel = "spring", uses = {UserMapper.class, ExtendedAdMapper.class})
public interface CommentMapper {

    CommentModel toDTO(Comment model);

    Comment toModel(CommentModel dto);
}
