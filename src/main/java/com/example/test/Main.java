package com.example.test;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author lrf
 */
public class Main {

    private static final ScriptEngineManager manager = new ScriptEngineManager();

    public static void main(String[] args) {
        String script = "function add(a, b) {return a * b}";
        runJsScript(script);
    }

    public static void runJsScript(String script) {
        try {
            ScriptEngine engine = manager.getEngineByName("JavaScript");
            if (engine == null) {
                System.out.println("No script engine found for JavaScript");
                return;
            }
            engine.eval(script);
            Invocable invocable = (Invocable) engine;
            Object res = invocable.invokeFunction("add", 1, 2);
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
