package com.projects.ti.parser;

import com.projects.ti.datatypes.AstNode;

/**
 * Parser interface for expressions.
 *
 * @author Oleksandr Ivanov
 */
public interface ExpressionParser {

    /**
     * Parse string expression to AST {@link AstNode}
     *
     * @param expression input math expression
     * @return abstract syntax tree for current expression
     */
    AstNode parse(String expression);

}
