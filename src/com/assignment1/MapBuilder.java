package com.assignment1;

import java.util.ArrayList;
import java.util.List;

public class MapBuilder {

    private int width = 0;
    private int height = 0;
    private List<Node> walls;
    private Node startNode;
    private List<Node> endNodes;

    public MapBuilder() {
        this.walls = new ArrayList<>();
    }

    public MapBuilder addWall(Node node){
        this.walls.add(node);
        return this;
    }

    public MapBuilder setWidth(int width){
        this.width = width;
        return this;
    }

    public MapBuilder setHeight(int height){
        this.height = height;
        return this;
    }
    public MapBuilder addStartNode(Node node){
        // Only set one start node
        if(this.startNode == null) {
            this.startNode = node;
        }
        return this;
    }

    public MapBuilder addGoalNode(Node goal){
        this.endNodes.add(goal);
        return this;
    }

    public Map build() {
        return new Map(this.width, this.height, this.walls, this.startNode, this.endNodes);
    }
}