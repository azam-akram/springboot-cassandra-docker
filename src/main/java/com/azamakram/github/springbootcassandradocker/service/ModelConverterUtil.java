package com.azamakram.github.springbootcassandradocker.service;

import com.azamakram.github.springbootcassandradocker.model.entity.BookStoreEntity;
import com.azamakram.github.springbootcassandradocker.model.input.BookStoreInput;
import com.azamakram.github.springbootcassandradocker.model.output.BookStoreOutput;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ModelConverterUtil {

    public static List<BookStoreOutput> convertEntityListToOutputList(Iterable<BookStoreEntity> entities) {
        return StreamSupport.stream(entities.spliterator(), false)
                .map( entity -> convertEntityToOutput(entity))
                .collect(Collectors.toList());
    }

    public static BookStoreOutput convertEntityToOutput(BookStoreEntity entity) {
        return BookStoreOutput.builder()
                .uuid(entity.getUuid())
                .title(entity.getTitle())
                .writer(entity.getWriter())
                .publishingDate(entity.getPublishingDate())
                .build();
    }


    public static BookStoreEntity convertInputToEntity(BookStoreInput input) {
        return BookStoreEntity.builder()
                .uuid(input.getUuid())
                .title(input.getTitle())
                .writer(input.getWriter())
                .publishingDate(input.getPublishingDate())
                .build();
    }
}
