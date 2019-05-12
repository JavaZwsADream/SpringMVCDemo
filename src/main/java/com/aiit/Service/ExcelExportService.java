package com.aiit.Service;

import org.apache.poi.ss.usermodel.Workbook;

import java.util.Map;

public interface ExcelExportService {

    public  void makeWorkBook(Map<String,Object> model, Workbook workbook);
}
