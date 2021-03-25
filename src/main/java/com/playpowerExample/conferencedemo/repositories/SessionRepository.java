package com.playpowerExample.conferencedemo.repositories;

import com.playpowerExample.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
