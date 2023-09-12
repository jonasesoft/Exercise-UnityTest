package br.com.devstoblu.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.devstoblu.models.Library;

public interface LibraryRepository extends JpaRepository<Library, UUID> {

    Library findByUsername(String username);

    List<Library> findByNameContaining(String name);
}