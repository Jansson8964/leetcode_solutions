package org.example.datastructure;

import java.util.ArrayList;
import java.util.List;

public class HashMapExample {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//
//        for (Map.Entry<Integer, String> kv : map.entrySet()) {
//            System.out.println(kv.getKey() + ":" + kv.getValue());
//        }
        class Pair {
            int key;
            String value;

            public void pair(int key, String value) {
                this.key = key;
                this.value = value;
            }
        }

        class ArrayHashMap {
            private List<Pair> buckets;

            public ArrayHashMap() {
                buckets = new ArrayList<>();
                for (int i = 0; i < buckets.size(); i++) {
                    buckets.add(null);
                }
            }

            // hash function
            private int hashFunc(int key) {
                int index = key % 100;
                return index;
            }
        }
    }
}
