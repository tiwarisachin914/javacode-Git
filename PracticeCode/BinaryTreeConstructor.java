package PracticeCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeConstructor {
	public static  class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data, Node left,Node right){
			this.data=data;
			this.left=left;
			this.right=right;
		}
	}
	public static class Pair{
		Node node;
		int state;
		
		Pair(Node node, int state){
			this.node=node;
			this.state=state;
		}
	}
	public static void display(Node node) {
		String str ="";
		if(node==null) {
			return;
		}
		str += node.left==null?".":node.left.data + "";
		str +="<-"+node.data+"->";
		str += node.right==null?".":node.right.data +"";
		System.out.println(str);
		display(node.left);
		display(node.right);
	}
	public static int size(Node node) {
		if(node == null) {
			return 0;
		}
		int ln = size(node.left);
		int rn = size(node.right);
		int tn = ln+rn+1;
		return tn;
	}
	public static int sum(Node node) {
		if(node==null) {
			return 0;
		}
		int ls= sum(node.left);
		int rs =sum(node.right);
		int ts= ls+rs+(node.data);
		return ts;
	}
	public static int height(Node node) {
		if(node == null) {
			return 0;
		}
		int lh= height(node.left);
		int rh= height(node.right);
		int h= Math.max(lh, rh) +1;
		return h;
	}
	public static int max(Node node) {
		if(node == null) {
			return Integer.MIN_VALUE;
		}
		int lm= max(node.left);
		int rm= max(node.right);
		int m = Math.max(node.data, Math.max(lm, rm));
		return m;
	}
	public static void preInPostTraversal(Node node) {
		if(node==null) {
			return;
		}
		System.out.println(node.data + "PreOrder");
		preInPostTraversal(node.left);
		System.out.println(node.data + "Inorder");
		preInPostTraversal(node.right);
		System.out.println(node.data + "PostOrder");
	}
	public static void levelOrderTraversal(Node node) {
		Queue<Node> q = new ArrayDeque<>();
		q.add(node);
		while(q.size()>0) {
			int count = q.size();
			for(int i=0;i<count;i++) {
				node = q.remove();
				System.out.print(node.data + " ");
				if(node.left!=null) {
					q.add(node.left);
				}
				if(node.right != null) {
					q.add(node.right);
				}
			}
			System.out.println("");
		}
		
	}
	public static void iterativeTraversal(Node node) {
		Stack<Pair> s = new Stack<>();
		Pair rtp = new Pair(node,1);
		s.push(rtp);
		String pre ="";
		String in ="";
		String post="";
		while(s.size()>0) {
			Pair top=s.peek();
			if(top.state ==1) {
				pre += top.node.data + " ";
				top.state++;
				if(top.node.left != null) {
					Pair lp= new Pair(top.node.left,1);
					s.push(lp);
				}
			}
			else if(top.state==2) {
				in += top.node.data + " ";
				top.state++;
				if(top.node.right != null) {
					Pair lp= new Pair(top.node.right,1);
					s.push(lp);
				}
			}
			else {
				post += top.node.data + " ";
				s.pop();
			}
		}
		System.out.println(pre);
		System.out.println(in);
		System.out.println(post);
	}
	static ArrayList<Node> path= new ArrayList<>();
	public static boolean find(Node node, int data) {
		if(node== null) {
			return false;
		}
		if(node.data==data) {
			path.add(node);
			return true;
		}
		boolean filc =find(node.left,data);
		if(filc) {
			path.add(node);
			return true;
		}
		boolean firc= find(node.right,data);
		if(firc) {
			path.add(node);
			return true;
		}
		return false;
	}
	public static void printklevelDown(Node node, int k,Node blocker) {
		if(node==null||k<0||node==blocker) {
			return;
		}
		if(k==0) {
			System.out.println(node.data);
		}
		printklevelDown(node.left,k-1,blocker);
		printklevelDown(node.left,k-1,blocker);
	}
	public static void printkfarleveldown(Node node,int k,Node blocker) {
      ArrayList<Node> nodetorootpath =path;
      for(int i=0;i<nodetorootpath.size();i++) {
    	  printklevelDown(nodetorootpath.get(i), k-i,i==0?null:nodetorootpath.get(i-1));
      }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
		Stack<Pair> st= new Stack<>();
		
		Node root = new Node(arr[0],null,null);
		Pair rtp= new Pair(root,1);
		st.push(rtp);
		int index=0;
		while(st.size()>0) {
			Pair top= st.peek();
			if(top.state==1) {
				index++;
				if(arr[index]!=null) {
					Node ln = new Node(arr[index],null,null);
					top.node.left =ln;
					
					Pair lp =new Pair(ln,1);
					st.push(lp);
				}
				else {
					top.node.left=null;
				}
				top.state++;
			}
			else if(top.state==2) {
				index++;
				if(arr[index]!=null) {
					Node rn = new Node(arr[index],null,null);
					top.node.right =rn;
					
					Pair rp =new Pair(rn,1);
					st.push(rp);
				}
				else {
					top.node.right=null;
				}
				top.state++;
			}
			else {
				st.pop();
			}
		}
		
		display(root);
		System.out.println(sum(root));
		System.out.println(size(root));
		System.out.println(height(root));
		System.out.println(max(root));
		preInPostTraversal(root);
		levelOrderTraversal(root);
		iterativeTraversal(root);
		boolean found=find(root,87);
		System.out.println(found);
		System.out.println(path);
		printklevelDown(root,2);

	}

}
