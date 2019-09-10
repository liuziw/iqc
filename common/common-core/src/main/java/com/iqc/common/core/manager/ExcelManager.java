package com.iqc.common.core.manager;

import com.iqc.common.core.bo.ExcelPathBO;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Excel相关
 * @author liuziw
 */
public interface ExcelManager {

    /**
     * 导出excel
     * @param dataList 要导出的数据
     * @param excelPathBO excel模板的路径
     * @param lineIndex 哪一行开始写入内容
     * @param response
     */
    void downloadExcel(List<?> dataList, ExcelPathBO excelPathBO, int lineIndex, HttpServletResponse response);

    /**
     * 导出excel
     * @param excelPathBO excel模板的路径
     * @param dataList 要导出的数据
     * @param response
     */
    void downloadExcel(List<?> dataList, ExcelPathBO excelPathBO, HttpServletResponse response);
}
