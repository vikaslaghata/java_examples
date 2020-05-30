package com.java;

import java.util.List;

public class GenericMethod {
	
	public static <T extends Comparable<T>> int compare(T t1, T t2){ // T implements Comparable<T> will not work
		return t1.compareTo(t2);
	}

	//Java Generic Method
		public static <T,V> boolean isEqual(GenericsType<T> g1, GenericsType<V> g2){
			return false;
		}
		
		public static void main(String args[]){
			
			GenericsType<? super String> g1 = new GenericsType<>();
			g1.set("Pankaj");
			
			GenericsType<Integer> g2 = new GenericsType<>();
			g2.set(123);
			
			//boolean isEqual = GenericMethod.<String,Integer>isEqual(g1, g2);
			//above statement can be written simply as
			boolean isEqual = GenericMethod.isEqual(g1, g2);
			//This feature, known as type inference, allows you to invoke a generic method as an ordinary method, without specifying a type between angle brackets.
			//Compiler will infer the type that is needed
		}

}

class GenericsType<T>{
	T value;
	public void set(T value) {
		this.value = value;
	}
	
	public static double sum(List<? extends Number> list){
		double sum = 0;
		for(Number n : list){
			sum += n.doubleValue();
		}
		return sum;
	}
}
