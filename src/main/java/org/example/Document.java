package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Document {

    String text;
    Map<String, Integer> termMap = new HashMap<>();
    Map<String, Double> IF_IDFMap = new HashMap<>();

    /**
     * 读取文件并初始化文件类
     */
    public void init() {

    }

    /**
     * 调用分词
     */
    public List<String> segmentation() {
        return null;
    }

    /**
     * 预处理
     */
    public void preHandle() {

    }

    /**
     * 计算IF-IDF
     * @return IF-IDF
     */
    public int calIF_IDF() {
        return 0;
    }
}
