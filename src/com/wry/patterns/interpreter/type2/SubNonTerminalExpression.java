package com.wry.patterns.interpreter.type2;

/**
 * 非终极表达式
 */
public class SubNonTerminalExpression extends AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public SubNonTerminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter() {
        return left.interpreter()-right.interpreter();
    }
}
