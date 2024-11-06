package ru.skypro.homework.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import ru.skypro.homework.model.CommentDTO;

@Data
public class Comments {

    @Schema(description = "Общее количество комментариев")
    private Integer count;

    private CommentDTO result;
}