package com.prabha.restapp.repo;

import java.util.List;

import com.prabha.restapp.model.DayForm;

public interface DayFormRepository {
    DayForm save(DayForm dayForm);
    DayForm findById(Long id);
    List<DayForm> findAll();
}
