package com.webgen;

import java.util.ArrayList;

public abstract class Element {
    private ArrayList<String> arrays = new ArrayList<>();

    public void add(String line) {
        arrays.add(line);
    }

    public void add(int index, String line) {
        arrays.add(index, line);
    }

    public String get(int id) {
        return arrays.get(id);
    }

    public ArrayList<String> getArrays() {
        return arrays;
    }

    public int length() {
        return arrays.size();
    }

    public void clear() {
        arrays.clear();
    }

}
