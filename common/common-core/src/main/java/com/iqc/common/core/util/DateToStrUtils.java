package com.iqc.common.core.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liuziw
 */
public class DateToStrUtils {

    public static String dateToStrByPattern(Date date, String pattern)
    {
        if ((date == null) || (date.equals(""))) {
            return null;
        }
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.format(date);
    }
}