package com.iqc.common.core.util;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liuziw
 */
public class ThreadPoolUtils {

    private static ExecutorService executor = Executors.newFixedThreadPool(4);

    public static void  runAsync(Runnable runnable){

        CompletableFuture.runAsync(runnable,executor);
    }

}
