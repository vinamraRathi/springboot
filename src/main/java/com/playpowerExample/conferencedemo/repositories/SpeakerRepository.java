package com.playpowerExample.conferencedemo.repositories;

import com.playpowerExample.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
