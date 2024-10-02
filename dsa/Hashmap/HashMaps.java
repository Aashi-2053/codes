package com.dsa.Hashmap;


import java.util.HashMap;
import java.util.HashSet;

class MapUsingHash{
    private Entity[] entities;
    public MapUsingHash(){
        entities=new Entity[100];
    }
    public void put(String key, String value){
        int hash=Math.abs(key.hashCode()% entities.length);
        entities[hash]=new Entity(key,value);
    }
    public String get(String key){
        int hash=Math.abs(key.hashCode()% entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }
    public void remove(String key){
        int hash=Math.abs(key.hashCode()% entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }

    private class Entity{
        String key,value;
        public Entity(String key,String value){
            this.key=key;
            this.value=value;
        }
    }
}
public class HashMaps {

    public static void main(String[] args) {
        //String n="Aashi";
        //int code=n.hashCode();
        //System.out.println(code);


        HashMap<String,Integer> map=new HashMap<>();
        map.put("Aashi",88);
        map.put("Kunal",98);
        map.put("Siya",87);
        System.out.println(map.get("Kunal"));
        System.out.println(map.containsKey("Siya"));
        System.out.println(map.getOrDefault("hi",77));


        HashSet<Integer> set=new HashSet<>();
        set.add(54);
        set.add(45);
        set.add(87);
        set.add(54);
        System.out.println(set);


        MapUsingHash map1=new MapUsingHash();
        map1.put("mango","king");
        map1.put("apple","red");
        map1.put("guava","fav");

        System.out.println(map1.get("guava"));


    }
}
