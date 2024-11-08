package ru.skypro.homework.mapper;

import org.mapstruct.Mapper;
import ru.skypro.homework.dto.ExtendedAd;
import ru.skypro.homework.model.ExtendedAdModel;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface ExtendedAdMapper {

    ExtendedAdModel toDTO(ExtendedAd model);

    ExtendedAd toModel(ExtendedAdModel dto);
}
