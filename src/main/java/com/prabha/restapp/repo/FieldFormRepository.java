package com.prabha.restapp.repo;
import java.util.List;

import com.prabha.restapp.model.FieldForm;

public interface FieldFormRepository {
    FieldForm save(FieldForm fieldForm);
    FieldForm findById(Long id);
    List<FieldForm> findAll();
}
