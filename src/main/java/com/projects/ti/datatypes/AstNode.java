package com.projects.ti.datatypes;

/**
 * AST node implementation.
 *
 * @author Oleksandr Ivanov
 */
public class AstNode {
    private NodeTypes nodeType;
    private AstNode leftNode;
    private AstNode rightNode;
    private Double nodeResult;

    AstNode(NodeTypes nodeType, AstNode leftNode, AstNode rightNode, Double nodeResult) {
        this.nodeType = nodeType;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.nodeResult = nodeResult;
    }

    public NodeTypes getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeTypes nodeType) {
        this.nodeType = nodeType;
    }

    public AstNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(AstNode leftNode) {
        this.leftNode = leftNode;
    }

    public AstNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(AstNode rightNode) {
        this.rightNode = rightNode;
    }

    public Double getNodeResult() {
        return nodeResult;
    }

    public void setNodeResult(Double nodeResult) {
        this.nodeResult = nodeResult;
    }

}
