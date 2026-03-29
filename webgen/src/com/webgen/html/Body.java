package com.webgen.html;

import com.webgen.Attributes;
import com.webgen.Element;
import com.webgen.js.Script;

public class Body extends Element {
    private boolean attributesActive = false;

    public void attributes(Attributes attr) {
        this.attributesActive = true;
        add(0, "    <body " + attr.getLines() + ">");
        attr.clear();
    }

    public boolean isAttributesActive() {
        return attributesActive;
    }

    public void body(String body) {
        add("        " + body);
    }

    /// #### Layout ####
    public void headerOpen() {
        body("<header>");
    }

    public void headerOpen(Attributes attr) {
        body("<header " + attr.getLines() + ">");
        attr.clear();
    }

    public void headerClose() {
        body("</header>");
    }

    public void header(String content) {
        body("<header>");
        body("    " + content);
        body("</header");
    }

    public void header(String content, Attributes attr) {
        body("<header " + attr.getLines() + ">");
        attr.clear();
        body("    " + content);
        body("</header>");
    }

    public void navOpen() {
        body("<nav>");
    }

    public void navOpen(Attributes attr) {
        body("<nav " + attr.getLines() + ">");
        attr.clear();
    }

    public void navClose() {
        body("</nav>");
    }

    public void nav(String content) {
        body("<nav>");
        body("    " + content);
        body("</nav>");
    }

    public void nav(String content, Attributes attr) {
        body("<nav " + attr.getLines() + ">");
        attr.clear();
        body("    " + content);
        body("</nav>");
    }

    public void mainOpen() {
        body("<main>");
    }

    public void mainOpen(Attributes attr) {
        body("<main " + attr.getLines() + ">");
        attr.clear();
    }

    public void mainClose() {
        body("</main>");
    }

    public void main(String content) {
        body("<main>");
        body("    " + content);
        body("</main>");
    }

    public void main(String content, Attributes attr) {
        body("<main " + attr.getLines() + ">");
        body("    " + content);
        body("</main>");
    }

    public void sectionOpen() {
        body("<section>");
    }

    public void sectionOpen(Attributes attr) {
        body("<section " + attr.getLines() + ">");
        attr.clear();
    }

    public void sectionClose() {
        body("</section>");
    }

    public void section(String content) {
        body("<section>");
        body("    " + content);
        body("</section>");
    }

    public void section(String content, Attributes attr) {
        body("<section " + attr.getLines() + ">");
        attr.clear();
        body("    " + content);
        body("</section>");
    }

    public void articleOpen() {
        body("<article>");
    }

    public void articleOpen(Attributes attr) {
        body("<article " + attr.getLines() + ">");
        attr.clear();
    }

    public void articleClose() {
        body("</article>");
    }

    public void article(String content) {
        body("<article>");
        body("    " + content);
        body("</article>");
    }

    public void article(String content, Attributes attr) {
        body("<article " + attr.getLines() + ">");
        attr.clear();
        body("    " + content);
        body("</article>");
    }

    public void asideOpen() {
        body("<aside>");
    }

    public void asideOpen(Attributes attr) {
        body("<aside " + attr.getLines() + ">");
        attr.clear();
    }

    public void asideClose() {
        body("</aside>");
    }

    public void aside(String content) {
        body("<aside>");
        body("   " + content);
        body("</aside>");
    }

    public void aside(String content, Attributes attr) {
        body("<aside " + attr.getLines() + ">");
        attr.clear();
        body("   " + content);
        body("</aside>");
    }

    public void footerOpen() {
        body("<footer>");
    }

    public void footerOpen(Attributes attr) {
        body("<footer " + attr.getLines() + ">");
        attr.clear();
    }

    public void footerClose() {
        body("</footer>");
    }

    public void footer(String content) {
        body("<footer>");
        body("    " + content);
        body("</footer>");
    }

    public void footer(String content, Attributes attr) {
        body("<footer " + attr.getLines() + ">");
        attr.clear();
        body("    " + content);
        body("</footer>");
    }

