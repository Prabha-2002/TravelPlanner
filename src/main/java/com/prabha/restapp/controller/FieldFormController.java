package com.prabha.restapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prabha.restapp.model.FieldForm;
import com.prabha.restapp.service.FieldFormService;

import java.util.List;

@RestController
@RequestMapping("/api/field-forms")
@CrossOrigin("*")

public class FieldFormController {

    @Autowired
    private FieldFormService fieldFormService;

    @PostMapping
    public FieldForm createFieldForm(@RequestBody FieldForm fieldForm) {
        return fieldFormService.saveFieldForm(fieldForm);
    }

    @GetMapping("/{id}")
    public FieldForm getFieldForm(@PathVariable Long id) {
        return fieldFormService.getFieldForm(id);
    }

    @GetMapping
    public List<FieldForm> getAllFieldForms() {
        return fieldFormService.getAllFieldForms();
    }
}
