package com;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjArray {
	public static void main(String[] args) {
		
		Object[] arr1= {1,"Hello"};
		Object[] arr2= {2,"World"};
		Object[] arr3= {3,"Hi"};
		
		ArrayList<Object[]> a=new ArrayList<>();
		a.add(arr1);
		a.add(arr2);
		a.add(arr3);
		
		for(Object[] o : a) {
			System.out.println(Arrays.toString(o));
		}
	}
}
