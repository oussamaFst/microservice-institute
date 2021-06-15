package com.elearning.simplwelearninginstitute.service;

import com.elearning.simplwelearninginstitute.entities.Prof;

import java.util.List;

public interface ProfService {

    public int save(Prof prof,Long instituteId);

    public int delete(Long id);

    public List<Prof> findAll();

    public Prof findById(Long id);


}