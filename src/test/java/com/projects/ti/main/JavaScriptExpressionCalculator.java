package com.projects.ti.main;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Simple interface implementation of interface for tests purposes.
 *
 * @author Oleksandr Ivanov
 */
public class JavaScriptExpressionCalculator implements ExpressionCalculator {

    private static final String JAVA_SCRIPT_NAME = "JavaScript";

    @Override
    public double calculate(String mathExpression) {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine scriptEngine = mgr.getEngineByName(JAVA_SCRIPT_NAME);
        Double eval;
        try {
            eval = (Double) scriptEngine.eval(mathExpression);
        } catch (ScriptException e) {
            throw new IllegalArgumentException("Error in input string", e);
        }
        return eval;
    }
}
