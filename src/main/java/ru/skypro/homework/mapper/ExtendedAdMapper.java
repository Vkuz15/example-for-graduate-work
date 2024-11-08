package ru.skypro.homework.mapper;

import io.swagger.v3.oas.annotations.media.Schema;
import org.mapstruct.Mapper;
import ru.skypro.homework.dto.ExtendedAd;
import ru.skypro.homework.model.ExtendedAdModel;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface ExtendedAdMapper {

    @Schema(description = "Преобразование объекта модели ExtendedAd в объект DTO ExtendedAd")
    ExtendedAdModel toDTO(ExtendedAd model);

    @Schema(description = "Преобразование объекта DTO ExtendedAd в объект модели ExtendedAd")
    ExtendedAd toModel(ExtendedAdModel dto);
}
