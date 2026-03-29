package com.webgen.css;

import com.webgen.Property;

import java.util.ArrayList;

public class Style {
    private ArrayList<Style> arrayStyles = new ArrayList<>();
    private String selector;
    private String[] propertyValues;
    private String value;

    public Style() {}

    private Style(String selector, String[] propertyValues) {
        this.selector = selector;
        this.propertyValues = propertyValues;
    }

    private Style(String selector, String value) {
        this.selector = selector;
        this.value = value;
    }

    public void add(String selector, String[] propertyValues) {
        arrayStyles.add(new Style(selector, propertyValues));
    }

    public void add(String selector, Property[] property) {
        if (property == null) return;
        String[] propertyValues = new String[property.length];
        for (int i = 0;i < property.length;i++) {
            propertyValues[i] = property[i].name() + ": " + property[i].value();
        }
        arrayStyles.add(new Style(selector, propertyValues));
    }

    public String selector() {
        return selector;
    }

    public String[] propertyValues() {
        return propertyValues;
    }

    public String value() {
        return value;
    }

    public ArrayList<Style> getStyles() {
        return arrayStyles;
    }

    public void clear() {
        arrayStyles.clear();
    }

}
