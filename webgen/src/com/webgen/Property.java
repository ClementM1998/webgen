package com.webgen;

public class Property {
    private String name;
    private String value;

    // Saiz
    public static final String Pixel = "px";
    public static final String Em = "em";
    public static final String Rem = "rem";
    public static final String Per = "%";
    public static final String Vw = "vw";
    public static final String Vh = "vh";

    // Khas
    public static final String Auto = "auto";
    public static final String None = "none";
    public static final String Inherit = "inherit";
    public static final String Initial = "initial";
    public static final String Unset = "unset";

    public static final String Block = "block";
    public static final String Inline = "inline";
    public static final String InlineBlock = "inline-block";
    public static final String Flex = "flex";
    public static final String Grid = "grid";
    public static final String Contents = "contents";
    public static final String ListItem = "list-item";

    public static final String Static = "static";
    public static final String Relative = "relative";
    public static final String Absolute = "absolute";
    public static final String Fixed = "fixed";
    public static final String Sticky = "sticky";

    public static final String Red = "red";
    public static final String Blue = "blue";
    public static final String Green = "green";
    public static final String Black = "blue";
    public static final String White = "white";
    public static final String Gray = "gray";
    public static final String Yellow = "yellow";
    public static final String Purple = "purple";
    public static final String Orange = "orange";
    public static final String Cyan = "cyan";
    public static final String Transparent = "transparent";

    public static final String Cover = "cover";
    public static final String Contain = "contain";

    public static final String Repeat = "repeat";
    public static final String NoRepeat = "no-repeat";
    public static final String RepeatX = "repeat-x";
    public static final String RepeatY = "repeat-y";

    public static final String Normal = "normal"; // biasa (~ 400)
    public static final String Bold = "bold"; // bold (~700)

    public static final String Serif = "serif";
    public static final String SansSerif = "sans-serif";
    public static final String Monospace = "monospace";
    public static final String Cursive = "cursive";
    public static final String Fantasy = "fantasy";
    public static final String SystemUI = "system-ui";

    public static final String XXSmall = "xx-small";
    public static final String XSmall = "x-small";
    public static final String Small = "small";
    public static final String Medium = "medium";
    public static final String Large = "large";
    public static final String XLarge = "x-large";
    public static final String XXLarge = "xx-large";

    public static final String Italic = "italic";
    public static final String Oblique = "oblique";
    public static final String SmallCaps = "small-caps";

    public static final String Left = "left";
    public static final String Center = "center";
    public static final String Right = "right";
    public static final String Justify = "justify";

    public static final String Underline = "underline";
    public static final String LineThrough = "line-through";
    public static final String Overline = "overline";
    public static final String Blink = "blink";

    public static final String Uppercase = "uppercase";
    public static final String Lowercase = "lowercase";
    public static final String Capitalize = "capitalize";

    public static final String Thin = "thin";
    public static final String Thick = "thick";

    public static final String Solid = "solid";
    public static final String Dashed = "dashed";
    public static final String Dotted = "dotted";
    public static final String Double = "double";
    public static final String Groove = "groove";
    public static final String Ridge = "ridge";
    public static final String Inset = "inset";
    public static final String Outset = "outset";
    public static final String Hidden = "hidden";

    public static final String Row = "row";
    public static final String RowReverse = "row-reverse";
    public static final String Column = "column";
    public static final String ColumnReverse = "column-reverse";

    public static final String FlexStart = "flex-start";
    public static final String FlexEnd = "flex-end";
    public static final String SpaceBetween = "space-between";
    public static final String SpaceAround = "space-around";
    public static final String SpaceEvenly = "space-evenly";

    public static final String Stretch = "stretch";
    public static final String Baseline = "baseline";

    public static final String Slide = "slide";
    public static final String Infinite = "infinite";
    public static final String Bounce = "bounce";
    public static final String Fade = "fade";

