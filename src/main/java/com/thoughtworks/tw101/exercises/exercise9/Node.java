package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;

    //Constructors
    public Node(){
        this.name=null;
    }
    public Node(String name) {
        this.left=null;
        this.right=null;
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        System.out.println("Adding "+nameOfNewNode);

        //case where we get to the bottom of the tree
        if(this==null) {
            System.out.println("null");
        }

        else{
            if (nameOfNewNode.compareTo(this.name)<0){
                if(this.left==null){
                    this.left=new Node(nameOfNewNode);
                    System.out.println("left was null for "+this.name);
                }
                else {
                    this.left.add(nameOfNewNode);
                    System.out.println("recursed left on "+this.name);
                }
            }
            if(nameOfNewNode.compareTo(this.name)>0){
                if(this.right==null){
                    this.right=new Node(nameOfNewNode);
                    System.out.println("right was null for "+this.name);
                }
                else {
                    this.right.add(nameOfNewNode);
                    System.out.println("recursed right on "+this.name);
                }
            }

        }

        System.out.println("Added node " +nameOfNewNode + " to "+this.name);

    }



    public List<String> names() {
        //use an Inorder traversal
        return null;
    }
}
