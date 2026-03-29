package com.webgen.js;

public abstract class ScriptFile {
    private Script script = new Script();

    public ScriptFile() {
        script(script);
    }

    public Script getScript() {
        return script;
    }

    public abstract void script(Script script);

}
