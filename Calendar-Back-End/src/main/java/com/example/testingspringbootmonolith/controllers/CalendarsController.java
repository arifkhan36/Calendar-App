package com.example.testingspringbootmonolith.controllers;

import com.example.testingspringbootmonolith.models.Calendar;
import com.example.testingspringbootmonolith.repositories.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class CalendarsController {

    @Autowired
    private CalendarRepository calendarRepository;



    @GetMapping("/calendar")
    public Iterable<Calendar> findAllCalendars() {
        return calendarRepository.findAll();
    }


    @GetMapping("/calendar/{calendarId}")
    public Optional<Calendar> findCalendarById(@PathVariable Long calendarId) {
        return calendarRepository.findById(calendarId);
    }


    @DeleteMapping("/calendar/{calendarId}")
    public HttpStatus deleteCalendarById(@PathVariable Long calendarId) {
        calendarRepository.deleteById(calendarId);
        return HttpStatus.OK;
    }

    @PostMapping("/calendar")
    public Calendar createNewCalendar(@RequestBody Calendar calendar) {
        return calendarRepository.save(calendar);
    }


    @PatchMapping("/calendar/{calendarId}")
    public Calendar updateCalendarById(@PathVariable Long calendarId, @RequestBody Calendar calendarRequest) {

        Calendar calendarFromDb = calendarRepository.findById(calendarId).get();

        return calendarRepository.save(calendarFromDb); //must be changed
    }

}
