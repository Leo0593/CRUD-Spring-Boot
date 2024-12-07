package org.example.restspring_2.repository;

import org.example.restspring_2.Model.Prestec;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestecRepository extends JpaRepository<Prestec, Integer> {
}