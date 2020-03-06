package ua.testing.springlocalechangerdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.testing.springlocalechangerdemo.repository.LocaleRepository;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name="locales")
public class PageLocale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String locale;

    @Column
    private String messageKey;

    @Column(name="messageContent")
    private String content;
}
