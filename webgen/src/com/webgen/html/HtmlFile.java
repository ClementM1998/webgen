package com.webgen.html;

import com.webgen.Element;

public abstract class HtmlFile extends Element {
    private Html html = new Html();
    private Head head = new Head();
    private Body body = new Body();

    public HtmlFile() {

        html(html);
        if (!html.isAttributesActive()) add("<html>");
        else for (String line : html.getArrays()) add(line);

        head(head);
        if (!head.isAttributesActive()) add("    <head>");
        for (String line : head.getArrays()) add(line);
        add("    </head>");

        body(body);
        if (!body.isAttributesActive()) add("    <body>");
        for (String line : body.getArrays()) add(line);
        add("    </body>");

        add("</html>");
    }

    public void html(Html html) {}

    public abstract void head(Head head);
    public abstract void body(Body body);
}
