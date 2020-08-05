package com.designModel.composite;

import javax.swing.tree.TreeNode;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @program: Design
 * @description: 组合模式示例
 * @author: sikuncheng
 * @create: 2020-07-30 15:02
 **/
public class Composite {
    TreeNode root = null;
//    public Composite(String name){
//        root = new TreeNode(name);
//    }

    public static void main(String[] args) {

    }
}

class TreeMethod{
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<>();

//    public TreeNethod(String name){
//        this.name = name;
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public Vector<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(Vector<TreeNode> children) {
        this.children = children;
    }

    //增加子节点
    public void add(TreeNode node){
        children.add(node);
    }

    //删除子节点
    public void remove(TreeNode node){
        children.remove(node);
    }

    //获取子节点
    public Enumeration<TreeNode> getChildren1(){
        return children.elements();
    }
}
