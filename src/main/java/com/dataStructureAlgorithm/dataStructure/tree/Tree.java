package com.dataStructureAlgorithm.dataStructure.tree;

import com.dataStructureAlgorithm.vo.FileNode;

public class Tree {
    public static void main(String[] args) {
        // 根目錄
        FileNode root = new FileNode("root", true);

        // 子資料夾與檔案
        FileNode documents = new FileNode("documents", true);
        documents.addChild(new FileNode("resume.docx", false));
        documents.addChild(new FileNode("notes.txt", false));

        FileNode photos = new FileNode("photos", true);
        photos.addChild(new FileNode("vacation.jpg", false));

        root.addChild(documents);
        root.addChild(photos);
        root.addChild(new FileNode("readme.txt", false));

        // 顯示整個樹
        root.print("");
    }
}
