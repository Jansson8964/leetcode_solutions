package org.example.graph;

import org.example.utils.PrintUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 定义一个基于邻接矩阵的无向图类
public class GraphAdjMat {
    // 顶点列表，存储图中所有顶点的值。列表中每个元素的值是顶点的值，元素的索引位置是顶点的索引。
    List<Integer> vertices;
    // 邻接矩阵，用于表示图中顶点之间的边的存在性。矩阵的行和列索引对应于顶点的索引。
    List<List<Integer>> adjMat;

    // 构造方法：初始化图，根据提供的顶点和边的数据构造图
    public GraphAdjMat(int[] vertices, int[][] edges) {
        this.vertices = new ArrayList<>(); // 初始化顶点列表
        this.adjMat = new ArrayList<>(); // 初始化邻接矩阵
        // 添加顶点：遍历vertices数组，为每个顶点值调用addVertex方法
        for (int val : vertices) {
            addVertex(val); // 添加顶点到图中
        }
        // 添加边：遍历edges二维数组，为每对顶点调用addEdge方法
        for (int[] e : edges) {
            addEdge(e[0], e[1]); // 根据顶点索引添加边
        }
    }

    // 获取图中顶点的数量
    public int size() {
        return vertices.size();
    }

    // 添加顶点方法：向图中添加一个新的顶点
    public void addVertex(int val) {
        int n = size(); // 获取当前顶点数量
        vertices.add(val); // 向顶点列表中添加新顶点的值
        // 在邻接矩阵中添加一行，初始值为0，表示新顶点与其他顶点之间没有边
        List<Integer> newRow = new ArrayList<>(Collections.nCopies(n, 0));
        adjMat.add(newRow);
        // 在邻接矩阵的每行中添加一列，初始值为0
        adjMat.forEach(row -> row.add(0));
    }

    // 删除顶点方法：从图中删除指定索引的顶点
    public void removeVertex(int index) {
        if (index >= size()) throw new IndexOutOfBoundsException("顶点索引超出范围");
        vertices.remove(index); // 从顶点列表中移除顶点
        adjMat.remove(index); // 从邻接矩阵中移除对应的行
        adjMat.forEach(row -> row.remove(index)); // 从邻接矩阵的每行中移除对应的列
    }

    // 添加边方法：在图中添加一条边，连接两个顶点
    public void addEdge(int i, int j) {
        // 索引越界检查
        if (i < 0 || j < 0 || i >= size() || j >= size() || i == j)
            throw new IndexOutOfBoundsException("顶点索引无效或相同");
        adjMat.get(i).set(j, 1); // 设置邻接矩阵，表示顶点i和顶点j之间存在边
        adjMat.get(j).set(i, 1); // 由于是无向图，需要设置对称的边
    }

    // 删除边方法：从图中删除两个顶点之间的边
    public void removeEdge(int i, int j) {
        // 索引越界检查
        if (i < 0 || j < 0 || i >= size() || j >= size() || i == j)
            throw new IndexOutOfBoundsException("顶点索引无效或相同");
        adjMat.get(i).set(j, 0); // 在邻接矩阵中移除边，设置为0
        adjMat.get(j).set(i, 0); // 由于是无向图，需要移除对称的边
    }

    // 打印邻接矩阵和顶点列表：用于调试和展示图的结构
    public void print() {
        System.out.print("顶点列表 = ");
        System.out.println(vertices);
        System.out.println("邻接矩阵 =");
        // 这里假设PrintUtil是一个外部实现的工具类，专门用于打印矩阵结构的数据
        PrintUtil.printMatrix(adjMat); // 打印邻接矩阵
    }
}