    /// #### Text & Content ####
    public void h1Open() {
        body("<h1>");
    }

    public void h1Open(Attributes attr) {
        body("<h1 " + attr.getLines() + ">");
        attr.clear();
    }

    public void h1Close() {
        body("</h1>");
    }

    public void h1(String h1) {
        body("<h1>" + h1 + "</h1>");
    }

    public void h1(String h1, Attributes attr) {
        body("<h1 " + attr.getLines() + ">" + h1 + "</h1>");
        attr.clear();
    }

    public void h2Open() {
        body("<h2>");
    }

    public void h2Open(Attributes attr) {
        body("<h2 " + attr.getLines() + ">");
        attr.clear();
    }

    public void h2Close() {
        body("</h2>");
    }

    public void h2(String h2) {
        body("<h2>" + h2 + "</h2>");
    }

    public void h2(String h2, Attributes attr) {
        body("<h2 " + attr.getLines() + ">" + h2 + "</h2>");
        attr.clear();
    }

    public void h3Open() {
        body("<h3>");
    }

    public void h3Open(Attributes attr) {
        body("<h3 " + attr.getLines() + ">");
        attr.clear();
    }

    public void h3Close() {
        body("</h3>");
    }

    public void h3(String h3) {
        body("<h3>" + h3 + "</h3>");
    }

    public void h3(String h3, Attributes attr) {
        body("<h3 " + attr.getLines() + ">" + h3 + "</h3>");
        attr.clear();
    }

    public void h4Open() {
        body("<h4>");
    }

    public void h4Open(Attributes attr) {
        body("<h4 " + attr.getLines() + ">");
        attr.clear();
    }

    public void h4Close() {
        body("</h4>");
    }

    public void h4(String h4) {
        body("<h4>" + h4 + "</h4>");
    }

    public void h4(String h4, Attributes attr) {
        body("<h4 " + attr.getLines() + ">" + h4 + "</h4>");
        attr.clear();
    }

    public void h5Open() {
        body("<h5>");
    }

    public void h5Open(Attributes attr) {
        body("<h5 " + attr.getLines() + ">");
        attr.clear();
    }

    public void h5Close() {
        body("</h5>");
    }

    public void h5(String h5) {
        body("<h5>" + h5 + "</h5>");
    }

    public void h5(String h5, Attributes attr) {
        body("<h5 " + attr.getLines() + ">" + h5 + "</h5>");
        attr.clear();
    }

    public void h6Open() {
        body("<h6>");
    }

    public void h6Open(Attributes attr) {
        body("<h6 " + attr.getLines() + ">");
        attr.clear();
    }

    public void h6Close() {
        body("</h6>");
    }

    public void h6(String h6) {
        body("<h6>" + h6 + "</h6>");
    }

    public void h6(String h6, Attributes attr) {
        body("<h6 " + attr.getLines() + ">" + h6 + "</h6>");
        attr.clear();
    }

    public void pOpen() {
        body("<p>");
    }

    public void pOpen(Attributes attr) {
        body("<p " + attr.getLines() + ">");
        attr.clear();
    }

    public void pClose() {
        body("</p>");
    }

    public void p(String p) {
        body("<p>" + p + "</p>");
    }

    public void p(String p, Attributes attr) {
        body("<p " + attr.getLines() + ">" + p + "</p>");
        attr.clear();
    }

    public void spanOpen() {
        body("<span>");
    }

    public void spanOpen(Attributes attr) {
        body("<span " + attr.getLines() + ">");
        attr.clear();
    }

    public void spanClose() {
        body("</span>");
    }

    public void span(String span) {
        body("<span>" + span + "</span>");
    }

    public void span(String span, Attributes attr) {
        body("<span " + attr.getLines() + ">" + span + "</span>");
        attr.clear();
    }

    public void divOpen() {
        body("<div>");
    }

    public void divOpen(Attributes attr) {
        body("<div " + attr.getLines() + ">");
        attr.clear();
    }

    public void divClose() {
        body("</div>");
    }

