package com.prabha.restapp.repo;

import java.util.List;
import com.prabha.restapp.model.Tripdays;

public interface TripdaysRepository {

    void save(Tripdays tripdays);

    List<Tripdays> findAll();

    void deleteById(Long id);

    Tripdays findById(Long id);
}
