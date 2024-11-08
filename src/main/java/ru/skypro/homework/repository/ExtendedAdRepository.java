package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skypro.homework.model.ExtendedAdModel;

public interface ExtendedAdRepository extends JpaRepository<ExtendedAdModel, Long> {
}
