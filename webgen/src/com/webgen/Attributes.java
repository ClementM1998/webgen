package com.webgen;

import java.util.ArrayList;

public final class Attributes {
    private static Attributes attrs = new Attributes();
    private ArrayList<Attributes> array = new ArrayList<>();

    private String attr = "";
    private String value = null;

    private Attributes() {}

    private Attributes(String attr, String value) {
        this.attr = attr;
        this.value = value;
    }

    private Attributes(String attr) {
        this.attr = attr;
    }

    public void clear() {
        array.clear();
        attr = "";
        value = null;
    }

    public Attributes add(String attr) {
        array.add(new Attributes(attr));
        return this;
    }

    public Attributes add(String attr, String value) {
        array.add(new Attributes(attr, value));
        return this;
    }

    public Attributes get(int id) {
        return array.get(id);
    }

    public String getLines() {
        String ret = "";
        for (Attributes attr : array) {
            if (attr.value == null) ret += attr.attr + " ";
            else ret += attr.attr + "=\"" + attr.value + "\" ";
        }
        if (ret.endsWith(" ")) ret = ret.substring(0, ret.length()-1);
        return ret;
    }

    /// Global Attributes

    public static Attributes Id(String value) {
       return attrs.add("id", value);
    }

    public static Attributes Class(String value) {
        return attrs.add("class", value);
    }

    public static Attributes Style(String value) {
        return attrs.add("style", value);
    }

    public static Attributes Title(String value) {
        return attrs.add("title", value);
    }

    public static Attributes Hidden(String value) {
        return attrs.add("hidden", value);
    }

    public static Attributes Tabindex(String value) {
        return attrs.add("tabindex", value);
    }

    public static Attributes Contenteditable(String value) {
        return attrs.add("contentediable", value);
    }

    public static Attributes Draggable(String value) {
        return attrs.add("draggable", value);
    }

    public static Attributes Lang(String value) {
        return attrs.add("lang", value);
    }

    public static Attributes Dir(String value) {
        return attrs.add("dir", value);
    }

    /// Specific Attributes

    public static Attributes Attributes(String attr, String value) {
        return attrs.add(attr, value);
    }

    public static Attributes Href(String value) {
        return attrs.add("href", value);
    }

    public static Attributes Target(String value) {
        return attrs.add("target", value);
    }

    public static Attributes Download(String value) {
        return attrs.add("download", value);
    }

    public static Attributes Src(String value) {
        return attrs.add("src", value);
    }

    public static Attributes Alt(String value) {
        return attrs.add("alt", value);
    }

    public static Attributes Width(String value) {
        return attrs.add("width", value);
    }

    public static Attributes Height(String value) {
        return attrs.add("height", value);
    }

    public static Attributes Action(String value) {
        return attrs.add("action", value);
    }

    public static Attributes Method(String value) {
        return attrs.add("method", value);
    }

    public static Attributes Type(String value) {
        return attrs.add("type", value);
    }

    public static Attributes Name(String value) {
        return attrs.add("name", value);
    }

    public static Attributes Value(String value) {
        return attrs.add("value", value);
    }

    public static Attributes Placeholder(String value) {
        return attrs.add("placeholder", value);
    }

    public static Attributes Required(String value) {
        return attrs.add("required", value);
    }

    public static Attributes Defer(String value) {
        return attrs.add("defer", value);
    }

    public static Attributes Async(String value) {
        return attrs.add("async", value);
    }

    public static Attributes Rel(String value) {
        return attrs.add("rel", value);
    }

    public static Attributes Data(String name, String value) {
        return attrs.add("data-" + name, value);
    }

    public static Attributes AriaLabel(String value) {
        return attrs.add("aria-label", value);
    }

    public static Attributes AriaHidden(String value) {
        return attrs.add("aria-hidden", value);
    }

    public static Attributes AriaExpand(String value) {
        return attrs.add("aria-expand", value);
    }

    public static Attributes AriaControl(String value) {
        return attrs.add("aria-control", value);
    }

    public static Attributes AriaLive(String value) {
        return attrs.add("aria-live", value);
    }

    public static Attributes AriaModel(String value) {
        return attrs.add("aria-model", value);
    }

