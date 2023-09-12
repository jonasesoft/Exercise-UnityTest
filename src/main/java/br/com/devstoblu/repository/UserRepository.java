package br.com.devstoblu.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.devstoblu.models.User;

public interface UserRepository extends JpaRepository<User, UUID> {

}
