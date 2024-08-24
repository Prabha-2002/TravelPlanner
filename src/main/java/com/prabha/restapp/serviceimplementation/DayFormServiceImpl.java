package com.prabha.restapp.serviceimplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prabha.restapp.model.DayForm;
import com.prabha.restapp.repo.DayFormRepository;
import com.prabha.restapp.service.DayFormService;

import java.util.List;

@Service
public class DayFormServiceImpl implements DayFormService {

    @Autowired
    private DayFormRepository dayFormRepository;

    @Override
    public DayForm saveDayForm(DayForm dayForm) {
        return dayFormRepository.save(dayForm);
    }

    @Override
    public DayForm getDayForm(Long id) {
        return dayFormRepository.findById(id);
    }

    @Override
    public List<DayForm> getAllDayForms() {
        return dayFormRepository.findAll();
    }
}
