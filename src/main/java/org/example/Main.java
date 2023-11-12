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
    public int calSimilarity(Document doc1, Document doc2) {
        return 0;
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