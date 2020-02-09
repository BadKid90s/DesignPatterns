package com.wry.patterns.interpreter.type2;

import java.util.function.IntBinaryOperator;

/**
 * 终极表达式
 */
public class TerminalExpression extends AbstractExpression {

    private Integer number;

    public TerminalExpression(Integer number) {
        this.number = number;
    }

    @Override
    public int interpreter() {
        return number;
    }
}
