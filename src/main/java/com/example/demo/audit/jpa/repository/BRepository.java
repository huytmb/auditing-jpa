package com.example.demo.audit.jpa.repository;

import com.example.demo.audit.jpa.entity.B;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BRepository extends JpaRepository<B, Integer> {
}
