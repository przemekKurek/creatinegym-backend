package com.example.bd2.service;

import com.example.bd2.model.DTO.ReportDTO;
import com.example.bd2.model.Sale;
import com.example.bd2.repository.SaleRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReportService {

    private SaleRepository saleRepository;

    public ReportService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }


    public List<ReportDTO> generateReport()
    {
        List<ReportDTO> result = new ArrayList<>();
        List<Sale> sales = saleRepository.findAll();
        for(Sale x : sales)
        {
            ReportDTO reportRow = new ReportDTO();
            reportRow.setProductName(x.getProduct().getProductType().getName());
            reportRow.setAmount(x.getAmount());
            reportRow.setPrice(x.getProduct().getProductType().getSellingPrice());
            reportRow.setSum(reportRow.getPrice().multiply(BigDecimal.valueOf(reportRow.getAmount())));
            BigDecimal purchase = x.getProduct().getProductType().getPurchasePrice().multiply(BigDecimal.valueOf(reportRow.getAmount()));
            reportRow.setGain(reportRow.getSum().subtract(purchase));
            result.add(reportRow);
        }
        return result;
    }

}