    public void div(String div) {
        body("<div>" + div + "</div>");
    }

    public void div(String div, Attributes attr) {
        body("<div " + attr.getLines() + ">" + div + "</div>");
        attr.clear();
    }

    public void br() {
        body("<br>");
    }

    public void br(Attributes attr) {
        body("<br " + attr.getLines() + ">");
        attr.clear();
    }

    public void hr() {
        body("<hr>");
    }

    public void hr(Attributes attr) {
        body("<hr " + attr.getLines() + ">");
        attr.clear();
    }

    /// #### Link & Media ####
    public void aOpen() {
        body("<a>");
    }

    public void aOpen(Attributes attr) {
        body("<a " + attr.getLines() + ">");
        attr.clear();
    }

    public void aClose() {
        body("</a>");
    }

    public void a(String content) {
        body("<a>" + content + "</a>");
    }

    public void a(String content, Attributes attr) {
        body("<a " + attr.getLines() + ">" + content + "</a>");
        attr.clear();
    }

    public void img(Attributes attr) {
        body("<img " + attr.getLines() + ">");
        attr.clear();
    }

    public void audioOpen() {
        body("<audio>");
    }

    public void audioOpen(Attributes attr) {
        body("<audio " + attr.getLines() + ">");
        attr.clear();
    }

    public void audioClose() {
        body("</audio>");
    }

    public void videoOpen() {
        body("<video>");
    }

    public void videoOpen(Attributes attr) {
        body("<video " + attr.getLines() + ">");
        attr.clear();
    }

    public void videoClose() {
        body("</video>");
    }

    public void pictureOpen() {
        body("<picture>");
    }

    public void pictureOpen(Attributes attr) {
        body("<picture " + attr.getLines() + ">");
        attr.clear();
    }

    public void pictureClose() {
        body("</picture>");
    }

    public void source(Attributes attr) {
        body("<source " + attr.getLines() + ">");
        attr.clear();
    }

    /// #### List ####
    public void ulOpen() {
        body("<ul>");
    }

    public void ulOpen(Attributes attr) {
        body("<ul " + attr.getLines() + ">");
        attr.clear();
    }

    public void ulClose() {
        body("</ul>");
    }

    public void olOpen() {
        body("<ol>");
    }

    public void olOpen(Attributes attr) {
        body("<ol " + attr.getLines() + ">");
        attr.clear();
    }

    public void olClose() {
        body("</ol>");
    }

    public void liOpen() {
        body("<li>");
    }

    public void liOpen(Attributes attr) {
        body("<li " + attr.getLines() + ">");
        attr.clear();
    }

    public void liClose() {
        body("</li>");
    }

    public void li(String li) {
        body("<li>" + li + "</li>");
    }

    public void li(String li, Attributes attr) {
        body("<li " + attr.getLines() + ">" + li + "<li>");
        attr.clear();
    }

    /// #### Form ####
    public void formOpen() {
        body("<form>");
    }

    public void formOpen(Attributes attr) {
        // action = ke mana data dihantar
        // method = cara hantar (GET atau POST)
        body("<form " + attr.getLines() + ">");
        attr.clear();
    }

    public void formClose() {
        body("</form>");
    }

    public void form(String content) {
        body("<form>");
        body("    " + content);
        body("</form>");
    }

    public void form(String content, Attributes attr) {
        body("<form " + attr.getLines() + ">");
        attr.clear();
        body("    " + content);
        body("</form>");
    }

    public void input(Attributes attr) {
        body("<input " + attr.getLines() + ">");
        attr.clear();
    }

    public void textareaOpen() {
        body("<textarea>");
    }

    public void textareaOpen(Attributes attr) {
        body("<textarea " + attr.getLines() + ">");
        attr.clear();
    }

    public void textareaClose() {
        body("</textarea>");
    }

    public void textarea(String content) {
        body("<textarea>");
        body("    " + content);
        body("</textarea>");
    }

    public void textarea(String content, Attributes attr) {
        body("<textarea " + attr.getLines() + ">");
        attr.clear();
        body("    " + content);
        body("</textarea>");
    }

