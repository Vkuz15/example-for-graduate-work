package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skypro.homework.model.LoginModel;

public interface LoginRepository extends JpaRepository<LoginModel, Long> {
}
