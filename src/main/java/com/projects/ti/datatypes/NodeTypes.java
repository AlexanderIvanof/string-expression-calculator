package com.projects.ti.datatypes;

/**
 * Type of AST node.
 * {@link AstNode}
 *
 * @author Oleksandr Ivanov
 */
public enum NodeTypes {
    NUMBER, PLUS('+'), MINUS('-'), ASTERISK('*'), DIVISION_SIGN('/');

    private Character value = null;

    NodeTypes() {
    }

    NodeTypes(Character value) {
        this.value = value;
    }

    public char getChar() {
        return value;
    }
}
