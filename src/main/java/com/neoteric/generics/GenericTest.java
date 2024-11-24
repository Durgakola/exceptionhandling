package com.neoteric.generics;

public class GenericTest {
    public static void main(String[] args) {
        NeoMapImpl map = new NeoMapImpl();
        map.put("stringTest", "stringtest");
        map.put(1, 2);
    }
}
