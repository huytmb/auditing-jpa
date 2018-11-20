package com.example.demo.audit.jpa.repository;

import com.example.demo.audit.jpa.entity.A;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ARepository extends JpaRepository<A, Integer> {
}
