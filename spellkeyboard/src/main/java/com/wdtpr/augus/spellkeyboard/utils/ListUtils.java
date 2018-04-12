package com.wdtpr.augus.spellkeyboard.utils;

import java.util.List;
import java.util.Map;

/**
 * Created by augus on 2017/12/8.
 * list 工具類
 */

public class ListUtils {

    /**
     * 取得 list 長度
     * @param sourceList
     *
     * @return
     */
    public static <V> int getSize(List<V> sourceList) {
        return sourceList == null ? 0 : sourceList.size();
    }

    /**
     * 檢查 list 是否為空
     * @param sourceList
     *
     * @return
     */
    public static <V> boolean isEmpty(List<V> sourceList) {
        return (sourceList == null || sourceList.size() == 0);
    }


    /**
     * 檢查 map 是否為空
     * @param sourceList
     * @return
     */
    public static  boolean isEmpty(Map sourceList) {
        return (sourceList == null || sourceList.size() == 0);
    }

}
