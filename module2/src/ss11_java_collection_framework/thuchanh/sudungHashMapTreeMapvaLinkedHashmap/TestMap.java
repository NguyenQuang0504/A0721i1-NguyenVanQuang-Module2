package ss11_java_collection_framework.thuchanh.sudungHashMapTreeMapvaLinkedHashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Quang",22);
        hashMap.put("Thuy",22);
        hashMap.put("Khanh",22);
        hashMap.put("Vui", 22);
        hashMap.put("Tu",22);
        System.out.println("Danh sach khi chua sap xep!!!!");
        System.out.println(hashMap);
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Danh sach sau khi sap xep!!!!!!!");
        System.out.println(treeMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Quang",22);
        linkedHashMap.put("Thuy",22);
        linkedHashMap.put("Khanh",22);
        linkedHashMap.put("Vui", 22);
        linkedHashMap.put("Tu",22);
        System.out.println("\nThe age for " + "Quang is " + linkedHashMap.get("Quang"));
    }
}
