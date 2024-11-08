package ru.skypro.homework.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class CommentModel {

    @Schema(description = "id автора комментария")
    private Integer author;

    @Schema(description = "Ссылка на аватар автора комментария")
    private String authorImage;

    @Schema(description = "Имя создателя комментария")
    private String authorFirstName;

    @Schema(description = "Дата и время создания комментария в миллисекундах с 00:00:00 01.01.1970")
    private Integer createdAt;

    @Schema(description = "id комментария")
    @Id
    private Integer pk;

    @Schema(description = "Текст комментария")
    private String text;
}
