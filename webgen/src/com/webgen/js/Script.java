package com.webgen.js;

import com.webgen.Statement;

import java.util.ArrayList;

public class Script {
    private ArrayList<Script> arrayScripts = new ArrayList<>();
    private String functionName;
    private String[] statements;
    private String statement;

    public Script() {}

    private Script(String functionName, String[] statements) {
        this.functionName = functionName;
        this.statements = statements;
    }

    public Script(String statement) {
        this.statement = statement;
    }

    public void addFunction(String functionName, Statement[] statements) {
        if (statements == null) return;
        String[] statementsValues = new String[statements.length];
        for (int i = 0;i < statements.length;i++) {
            statementsValues[i] = statements[i].statement();
        }
        if (!functionName.endsWith("()")) functionName = functionName + "()";
        arrayScripts.add(new Script(functionName, statementsValues));
    }

    public void addFunction(String functionName, String[] statements) {
        if (statements == null) return;
        if (!functionName.endsWith("()")) functionName = functionName + "()";
        arrayScripts.add(new Script(functionName, statements));
    }

    public void addStatement(Statement statement) {
        if (statement == null) return;
        arrayScripts.add(new Script(statement.statement()));
    }

    public String functionName() {
        return functionName;
    }

    public String[] statements() {
        return statements;
    }

    public String statement() {
        return statement;
    }

    public ArrayList<Script> getScripts() {
        return arrayScripts;
    }

    public void clear() {
        arrayScripts.clear();
    }

}
