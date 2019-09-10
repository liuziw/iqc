package com.iqc.common.excel.bo;

import lombok.Data;

import java.util.List;

/**
 * 导出excel的结果
 * @author liuziw
 */
@Data
public class ResultExcelBO {
    private String fileName;
    private String filePath;
    private List<List<Object>> contentList;

    public ResultExcelBO(){}

    public ResultExcelBO(String fileName, String filePath, List<List<Object>> contentList) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.contentList = contentList;
    }
}
