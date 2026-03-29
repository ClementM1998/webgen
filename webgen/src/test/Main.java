package test;

import com.webgen.Attributes;
import com.webgen.ChromeBrowser;
import com.webgen.Property;
import com.webgen.WebGen;
import com.webgen.css.Style;
import com.webgen.html.*;

public class Main {
    public static void main(String[] args) {

        ChromeBrowser chrome = new ChromeBrowser();

        chrome.createHtml(new HtmlFile() {

            @Override
            public void head(Head head) {
                head.title("Website");
                head.link("index.css");
                head.style(new HeadStyle() {
                    @Override
                    public void style(Style style) {
                        style.add("body", new Property[]{
                                Property.Color("#333"),
                                Property.FontSize("20px")
                        });
                        /*
                        style.add("body", new String[] {
                                "background: #333",
                                "margin: 0",
                                "padding: 0",
                                "font-family: Arial"
                        });
                        style.add("h1", new String[] {
                                "margin: 10px;",
                                "padding: 0;"
                        });
                        style.add("title::after", new String[] {
                                "color: black",
                                "content: Hello World"
                        });*/
                    }
                });
                head.attributes(Attributes.Class("theme"));
            }

            @Override
            public void body(Body body) {
                body.attributes(Attributes.Class("frame"));
                body.h1("My website", Attributes.Class("title"));
                body.button("Click Me", Attributes.Class("btn"));
            }
        });

        /*
        chrome.createStyle(new StyleFile() {
            @Override
            public void style(Style style) {

            }
        });

        chrome.createScript(new ScriptFile() {
            @Override
            public void script(Script script) {

            }
        });
         */

        WebGen.launch(chrome);

    }
}
