package ru.otus.spring.sokolovsky.hw06.services;

import ru.otus.spring.sokolovsky.hw06.domain.Book;
import ru.otus.spring.sokolovsky.hw06.domain.Comment;

public interface BookCommunityService {
    Comment registerBookComment(Book book, String comment);
}
