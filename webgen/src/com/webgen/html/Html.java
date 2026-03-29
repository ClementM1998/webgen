package com.webgen.html;

import com.webgen.Attributes;
import com.webgen.Element;

public class Html extends Element {
    private boolean attributesActive = false;

    public void attributes(Attributes attr) {
        this.attributesActive = true;
        add(0, "<html " + attr.getLines() + ">");
        attr.clear();
    }

    public boolean isAttributesActive() {
        return attributesActive;
    }

}
