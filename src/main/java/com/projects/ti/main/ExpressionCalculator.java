package com.projects.ti.main;

/**
 * Interface that calculates expressions.
 *
 * @author Oleksandr Ivanov
 */
public interface ExpressionCalculator {

    /**
     * Method takes math expression and calculate result of it.
     *
     * @param mathExpression input expression
     * @return result of math expression
     */
    double calculate(String mathExpression);
}
