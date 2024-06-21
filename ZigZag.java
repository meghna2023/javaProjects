import java.util.*;
import java.util.Scanner;
class Zigzag
{
	public String convert(String s,int numRows)
	{
		
		if(r==1)
		{
			return s;
		}
		int len=s.length();
		string res;
int pos=r-1;
	
int k=0,col;
char A[r][len];
if(len==1)
return s;
for(int j=0;j<len;j++)
		{
			if(k>=len)
{
col=j;
break;
}

		}
		if (pos==0)
{
pos=r-1;
}
for(i=0;i<r;i++)	
	{
if(k>len){

A[i][j]=s[k++];
}
else
A[i][j]='@';
}
}
else
{
for(i=0;i<r;i++)
{
if(i==pos && k<len)
{
a[i][j]=s[k++];
}
else{
A[i][j]='@';
}
}
}
pos--;
for(int i=0;i<r;i++)
{
for(int j=0;j<col;j++)
{
if(A[i][j]!='@')
res=res+A[i][j];
System.out.println(res);
}
}
public static void main(String args[])
{
String s=PAYPALISHIRING;
int r;String c;
System.out.println("enter the no.of rowa");
r=sc.nextInt();
Zigzag ob=new Zigzag();
ob.convert(s,r);
}
}
