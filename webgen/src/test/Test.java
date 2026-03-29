package test;

import com.webgen.*;
import com.webgen.css.Style;
import com.webgen.css.StyleFile;
import com.webgen.html.*;
import com.webgen.js.Script;
import com.webgen.js.ScriptFile;

public class Test {
    public static void main(String[] args) {

        ChromeBrowser chrome = new ChromeBrowser();

        chrome.createHtml(new HtmlFile() {

            @Override
            public void html(Html html) {
                html.attributes(Attributes.Lang("ms"));
            }

            @Override
            public void head(Head head) {
                head.meta_charset("UTF-8");
                head.title("Website Saya");
                head.link("index.css");
            }

            @Override
            public void body(Body body) {
                body.h1("Selamat Datang");
                body.p("Ini contoh website simple", Attributes.Id("text"));
                body.button("Klik Saya", Attributes.Onclick("tukarTeks()"));
                body.script(Attributes.Src("index.js"));
            }
        });

        chrome.createStyle(new StyleFile() {
            @Override
            public void style(Style style) {
                style.add("body", new Property[] {
                        Property.Background("#222"),
                        Property.Color("white"),
                        Property.TextAlign("center"),
                        Property.FontFamily("Arial"),
                });
                style.add("h1", new Property[] {
                        Property.Color(Property.Cyan)
                });
                style.add("button", new Property[] {
                        Property.Padding(10, 20, "px"),
                        Property.Background(Property.Orange),
                        Property.Border(Property.None),
                        Property.Cursor(Property.Pointer)
                });
                style.add("button:hover", new Property[] {
                        Property.Background(Property.Red),
                        Property.Color(Property.Blue)
                });
            }
        });

        chrome.createScript(new ScriptFile() {
            @Override
            public void script(Script script) {
                //script.addStatement(Statement.Let("name"));
                script.addFunction("tukarTeks()", new Statement[] {
                        Statement.VariableGetInnerHtml("text", "text"),
                        Statement.VariableSetInnerHtml("text", "Teks telah berubah!"),
                });
                script.addFunction("fungsi", new Statement[] {

                });
                /*
                script.addStatement(Statement.LetArray("orang", new Object[] {
                        "Ali",
                        "Boby",
                        "Carlos",
                        "Darren"
                }));
                script.addStatement(Statement.LetArray("data", new Object[] {
                        "{ nama: 'Ali', umur: 20 }",
                        "{ nama: 'Abu', umur: 25 }",
                }));*/
            }
        });

        WebGen.launch(chrome);
    }
}
