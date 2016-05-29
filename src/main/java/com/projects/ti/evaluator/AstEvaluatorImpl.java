package com.projects.ti.evaluator;

import com.projects.ti.datatypes.AstNode;
import com.projects.ti.datatypes.NodeTypes;

/**
 * Created 29.05.2016
 *
 * @author Oleksandr Ivanov
 */
public class AstEvaluatorImpl implements AstEvaluator {

    @Override
    public Double evaluateNode(AstNode node) {
        NodeTypes currentNodeType = node.getNodeType();
        switch (currentNodeType) {
            case NUMBER:
                return node.getNodeResult();
            case ASTERISK:
                return evaluateNode(node.getLeftNode()) * evaluateNode(node.getRightNode());
            case DIVISION_SIGN:
                return evaluateNode(node.getLeftNode()) / evaluateNode(node.getRightNode());
            case MINUS:
                return evaluateNode(node.getLeftNode()) - evaluateNode(node.getRightNode());
            case PLUS:
                return evaluateNode(node.getLeftNode()) + evaluateNode(node.getRightNode());
            default:
                throw new UnsupportedOperationException(String.format("Operation %s not supported yet. ", currentNodeType));
        }
    }
}
