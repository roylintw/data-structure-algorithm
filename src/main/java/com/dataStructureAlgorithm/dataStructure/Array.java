package com.dataStructureAlgorithm.dataStructure;

import com.dataStructureAlgorithm.vo.Foo;

public class Array {
    public static void main(String[] args) {
        // 整數陣列
        // 宣告和初始化陣列
        int[] numbers = new int[3]; // 宣告一個長度為 3 的整數陣列
        // 為陣列賦值
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        // 字串陣列
        // 宣告和初始化陣列
        String[] strings = new String[3]; // 宣告一個長度為 3 的字串陣列
        // 為陣列賦值
        strings[0] = "Hello";
        strings[1] = "World";
        strings[2] = "!";
        // Object 陣列
        Foo[] objectArray = new Foo[3];
        objectArray[0] = new Foo();
        objectArray[1] = new Foo();
        objectArray[2] = new Foo();
    }
}
