package com.webgen;

public class Statement {
    private String statement;

    private Statement(String statement) {
        this.statement = statement;
    }

    public String statement() {
        return statement;
    }

    public static Statement Let(String name) {
        return new Statement("let " + name + ";");
    }

    public static Statement Let(String name, int value) {
        return new Statement("let " + name + " = " + value + ";");
    }

    public static Statement Let(String name, float value) {
        return new Statement("let " + name + " = " + value + ";");
    }

    public static Statement Let(String name, String value) {
        if (!value.startsWith("'") && !value.endsWith("'")) value = "'" + value + "'";
        else if (!value.startsWith("'")) value = "'" + value;
        else if (!value.endsWith("'")) value = value + "'";
        return new Statement("let " + name + " = " + value + ";");
    }

    public static Statement Let(String name, boolean value) {
        return new Statement("let " + name + " = " + value + ";");
    }

    public static Statement LetObject(String name, String[] values) {
        StringBuilder sb = new StringBuilder();
        sb.append("let ").append(name).append(" = {").append("\n");
        for (int i = 0;i < values.length;i++) {
            sb.append("    ").append(values[i]).append((i != (values.length-1) ? "," : "")).append("\n");
        }
        sb.append("};").append("\n");
        return new Statement(sb.toString());
    }

    public static Statement LetArray(String name, Object[] values) {
        StringBuilder sb = new StringBuilder();
        sb.append("let ").append(name).append(" = [");
        for (int i = 0;i < values.length;i++) {
            Object vals = values[i];
            if (vals instanceof String) {
                String str = vals.toString();
                if (!str.startsWith("\"") && !str.endsWith("\"") && !str.startsWith("{") && !str.endsWith("}")) {
                    str = "\"" + str + "\"";
                    sb.append(str).append((i != (values.length-1) ? ", " : ""));
                } else {
                    sb.append("\n");
                    sb.append("    ").append(str).append((i != (values.length-1) ? "," : "\n"));
                }
            } else {
                sb.append(values[i]).append((i != (values.length-1) ? ", " : ""));
            }
        }
        sb.append("];").append("\n");
        return new Statement(sb.toString());
    }

    /*
    public static Statement LetDocumentGetElementById(String name, String id) {
        StringBuilder sb = new StringBuilder();
        if (!id.startsWith("\"") && !id.endsWith("\"")) id = "\"" + id + "\"";
        else if (!id.startsWith("\"")) id = "\"" + id;
        else if (!id.endsWith("\"")) id = id + "\"";
        sb.append("let " + name + " = document.getElementById(").append(id).append(");");
        return new Statement(sb.toString());
    }
     */

    public static Statement VariableSetInnerHtml(String name, String value) {
        StringBuilder sb = new StringBuilder();
        if (!value.startsWith("\"") && !value.endsWith("\"")) value = "\"" + value + "\"";
        else if (!value.startsWith("\"")) value = "\"" + value;
        else if (!value.endsWith("\"")) value = value + "\"";
        sb.append(name).append(".innerHTML").append(" = ").append(value);
        return new Statement(sb.toString());
    }

    public static Statement VariableGetInnerHtml(String name, String id) {
        StringBuilder sb = new StringBuilder();
        if (!id.startsWith("\"") && !id.endsWith("\"")) id = "\"" + id + "\"";
        else if (!id.startsWith("\"")) id = "\"" + id;
        else if (!id.endsWith("\"")) id = id + "\"";
        sb.append("let " + name + " = document.getElementById(").append(id).append(");");
        return new Statement(sb.toString());
    }

}
