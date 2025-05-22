package com.dataStructureAlgorithm.vo;

import java.util.ArrayList;
import java.util.List;

public class FileNode {
    String name;
    boolean isDirectory;
    List<FileNode> children;

    public FileNode(String name, boolean isDirectory) {
        this.name = name;
        this.isDirectory = isDirectory;
        if (isDirectory) {
            children = new ArrayList<>();
        }
    }

    public void addChild(FileNode child) {
        if (this.isDirectory) {
            children.add(child);
        } else {
            throw new UnsupportedOperationException("Cannot add child to a file.");
        }
    }

    public void print(String indent) {
        System.out.println(indent + (isDirectory ? "[DIR] " : "[FILE] ") + name);
        if (isDirectory) {
            for (FileNode child : children) {
                child.print(indent + "  ");
            }
        }
    }
}
