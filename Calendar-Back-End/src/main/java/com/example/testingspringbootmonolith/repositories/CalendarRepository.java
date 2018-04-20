package com.example.testingspringbootmonolith.repositories;

import com.example.testingspringbootmonolith.models.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarRepository extends JpaRepository<Calendar, Long> {
    Iterable<Calendar> findByMonth(String month);
    }
