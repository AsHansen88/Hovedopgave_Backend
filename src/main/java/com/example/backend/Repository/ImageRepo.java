package com.example.backend.Repository;

import com.example.backend.Model.ImageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageRepo extends JpaRepository<ImageModel, Long> {
    Optional<ImageModel> findByName(String name);
}
