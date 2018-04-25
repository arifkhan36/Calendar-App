package com.example.testingspringbootmonolith.repositories;
import com.example.testingspringbootmonolith.models.Calendar;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CalendarRepository extends CrudRepository<Calendar, Long> {

}
