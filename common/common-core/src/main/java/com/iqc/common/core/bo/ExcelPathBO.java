package com.iqc.common.core.bo;

import lombok.Data;

/**
 * @author liuziw
 */
@Data
public class ExcelPathBO {

    /**
     * excel名称
     */
    private String fileName;

    /**
     * excel模板路径
     */
    private String filePath;
}
