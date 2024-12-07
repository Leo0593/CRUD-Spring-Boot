package org.example.restspring_2.repository;

import org.example.restspring_2.Model.Llibre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LlibreRepository extends JpaRepository<Llibre, String> {


}