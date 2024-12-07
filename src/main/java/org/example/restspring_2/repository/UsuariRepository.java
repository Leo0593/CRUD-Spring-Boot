package org.example.restspring_2.repository;

import org.example.restspring_2.Model.Usuari;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariRepository extends JpaRepository<Usuari, String> {
}