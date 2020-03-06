package ua.testing.springlocalechangerdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.testing.springlocalechangerdemo.entity.PageLocale;
import ua.testing.springlocalechangerdemo.repository.LocaleRepository;

import javax.validation.Valid;
import java.util.Collection;


@RestController
public class LocaleController {
    private LocaleRepository localeRepository;

    public LocaleController(LocaleRepository localeRepository) {
        this.localeRepository = localeRepository;
    }



    @GetMapping("/locales")
    Collection<PageLocale> locales() {
        return localeRepository.findAll();
    }
}
