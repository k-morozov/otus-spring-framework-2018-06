package ru.otus.spring.sokolovsky.hw12.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.otus.spring.sokolovsky.hw12.domain.Genre;

import java.util.List;

@Repository
public interface GenreRepository extends MongoRepository<Genre, String> {

    List<Genre> findAll();

    Genre findByTitle(String s);
}
