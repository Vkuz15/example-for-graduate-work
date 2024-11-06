package ru.skypro.homework.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Comment {

    @Schema(description = "id автора объявления")
    private Integer author;

    @Schema(description = "Ссылка на аватар автора объявления")
    private String authorImage;

    @Schema(description = "Имя создателя комментария")
    private String authorFirstName;

    @Schema(description = "Дата и время создания комментария в миллисекундах с 00:00:00 01.01.1970")
    private Integer createAd;

    @Schema(description = "id комментария")
    private Integer id;

    @Schema(description = "Текст комментария")
    private String text;
}
