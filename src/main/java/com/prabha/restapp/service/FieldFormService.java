package com.prabha.restapp.service;
import java.util.List;

import com.prabha.restapp.model.FieldForm;

public interface FieldFormService {
    FieldForm saveFieldForm(FieldForm fieldForm);
    FieldForm getFieldForm(Long id);
    List<FieldForm> getAllFieldForms();
}
