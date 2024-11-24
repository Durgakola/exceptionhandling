package com.neoteric.generics;

import com.neoteric.generics.NeoMap;

public class NeoMapImpl<K,V> implements NeoMap<K,V> {

    @Override
    public void put(K key, V value) {
        System.out.println(" key "+key+" value "+value);
    }
    public void putTest(String abc,String a){
        System.out.println();
    }

}
