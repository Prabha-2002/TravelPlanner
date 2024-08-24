package com.prabha.restapp.service;

import java.util.List;

import com.prabha.restapp.model.DayForm;

public interface DayFormService {
    DayForm saveDayForm(DayForm dayForm);
    DayForm getDayForm(Long id);
    List<DayForm> getAllDayForms();
}
