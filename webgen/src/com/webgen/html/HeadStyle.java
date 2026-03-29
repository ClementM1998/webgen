package com.webgen.html;

import com.webgen.css.Style;

public abstract class HeadStyle {
    private Style style = new Style();

    public HeadStyle() {
        style(style);
    }

    public Style getStyle() {
        return style;
    }

    public abstract void style(Style style);
}