    public static final String All = "all";
    public static final String Width = "width";
    public static final String Height = "height";
    public static final String Background = "background";
    public static final String Color = "color";
    public static final String Opacity = "opacity";
    public static final String Transform = "transform";

    public static final String Ease = "ease";
    public static final String Linear = "linear";
    public static final String EaseIn = "ease-in";
    public static final String EaseOut = "ease-out";
    public static final String EaseInOut = "ease-in-out";

    public static final String Default = "default";
    public static final String Pointer = "pointer";
    public static final String Help = "help";
    public static final String Wait = "wait";
    public static final String Progress = "progress";
    public static final String ContextMenu = "context-menu";

    public static final String Text = "text";
    public static final String VerticalText = "vertical-text";
    public static final String Cell = "cell";
    public static final String Crosshair = "crosshair";

    public static final String Move = "move";
    public static final String Grab = "grab";
    public static final String Grabbing = "grabbing";
    public static final String AllScroll = "all-scroll";

    public static final String NResize = "n-resize";
    public static final String SResize = "s-resize";
    public static final String EResize = "e-resize";
    public static final String WResize = "w-resize";

    public static final String NSResize = "ns-resize";
    public static final String EWResize = "ew-resize";

    public static final String NEResize = "ne-resize";
    public static final String NWResize = "nw-resize";
    public static final String SEResize = "se-resize";
    public static final String SWResize = "sw-resize";

    public static final String NESWResize = "nesw-resize";
    public static final String NWSEResize = "nwse-resize";
    public static final String COLResize = "col-resize";
    public static final String ROWResize = "row-resize";

    public static final String ZoomIn = "zoom-in";
    public static final String ZoomOut = "zoom-out";

    public static final String NotAllowed = "not-allowed";
    public static final String NoDrop = "no-drop";
    public static final String Alias = "alias";
    public static final String Copy = "copy";

    public static final String Visible = "visible";
    public static final String Collapse = "collapse";

    public static final String Revert = "revert";
    public static final String RevertLayer = "revert-layer";

    public static final String Scroll = "scroll";
    public static final String Clip = "clip";

    public static final String Fill = "fill";
    public static final String ScaleDown = "scale-down";

