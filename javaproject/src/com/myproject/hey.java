package com.myproject;

public class hey {

	public static void main(String[] args) {
	int a[]={1,2,3,4,5};
	int b[]={6,7,8,9,10};
    int c[]=new int[(a.length)+(b.length)];
    int z=0;
    
    for(int i=0;i<a.length;i++)
    {c[z]=a[i];
      System.out.println(c[z]);
    z++;
    }
    for(int i=0;i<b.length;i++)
    {c[z]=b[i];
      System.out.println(c[z]);
    z++;
    }
    
}
}