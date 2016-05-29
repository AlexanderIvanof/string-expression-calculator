package com.projects.ti.evaluator;

import com.projects.ti.datatypes.AstNode;

/**
 * Interface for AST evaluator
 *
 * @author Oleksandr Ivanov
 */
public interface AstEvaluator {

    Double evaluateNode(AstNode node);
}
