package com.projects.ti.datatypes;

/**
 * Simple builder for {@link AstNode} class
 */
public class AstNodeBuilder {
    private NodeTypes nodeType;
    private AstNode leftNode;
    private AstNode rightNode;
    private Double nodeResult;

    private AstNodeBuilder () {
    }

    public static AstNodeBuilder getNewInstance() {
        return new AstNodeBuilder();
    }

    public AstNodeBuilder withNodeType(NodeTypes nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    public AstNodeBuilder withRightNode(AstNode rightNode) {
        this.rightNode = rightNode;
        return this;
    }

    public AstNodeBuilder withLeftNode(AstNode leftNode) {
        this.leftNode = leftNode;
        return this;
    }

    public AstNodeBuilder withNodeResult(Double nodeResult) {
        this.nodeResult = nodeResult;
        return this;
    }

    public AstNode build() {
        return new AstNode(nodeType, leftNode, rightNode, nodeResult);
    }

}