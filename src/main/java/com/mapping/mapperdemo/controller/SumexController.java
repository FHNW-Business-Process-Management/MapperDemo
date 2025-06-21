package com.mapping.mapperdemo.controller;

import com.mapping.mapperdemo.dto.DoxisDto;
import com.mapping.mapperdemo.dto.SumexDto;
import com.mapping.mapperdemo.mapper.CaseMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/map")
public class SumexController {
    private final CaseMapper mapper;

    public SumexController(CaseMapper mapper) {
        this.mapper = mapper;
    }

    @PostMapping
    public DoxisDto mapSumexToDoxis(@RequestBody SumexDto sumexDto) {
        return mapper.toDoxisDto(sumexDto);
    }
}
