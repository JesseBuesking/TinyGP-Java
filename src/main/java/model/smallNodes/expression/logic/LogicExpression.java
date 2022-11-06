package model.smallNodes.expression.logic;

import model.Node;

public class LogicExpression extends Node {

    public LogicExpression(Node parentNode, String name, boolean isCrossable) {
        super(parentNode, name, isCrossable);
    }

    public LogicExpression(Node parentNode, double nextLogicBooleanExpressionChance) {
        super(parentNode, "LogicExpression", true);
    }


}
