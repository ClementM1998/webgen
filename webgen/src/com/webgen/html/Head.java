package com.webgen.html;

import com.webgen.Attributes;
import com.webgen.Element;
import com.webgen.css.Style;

public class Head extends Element {
    private boolean attributesActive = false;

    public void attributes(Attributes attr) {
        this.attributesActive = true;
        add(0, "    <head " + attr.getLines() + ">");
        attr.clear();
    }

    public boolean isAttributesActive() {
        return attributesActive;
    }

    /// teks bebas
    public void head(String head) {
        add("        " + head);
    }

    /// <title>
    public void title(String title) {
        head("<title>" + title + "</title>");
    }

    /// <meta>
    public void meta(String name, String content) {
        head("<meta name=\"" + name + "\" content=\"" + content + "\">");
    }

    public void meta_charset() {
        meta_charset("UTF-8");
    }

    public void meta_charset(String charset) {
        head("<meta charset=\"" + charset + "\">");
    }

    public void meta_responsive() {
        meta("viewport", "width=device-width, initial-scale=1.0");
    }

    public void meta_responsive(String name, String content) {
        meta(name, content);
    }

    public void meta_description(String content) {
        meta("description", content);
    }

    public void meta_keywords(String content) {
        meta("keywords", content);
    }

    public void meta_author(String content) {
        meta("author", content);
    }

    public void meta_robots(String content) {
        /*
         * <meta name="robots" content="index, follow">
         *
         * Nilai:
         * index -> benarkan Google simpan page
         * noindex -> jangan simpan
         * follow -> ikut link dalam page
         * nofollow -> jangan ikut link
         */
        meta("robots", content);
    }

    public void meta_refresh(String content) {
        meta_http_equiv("refresh", content);
    }

    public void meta_http_equiv(String http_equiv, String content) {
        head("<meta http-equiv=\"" + http_equiv + "\" content=\"" + content + "\">");
    }

    public void meta_property(String property, String content) {
        head("<meta property=\"" + property + "\" content=\"" + content + "\">");
    }

    public void meta_theme_color(String content) {
        meta("theme-color", content);
    }

    public void meta_apple_mobile() {
        meta("apple-mobile-web-app-capable", "yes");
    }

    /// <link>
    public void link(String style) {
        link("stylesheet", style);
    }

    public void link(String rel, String style) {
        head("<link rel=\"" + rel + "\" href=\"" + style + "\">");
    }

    /// <style>
    public void style(String style) {
        head("<style>");
        head(style);
        head("</style>");
    }

    public void style(HeadStyle style) {
        head("<style>");
        for (Style styles : style.getStyle().getStyles()) {
            head("    " + styles.selector() + " {");
            for (String propertyValue : styles.propertyValues()) {
                if (!propertyValue.endsWith(";")) propertyValue += ";";
                head("        " + propertyValue);
            }
            head("    }");
        }
        head("</style>");
    }

    /// <base>
    public void base(String href) {
        head("<base href=\"" + href + "\">");
    }

}
