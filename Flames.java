package sorting;

import java.util.Scanner;

public class Flames {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name");
		String firname=sc.nextLine();
		System.out.println("Enter second name");
		String secname=sc.nextLine();
	
		char[] my=firname.toCharArray();
		char[] ot=secname.toCharArray();
		
		boolean[] appeared1=new boolean[ot.length];
		int count=0;
		for(int i=0;i<my.length;i++) {
			for(int j=0;j<ot.length;j++) {
				if(my[i]==ot[j]) {
					if(appeared1[j]==false) {
	
					appeared1[j]=true;
					count+=2;
					break;		
				}
				}
			}
		};
		int num=my.length+ot.length-count; 
		char ch[]= {'F','L','A','M','E','S'};
		int check=0,flames_count=6;
		
		while(flames_count!=1)
		{
			
			for(int i=0;i<=5;i++)
			{
				if(ch[i]!='#')
				{
					check++;
				}
				if(check==num)
				{
					ch[i]='#';
					check=0;
					flames_count--;
				}
			}
			
		}
		//System.out.println(ch);
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='F')
				System.out.println(firname+"and"+secname+"best friends");
			if(ch[i]=='L')
				System.out.println(firname+" and "+secname+" are love in each other");
			if(ch[i]=='A')
				System.out.println(firname+"has more attraction on "+secname);
			if(ch[i]=='M')
				System.out.println("The relationship between "+firname+" and "+secname+" is marriage");
			if(ch[i]=='E')
				System.out.println(firname+" and "+secname+" are enimies");
			if(ch[i]=='S')
				System.out.println(firname+" and "+secname+" brother or sister relationship");
		}
    
	}

}
