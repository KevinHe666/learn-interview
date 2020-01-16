package com.kevin.learn.structures.all.demo14;


import com.kevin.learn.structures.all.demo2.MyStack;

/**
 * 图
 * @author Richard
 *
 */
public class Graph {

	private Vertex[] vertex;
	private int currentSize;
	public int[][] adjMat;
	private MyStack stack = new MyStack();
	//当前遍历的下标
	private int currentIndex;
	
	public Graph(int size) {
		vertex=new Vertex[size];
		adjMat=new int[size][size];
	}
	
	/**
	 * 向图中加入一个顶点
	 * @param v
	 */
	public void addVertex(Vertex v) {
		vertex[currentSize++]=v;
	}
	
	public void addEdge(String v1,String v2) {
		//找出两个顶点的下标
		int index1=0;
		for(int i=0;i<vertex.length;i++) {
			if(vertex[i].getValue().equals(v1)) {
				index1=i;
				break;
			}
		}
		int index2=0;
		for(int i=0;i<vertex.length;i++) {
			if(vertex[i].getValue().equals(v2)) {
				index2=i;
				break;
			}
		}
		adjMat[index1][index2]=1;
		adjMat[index2][index1]=1;
	}
	
	/**
	 * 深度优先搜索算法遍历图
	 */
	public void dfs() {
		//把第0个顶点标记为已访问状态
		vertex[0].visited=true;
		//把第0个顶点的下标。
		stack.push(0);
		//打印顶点的值
		System.out.println(vertex[0].getValue());
		//遍历
		out:while(!stack.isEmpty()) {
			for(int i=currentIndex+1;i<vertex.length;i++) {
				//如果和下一个遍历的元素是通的
				if(adjMat[currentIndex][i]==1&&vertex[i].visited==false) {
					//把下一个元素压入栈中
					stack.push(i);
					vertex[i].visited=true;
					System.out.println(vertex[i].getValue());
					continue out;
				}
			}
			//弹出栈顶元素
			stack.pop();
			//修改当前位置为栈顶元素的位置
			if(!stack.isEmpty()) {
				currentIndex=stack.peek();
			}
		}
	}
	
}
