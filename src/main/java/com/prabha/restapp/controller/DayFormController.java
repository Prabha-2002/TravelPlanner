package com.prabha.restapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prabha.restapp.model.DayForm;
import com.prabha.restapp.service.DayFormService;

import java.util.List;

@RestController
@RequestMapping("/api/day-forms")
@CrossOrigin("*")

public class DayFormController {

    @Autowired
    private DayFormService dayFormService;

    @PostMapping
    public DayForm createDayForm(@RequestBody DayForm dayForm) {
        return dayFormService.saveDayForm(dayForm);
    }

    @GetMapping("/{id}")
    public DayForm getDayForm(@PathVariable Long id) {
        return dayFormService.getDayForm(id);
    }

    @GetMapping
    public List<DayForm> getAllDayForms() {
        return dayFormService.getAllDayForms();
    }
}
