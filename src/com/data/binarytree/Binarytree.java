package com.data.binarytree;


public class Binarytree {

	Node root;

	public void insert(int key,int data){

		Node temp=new Node(key, data);


		if(root==null){

			root=temp;
		}
		else{
			Node current=root;
			Node parent;
			while(true){

				parent=current;
				if(key<current.data){

					current=current.leftchild;
					if(current==null){


						parent.leftchild=temp;
						return;
					}

				}
				else{

					current=current.rightchild;
					if(current==null){

						parent.rightchild=temp;
						return;
					}


				}

			}
		}

	}



	public Node find(int key){
		Node current=root;
		while(current.key!=key){

			if(key<current.key){

				current=current.leftchild;
			}
			else{

				current=current.rightchild;
			}
			if(current==null){
				return null;

			}


		}
		return current;
	}


	public void Inorder(Node localroot){

		if(localroot!=null){

			Inorder(localroot.leftchild);

			System.out.println("data"+ localroot.data);
			Inorder(localroot.rightchild);
		}
	}


	public boolean delete(int key){

		Node parent=root;
		Node current=root;
		boolean isleft = true;
		while(current.key!=key)
		{
			parent=current;
			if(key<current.key){

				isleft=true;
				current=current.leftchild;
			}
			else{
				isleft=false;
				current=current.rightchild;
			}
			if(root==null)
				return false;
		}


		if(current.leftchild==null && current.rightchild==null){

			if(current==root){
				root=null;
			}
			else if(isleft){
				parent.leftchild=null;
			}
			else
				parent.rightchild=null;
		}

		else if(current.rightchild==null){

			if(current==root){

				root=current.leftchild;

			}
			else if(isleft){

				parent.leftchild=current.leftchild;
			}
			else{
				parent.rightchild=current.leftchild;
			}
		}

		else if (current.leftchild==null){

			if(current==root){
				root=current.rightchild;
			}
			else if(isleft){

				parent.leftchild=current.rightchild;

			}
			else{

				parent.rightchild=current.rightchild;
			}
		}
		else{

			Node successor = getSuccessor(current);
			if(current == root)
				root = successor;
			else if(isleft)
				parent.leftchild = successor;
			else
				parent.rightchild = successor;
			successor.leftchild = current.leftchild;
		} 
		return true;

	}







	private Node getSuccessor(Node delNode)
	{
		Node successorParent = delNode;

		Node successor = delNode;
		Node current = delNode.rightchild; 
		while(current != null) 
		{ 
			successorParent = successor;
			successor = current;
			current = current.leftchild; 
		}

		if(successor != delNode.rightchild) 
		{ 
			successorParent.leftchild = successor.rightchild;
			successor.rightchild = delNode.rightchild;
		}
		return successor;
	}

}