    public void buttonOpen() {
        body("<button>");
    }

    public void buttonOpen(Attributes attr) {
        body("<button " + attr.getLines() + ">");
        attr.clear();
    }

    public void buttonClose() {
        body("</button>");
    }

    public void button(String content) {
        body("<button>" + content + "</button>");
    }

    public void button(String content, Attributes attr) {
        body("<button " + attr.getLines() + ">" + content + "</button>");
        attr.clear();
    }

    public void selectOpen() {
        body("<select>");
    }

    public void selectOpen(Attributes attr) {
        body("<select " + attr.getLines() + ">");
        attr.clear();
    }

    public void selectClose() {
        body("</select>");
    }

    public void optionOpen() {
        body("<option>");
    }

    public void optionOpen(Attributes attr) {
        body("<option " + attr.getLines() + ">");
        attr.clear();
    }

    public void optionClose() {
        body("</option>");
    }

    public void option(String content) {
        body("<option>" + content + "</option>");
    }

    public void option(String content, Attributes attr) {
        body("<option " + attr.getLines() + ">" + content + "</option>");
        attr.clear();
    }

    public void labelOpen() {
        body("<label>");
    }

    public void labelOpen(Attributes attr) {
        body("<label " + attr.getLines() + ">");
        attr.clear();
    }

    public void labelClose() {
        body("</label>");
    }

    public void label(String content) {
        body("<label>" + content + "</label>");
    }

    public void label(String content, Attributes attr) {
        body("<label " + attr.getLines() + ">" + content + "</label>");
        attr.clear();
    }

    /// #### Table ####

    public void tableOpen() {
        body("<table>");
    }

    public void tableOpen(Attributes attr) {
        body("<table " + attr.getLines() + ">");
        attr.clear();
    }

    public void tableClose() {
        body("</table>");
    }

    public void trOpen() {
        body("<tr>");
    }

    public void trOpen(Attributes attr) {
        body("<tr " + attr.getLines() + ">");
        attr.clear();
    }

    public void trClose() {
        body("</tr>");
    }

    public void tdOpen() {
        body("<td>");
    }

    public void tdOpen(Attributes attr) {
        body("<td " + attr.getLines() + ">");
        attr.clear();
    }

    public void tdClose() {
        body("</td>");
    }

    public void thOpen() {
        body("<th>");
    }

    public void thOpen(Attributes attr) {
        body("<th " + attr.getLines() + ">");
        attr.clear();
    }

    public void thClose() {
        body("</th>");
    }

    public void scriptOpen() {
        body("<script>");
    }

    public void scriptOpen(Attributes attr) {
        body("<script " + attr.getLines() + ">");
        attr.clear();
    }

    public void scriptClose() {
        body("</script>");
    }

    public void script(String script) {
        body("<script>");
        body(script);
        body("</script>");
    }

    public void script(Attributes attr) {
        body("<script " + attr.getLines() + "></script>");
    }

    public void script(Script script) {
        body("<script>");

        body("</script>");
    }

    public void noscriptOpen() {
        body("<noscript>");
    }

    public void noscriptClose() {
        body("</noscript>");
    }

    public void noscript(String noscript) {
        body("<noscript>");
        body(noscript);
        body("</noscript>");
    }

    public void blockquoteOpen() {
        body("<blockquote>");
    }

    public void blockquoteOpen(Attributes attr) {
        body("<blockquote " + attr.getLines() + ">");
        attr.clear();
    }

    public void blockquoteClose() {
        body("</blockquote>");
    }

    public void blockquote(String value) {
        body("<blockquote>");
        body("    " + value);
        body("</blockquote>");
    }

    public void blockquote(String value, Attributes attr) {

    }

    public void preOpen() {
        body("<pre>");
    }

    public void preOpen(Attributes attr) {
        body("<pre " + attr.getLines() + ">");
        attr.clear();
    }

    public void preClose() {
        body("</pre>");
    }

}
