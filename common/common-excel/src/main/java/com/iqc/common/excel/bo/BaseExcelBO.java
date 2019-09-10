package com.iqc.common.excel.bo;

import java.util.List;

/**
 * @author liuziw
 */
public interface BaseExcelBO{
    //要导出的列放入list中
    List<Object> toList();
}
