/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lc;

/**
 *
 * @author Saksham mahajan
 */
  import java.util.*;
public class Lc {




public static void main(String arg[])
{
	Scanner in=new Scanner(System.in);
	String str=in.next();
	int len=str.length();
	char arr[]=str.toCharArray();
	int i=0;
	int j=len-1;
	while(i<j)
	{
		if((arr[i]<65) || (arr[i]>90 && arr[i]<97) || (arr[i]>122))
		{
			i++;
			continue;
		}
		if((arr[j]<65) || (arr[j]>90 && arr[j]<97) || (arr[j]>122))
		{
			j--;
			continue;
		}
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
	System.out.println(arr);
}
}
