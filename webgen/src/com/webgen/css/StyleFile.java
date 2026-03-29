package com.webgen.css;

public abstract class StyleFile {
    private Style style = new Style();

    public StyleFile() {
        style(style);
    }

    public Style getStyle() {
        return style;
    }

    public abstract void style(Style style);

}
