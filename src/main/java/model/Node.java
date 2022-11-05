package model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Random;

@Getter
@Setter
public abstract class Node {
    private Node parentNode;
    private String name;
    private ArrayList<Node> children;
    private boolean isCrossable;

    public static final Random RANDOM = new Random();

    public Node(Node parentNode, String name, boolean isCrossable) {
        this.parentNode = parentNode;
        this.name = name;
        this.isCrossable = isCrossable;
        this.children = new ArrayList<>();
    }


}
