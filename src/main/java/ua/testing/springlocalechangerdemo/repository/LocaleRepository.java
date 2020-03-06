package ua.testing.springlocalechangerdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.testing.springlocalechangerdemo.entity.PageLocale;

import java.util.Optional;

@Repository
public interface LocaleRepository extends JpaRepository<PageLocale, Long> {
    PageLocale findByKeyAndLocale(String key, String locale);
}