    private Property(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String name() {
        return name;
    }

    public String value() {
        return value;
    }

    public static String checkSizing(int size, String typeSize) {
        String value;
        if (typeSize.equals("px")) value = String.valueOf(size).concat("px");
        else if (typeSize.equals("em")) value = String.valueOf(size).concat("em");
        else if (typeSize.equals("rem")) value = String.valueOf(size).concat("rem");
        else if (typeSize.equals("%")) value = String.valueOf(size).concat("%");
        else if (typeSize.equals("vw")) value = String.valueOf(size).concat("vw");
        else if (typeSize.equals("vh")) value = String.valueOf(size).concat("vh");
        else value = String.valueOf(size);
        return value;
    }

    public static Property Width(int value) {
        return Width(String.valueOf(value));
    }

    public static Property Width(String value) {
        /*
         * Nilai boleh:
         *   auto
         */
        return new Property("width", value);
    }

    public static Property Width(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("width", value);
    }

    public static Property Height(int value) {
        return Height(String.valueOf(value));
    }

    public static Property Height(String value) {
        /*
         * Nilai boleh:
         *   auto
         */
        return new Property("height", value);
    }

    public static Property Height(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("height", value);
    }

    public static Property MaxWidth(int value) {
        return MaxWidth(String.valueOf(value));
    }

    public static Property MaxWidth(String value) {
        /*
         * Nilai boleh:
         *   none
         *   auto
         */
        return new Property("max-width", value);
    }

    public static Property MaxWidth(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("max-width", value);
    }

    public static Property MinHeight(int value) {
        return MinHeight(String.valueOf(value));
    }

    public static Property MinHeight(String value) {
        /*
         * Nilai boleh:
         *   none
         *   auto
         */
        return new Property("min-height", value);
    }

    public static Property MinHeight(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("min-height", value);
    }

    public static Property Margin(int value) {
        return Margin(String.valueOf(value));
    }

    public static Property Margin(String value) {
        /*
         * Nilai boleh:
         *   auto
         */
        return new Property("margin", value);
    }

    public static Property Margin(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("margin", value);
    }

    public static Property Margin(int topbottom, int rightleft) {
        return Margin(String.valueOf(topbottom), String.valueOf(rightleft));
    }

    public static Property Margin(int topbottom, int rightleft, String typeSize) {
        String tb = checkSizing(topbottom, typeSize);
        String rl = checkSizing(rightleft, typeSize);
        return Margin(tb, rl);
    }

    public static Property Margin(String topbottom, String rightleft) {
        String value = topbottom.trim() + " " + rightleft.trim();
        return new Property("margin", value);
    }

    public static Property Margin(int top, int rightleft, int bottom) {
        return Margin(String.valueOf(top), String.valueOf(rightleft), String.valueOf(bottom));
    }

    public static Property Margin(int top, int rightleft, int bottom, String typeSize) {
        return Margin(checkSizing(top, typeSize), checkSizing(rightleft, typeSize), checkSizing(bottom, typeSize));
    }

    public static Property Margin(String top, String rightleft, String bottom) {
        String value = top.trim() + " " + rightleft.trim() + " " + bottom.trim();
        return new Property("margin", value);
    }

    public static Property Margin(int top, int right, int bottom, int left) {
        return Margin(String.valueOf(top), String.valueOf(right), String.valueOf(bottom), String.valueOf(left));
    }

    public static Property Margin(int top, int right, int bottom, int left, String typeSize) {
        return Margin(checkSizing(top, typeSize), checkSizing(right, typeSize), checkSizing(bottom, typeSize), checkSizing(left, typeSize));
    }

    public static Property Margin(String top, String right, String bottom, String left) {
        return new Property("margin", top.trim() + " " + right.trim() + " " + bottom.trim() + " " + left.trim());
    }

    public static Property MarginTop(int value) {
        return MarginTop(String.valueOf(value));
    }

    public static Property MarginTop(int value, String typeSize) {
        return MarginTop(checkSizing(value, typeSize));
    }

    public static Property MarginTop(String value) {
        return new Property("margin-top", value);
    }

    public static Property MarginRight(int value) {
        return MarginRight(String.valueOf(value));
    }

    public static Property MarginRight(int value, String typeSize) {
        return MarginRight(checkSizing(value, typeSize));
    }

    public static Property MarginRight(String value) {
        return new Property("margin-right", value);
    }

    public static Property MarginBottom(int value) {
        return MarginBottom(String.valueOf(value));
    }

    public static Property MarginBottom(int value, String typeSize) {
        return MarginBottom(checkSizing(value, typeSize));
    }

    public static Property MarginBottom(String value) {
        return new Property("margin-bottom", value);
    }

    public static Property MarginLeft(int value) {
        return MarginLeft(String.valueOf(value));
    }

    public static Property MarginLeft(int value, String typeSize) {
        return MarginLeft(checkSizing(value, typeSize));
    }

    public static Property MarginLeft(String value) {
        return new Property("margin-left", value);
    }

    public static Property Padding(int value) {
        return Padding(String.valueOf(value));
    }

    public static Property Padding(String value) {
        return new Property("padding", value);
    }

    public static Property Padding(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("padding", value);
    }

    public static Property Padding(int topbottom, int rightleft) {
        return Padding(String.valueOf(topbottom), String.valueOf(rightleft));
    }

    public static Property Padding(int topbottom, int rightleft, String typeSize) {
        String tb = checkSizing(topbottom, typeSize);
        String rl = checkSizing(rightleft, typeSize);
        return Padding(tb, rl);
    }

    public static Property Padding(String topbottom, String rightleft) {
        String value = topbottom.trim() + " " + rightleft.trim();
        return new Property("padding", value);
    }

    public static Property Padding(int top, int rightleft, int bottom) {
        return Padding(String.valueOf(top), String.valueOf(rightleft), String.valueOf(bottom));
    }

    public static Property Padding(int top, int rightleft, int bottom, String typeSize) {
        return Padding(checkSizing(top, typeSize), checkSizing(rightleft, typeSize), checkSizing(bottom, typeSize));
    }

    public static Property Padding(String top, String rightleft, String bottom) {
        String value = top.trim() + " " + rightleft.trim() + " " + bottom.trim();
        return new Property("padding", value);
    }

    public static Property Padding(int top, int right, int bottom, int left) {
        return Padding(String.valueOf(top), String.valueOf(right), String.valueOf(bottom), String.valueOf(left));
    }

    public static Property Padding(int top, int right, int bottom, int left, String typeSize) {
        return Padding(checkSizing(top, typeSize), checkSizing(right, typeSize), checkSizing(bottom, typeSize), checkSizing(left, typeSize));
    }

    public static Property Padding(String top, String right, String bottom, String left) {
        return new Property("padding", top.trim() + " " + right.trim() + " " + bottom.trim() + " " + left.trim());
    }

    public static Property PaddingTop(int value) {
        return PaddingTop(String.valueOf(value));
    }

    public static Property PaddingTop(int value, String typeSize) {
        return PaddingTop(checkSizing(value, typeSize));
    }

    public static Property PaddingTop(String value) {
        return new Property("padding-top", value);
    }

    public static Property PaddingRight(int value) {
        return PaddingRight(String.valueOf(value));
    }

    public static Property PaddingRight(int value, String typeSize) {
        return PaddingRight(checkSizing(value, typeSize));
    }

    public static Property PaddingRight(String value) {
        return new Property("padding-right", value);
    }

    public static Property PaddingBottom(int value) {
        return PaddingBottom(String.valueOf(value));
    }

    public static Property PaddingBottom(int value, String typeSize) {
        return PaddingBottom(checkSizing(value, typeSize));
    }

    public static Property PaddingBottom(String value) {
        return new Property("padding-bottom", value);
    }

    public static Property PaddingLeft(int value) {
        return PaddingLeft(String.valueOf(value));
    }

    public static Property PaddingLeft(int value, String typeSize) {
        return PaddingLeft(checkSizing(value, typeSize));
    }

    public static Property PaddingLeft(String value) {
        return new Property("padding-left", value);
    }

    public static Property Display(String value) {
        /*
         * Nilai:
         *   block
         *   inline
         *   inline-block
         *   flex
         *   grid
         *   none
         *   contents
         *   list-item
         */
        return new Property("display", value);
    }

    public static Property Position(String value) {
        /*
         * Nilai:
         *   static
         *   relative
         *   absolute
         *   fixed
         *   sticky
         */
        return new Property("position", value);
    }

    public static Property Top(int value) {
        return Top(String.valueOf(value));
    }

    public static Property Top(String value) {
        /*
         * Nilai boleh:
         *   auto
         */
        return new Property("top", value);
    }

    public static Property Top(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("top", value);
    }

    public static Property Left(int value) {
        return Left(String.valueOf(value));
    }

    public static Property Left(String value) {
        /*
         * Nilai boleh:
         *   auto
         */
        return new Property("left", value);
    }

    public static Property Left(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("left", value);
    }

    public static Property Right(int value) {
        return Right(String.valueOf(value));
    }

    public static Property Right(String value) {
        /*
         * Nilai boleh:
         *   auto
         */
        return new Property("right", value);
    }

    public static Property Right(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("right", value);
    }

    public static Property Bottom(int value) {
        return Bottom(String.valueOf(value));
    }

    public static Property Bottom(String value) {
        /*
         * Nilai boleh:
         *   auto
         */
        return new Property("bottom", value);
    }

    public static Property Bottom(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("bottom", value);
    }

    public static Property ZIndex(int value) {
        return ZIndex(String.valueOf(value));
    }

    public static Property ZIndex(String value) {
        /*
         * Nilai boleh:
         *   auto
         */
        return new Property("z-index", value);
    }

    public static Property ZIndex(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("z-index", value);
    }

    public static Property Background(String value) {
        return new Property("background", value);
    }

    public static Property Background(int red, int green, int blue) {
        return new Property("background", "rgb(" + red + ", " + green + ", " + blue + ")");
    }

    public static Property Background(int red, int green, int blue, float alpha) {
        return new Property("background", "rgba(" + red + ", " + green + ", " + blue + ", " + alpha + ")");
    }

    public static Property BackgroundColor(String value) {
        return new Property("background-color", value);
    }

    public static Property BackgroundColor(int red, int green, int blue) {
        return new Property("background-color", "rgb(" + red + ", " + green + ", " + blue + ")");
    }

    public static Property BackgroundColor(int red, int green, int blue, float alpha) {
        return new Property("background-color", "rgba(" + red + ", " + green + ", " + blue + ", " + alpha + ")");
    }

    public static Property BackgroundImageUrl(String value) {
        if (!value.startsWith("\"") && !value.endsWith("\"")) value = "\"" + value + "\"";
        else if (!value.startsWith("\"")) value = "\"" + value;
        else if (!value.endsWith("\"")) value = value + "\"";
        return new Property("background-image", "url(" + value + ")");
    }

    public static Property BackgroundSize(String value) {
        return new Property("background-size", value);
    }

    public static Property BackgroundRepeat(String value) {
        return new Property("background-repeat", value);
    }

    public static Property BackgroundPosition(String value) {
        return new Property("background-position", value);
    }

    public static Property BackgroundPosition(String horiz, String vert) {
        return new Property("background-position", horiz + " " + vert);
    }

    public static Property BackgroundPosition(int x, int y, String typeSize) {
        String valueX = checkSizing(x, typeSize);
        String valueY = checkSizing(y, typeSize);
        return new Property("background-position", valueX + " " + valueY);
    }

    public static Property Color(String value) {
        return new Property("color", value);
    }

    public static Property Color(int red, int green, int blue) {
        return new Property("color", "rgb(" + red + ", " + green + ", " + blue + ")");
    }

    public static Property Color(int red, int green, int blue, float alpha) {
        return new Property("color", "rgba(" + red + ", " + green + ", " + blue + ", " + alpha + ")");
    }

    public static Property FontSize(String value) {
        return new Property("font-size", value);
    }

    public static Property FontSize(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("font-size", value);
    }

    public static Property FontWeight(String value) {
        return new Property("font-weight", value);
    }

    public static Property FontFamily(String value) {
        return new Property("font-family", value);
    }

    public static Property FontStyle(String value) {
        return new Property("font-style", value);
    }

    public static Property FontVariant(String value) {
        return new Property("font-variant", value);
    }

    public static Property Font(String value) {
        return new Property("font", value);
    }

    public static Property TextAlign(String value) {
        return new Property("text-align", value);
    }

    public static Property TextDecoration(String value) {
        return new Property("text-decoration", value);
    }

    public static Property TextTransform(String value) {
        return new Property("text-transform", value);
    }

    public static Property LineHeight(String value) {
        return new Property("line-height", value);
    }

    public static Property LineHeight(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("line-height", value);
    }

    public static Property LetterSpacing(String value) {
        return new Property("letter-spacing", value);
    }

    public static Property LetterSpacing(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("letter-spacing", value);
    }

    public static Property WordSpacing(String value) {
        return new Property("word-spacing", value);
    }

    public static Property WordSpacing(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("word-spacing", value);
    }

    public static Property BoxShadow(String value) {
        return new Property("box-shadow", value);
    }

    public static Property BoxShadow(String offsetx, String offsety, String blurRadius, String color) {
        return new Property("box-shadow", offsetx + " " + offsety + " " + blurRadius + " " + color);
    }

    public static Property BoxShadow(String offsetx, String offsety, String blurRadius, String spreadRadius, String color, String inset) {
        return new Property("box-shadow", offsetx + " " + offsety + " " + blurRadius + " " + spreadRadius + " " + color + " " + inset);
    }

    public static Property TextShadow(String value) {
        return new Property("text-shadow", value);
    }

    public static Property TextShadow(String offsetx, String offsety, String blurRadius, String color) {
        return new Property("text-shadow", offsetx + " " + offsety + " " + blurRadius + " " + color);
    }

    public static Property Border(String value) {
        return new Property("border", value);
    }

    public static Property Border(String width, String style, String color) {
        return new Property("border", width + " " + style + " " + color);
    }

    public static Property BorderWidth(String value) {
        return new Property("border-width", value);
    }

    public static Property BorderWidth(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("border-width", value);
    }

    public static Property BorderStyle(String value) {
        return new Property("border-style", value);
    }

    public static Property BorderColor(String value) {
        return new Property("border-color", value);
    }

    public static Property BorderRadius(String value) {
        return new Property("border-radius", value);
    }

    public static Property BorderRadius(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("border-radius", value);
    }

    public static Property FlexDirection(String value) {
        return new Property("flex-direction", value);
    }

    public static Property JustifyContent(String value) {
        return new Property("justify-content", value);
    }

    public static Property AlignItems(String value) {
        return new Property("align-items", value);
    }

    public static Property Gap(String value) {
        return new Property("gap", value);
    }

    public static Property Gap(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("gap", value);
    }

    public static Property Gap(String row, String column) {
        return new Property("gap", row + " " + column);
    }

    public static Property RowGap(String value) {
        return new Property("row-gap", value);
    }

    public static Property RowGap(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("row-gap", value);
    }

    public static Property ColumnGap(String value) {
        return new Property("column-gap", value);
    }

    public static Property ColumnGap(int size, String typeSize) {
        String value = checkSizing(size, typeSize);
        return new Property("column-gap", value);
    }

    public static Property GridTemplateColumns(String value) {
        return new Property("grid-template-columns", value);
    }

    public static Property GridTemplateRows(String value) {
        return new Property("grid-template-rows", value);
    }

    public static Property Transition(String value) {
        return new Property("transition", value);
    }

    public static Property Transition(String property, String duration, String timingFunction, String delay) {
        return new Property("transition", property + " " + duration + " " + timingFunction + " " + delay);
    }

    public static Property AnimationName(String value) {
        return new Property("animation-name", value);
    }

    public static Property AnimationDuration(String value) {
        return new Property("animation-duration", value);
    }

    public static Property AnimationIterationCount(String value) {
        return new Property("animation-iteration-count", value);
    }

    public static Property Cursor(String value) {
        return new Property("cursor", value);
    }

    public static Property CursorUrl(String url, String value) {
        if (!url.startsWith("\"") && !url.endsWith("\"")) url = "\"" + url + "\"";
        else if (!url.startsWith("\"")) url = "\"" + url;
        else if (!url.endsWith("\"")) url = url + "\"";
        return new Property("cursor", "url(" + url + "), " + value);
    }

    public static Property Visibility(String value) {
        return new Property("visibility", value);
    }

    public static Property Opacity(String value) {
        return new Property("opacity", value);
    }

    public static Property Opacity(float value) {
        return new Property("opacity", String.valueOf(value));
    }

    public static Property Overflow(String value) {
        return new Property("overflow", value);
    }

    public static Property OverflowX(String value) {
        return new Property("overflow-x", value);
    }

    public static Property OverflowY(String value) {
        return new Property("overflow-y", value);
    }

    public static Property ObjectFit(String value) {
        return new Property("object-fit", value);
    }

}
