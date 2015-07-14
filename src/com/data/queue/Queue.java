package com.data.queue;

public class Queue {


	private int nelements;
	private int front,rear;
	private int maxsize;
	private long[] a;

	public Queue(int max){

		this.maxsize=max;
		a=new long[maxsize];
		front=0;
		rear=-1;
		nelements=0;

	}

	public void insert(long j){

		if(rear==maxsize-1)

			rear=-1;

		a[++rear]=j;
		nelements++;

	}

	public long remove(){

		long temp=a[front++];
		if(front==maxsize)

			front=0;

		nelements--;
		return temp;


	}

	public long peek(){

		return a[nelements];
	}

	public boolean isEmpty(){

		return (nelements==0);

	}

	public boolean isFull(){

		return (nelements==maxsize);
	}
}