    public static Attributes AriaChecked(String value) {
        return attrs.add("aria-checked", value);
    }

    public static Attributes AriaDisable(String value) {
        return attrs.add("aria-disable", value);
    }

    public static Attributes AriaDescribedby(String value) {
        return attrs.add("aria-describedby", value);
    }

    public static Attributes AriaPressed(String value) {
        return attrs.add("aria-pressed", value);
    }

    public static Attributes AriaRole(String value) {
        return attrs.add("aria-role", value);
    }

    public static Attributes Role(String value) {
        return attrs.add("role", value);
    }

    /// Event Attributes (untuk JavaScript)

    public static Attributes Event(String event, String trigger) {
        return attrs.add(event, trigger);
    }

    public static Attributes Onclick(String trigger) {
        return Event("onclick", trigger);
    }

    public static Attributes Ondblclick(String trigger) {
        return Event("ondblclick", trigger);
    }

    public static Attributes Onmouseover(String trigger) {
        return Event("onmouseover", trigger);
    }

    public static Attributes Onmouseout(String trigger) {
        return Event("onmouseout", trigger);
    }

    public static Attributes Onmousemove(String trigger) {
        return Event("onmousemove", trigger);
    }

    public static Attributes Onkeydown(String trigger) {
        return Event("onkeydown", trigger);
    }

    public static Attributes Onkeyup(String trigger) {
        return Event("onkeyup", trigger);
    }

    public static Attributes Onkeypress(String trigger) {
        return Event("onkeypress", trigger);
    }

    public static Attributes Onsubmit(String trigger) {
        return Event("onsubmit", trigger);
    }

    public static Attributes Onchange(String trigger) {
        return Event("onchange", trigger);
    }

    public static Attributes Oninput(String trigger) {
        return Event("oninput", trigger);
    }

    public static Attributes Onfocus(String trigger) {
        return Event("onfocus", trigger);
    }

    public static Attributes Onblur(String trigger) {
        return Event("onblur", trigger);
    }

    public static Attributes Onload(String trigger) {
        return Event("onload", trigger);
    }

    public static Attributes Onunload(String trigger) {
        return Event("onunload", trigger);
    }

    public static Attributes Onresize(String trigger) {
        return Event("onresize", trigger);
    }

    public static Attributes Itemscope() {
        return attrs.add("itemscope");
    }

    public static Attributes Itemtype(String value) {
        return attrs.add("itemtype", value);
    }

    public static Attributes Itemprop(String value) {
        return attrs.add("itemprop", value);
    }

    public static Attributes Disabled() {
        return attrs.add("disable");
    }

    public static Attributes Checked() {
        return attrs.add("checked");
    }

    public static Attributes Readonly() {
        return attrs.add("readonly");
    }

    public static Attributes Required() {
        return attrs.add("required");
    }

    public static Attributes Autofocus() {
        return attrs.add("autofocus");
    }

    public static Attributes Loading(String value) {
        return attrs.add("loading", value);
    }

    public static Attributes Preload(String value) {
        return attrs.add("preload", value);
    }

    public static Attributes Start(String value) {
        return attrs.add("start", value);
    }

    public static Attributes Reversed() {
        return attrs.add("reversed");
    }

    public static Attributes For(String value) {
        return attrs.add("for", value);
    }

    public static Attributes Cite(String value) {
        if (!value.startsWith("\"") && !value.endsWith("\"")) value = "\"" + value + "\"";
        else if (!value.startsWith("\"")) value = "\"" + value;
        else if (!value.endsWith("\"")) value = value + "\"";
        return attrs.add("cite", value);
    }

    public static Attributes Controls() {
        return attrs.add("controls");
    }

    public static Attributes Autoplay() {
        return attrs.add("autoplay");
    }

    public static Attributes Loop() {
        return attrs.add("loop");
    }

    public static Attributes Muted() {
        return attrs.add("muted");
    }

    public static Attributes Media(String value) {
        return attrs.add(value);
    }

    public static Attributes Srcset(String value) {
        return attrs.add("srcset", value);
    }

    public static Attributes Sizes(String value) {
        return attrs.add("sizes", value);
    }
}
