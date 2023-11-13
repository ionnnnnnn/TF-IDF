package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

    List<Document> externalRegulations = new ArrayList<>();
    List<Document> internalRegulations = new ArrayList<>();
    /**
     * 储存相似度
     */
    Map<Document, Map<Document, Integer>> similarities = new HashMap<>();
    int docNum;
    /**
     * 含有某分词的文档数
     */
    Map<String, Integer> termDocMap = new HashMap<>();

    /**
     * 输入内外规文件
     */
    public void loadDocument() {

    }

    /**
     * 计算相似度
     * @param doc1 文档1
     * @param doc2 文档2
     * @return 相似度
     */
    public double calSimilarity(Document doc1, Document doc2) {
        double numerator = 0d, denominator1 = 0d, denominator2 = 0d;
        for(String term : doc1.IF_IDFMap.keySet()) {
            double wk1 = doc1.IF_IDFMap.get(term);
            double wk2 = doc2.IF_IDFMap.get(term);
            numerator += wk1 * wk2;

            denominator1 += wk1 * wk1;
            denominator2 += wk2 * wk2;
        }
        double denominator = Math.sqrt(denominator1 * denominator2);
        return numerator / denominator;
    }

    /**
     * 计算所有相似度
     */
    public void calculate() {

    }

    /**
     * 输出excel
     */
    public void outputExcel() {

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
