package com.example.bd2.controller;

import com.example.bd2.model.DTO.ReportDTO;
import com.example.bd2.service.ReportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportController {

    private ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping(value = "/report")
    public List<ReportDTO> getReport()
    {
        return reportService.generateReport();
    }

}


