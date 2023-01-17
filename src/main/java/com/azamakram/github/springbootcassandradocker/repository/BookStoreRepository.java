package com.azamakram.github.springbootcassandradocker.repository;

import com.azamakram.github.springbootcassandradocker.model.entity.BookStoreEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface BookStoreRepository extends CassandraRepository<BookStoreEntity, UUID> {
    Optional<BookStoreEntity> findByUuid(UUID uuid);
}
