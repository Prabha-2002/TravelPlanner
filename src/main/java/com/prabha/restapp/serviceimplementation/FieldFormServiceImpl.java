package com.prabha.restapp.serviceimplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prabha.restapp.model.FieldForm;
import com.prabha.restapp.repo.FieldFormRepository;
import com.prabha.restapp.service.FieldFormService;

import java.util.List;

@Service
public class FieldFormServiceImpl implements FieldFormService {

    @Autowired
    private FieldFormRepository fieldFormRepository;

    @Override
    public FieldForm saveFieldForm(FieldForm fieldForm) {
        return fieldFormRepository.save(fieldForm);
    }

    @Override
    public FieldForm getFieldForm(Long id) {
        return fieldFormRepository.findById(id);
    }

    @Override
    public List<FieldForm> getAllFieldForms() {
        return fieldFormRepository.findAll();
    }
}
