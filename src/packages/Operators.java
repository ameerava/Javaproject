package packages;

public class Operators {

	public static void main(String[] args) {
		
   System.out.println("..........assignment operators........");
   int a=10,b=20;
   int c=a;
   System.out.println("value of c="+c);
   System.out.println("a+=b="+(a+=b));  //a+=b means a=a+b
   System.out.println("a-=b="+(a-=b));  //a-=b means a=a-b
   
   System.out.println("........relational operators.........");
   int u=5, v=10;
   System.out.println(u<v); //true
   System.out.println(u>v);  //false
   System.out.println(u==v);  //false
   System.out.println(u<=v);  //true
   System.out.println(u>=v);  //false
   System.out.println(u!=v);  //true
   
   
   System.out.println(".......logical operators.........");
  
   //   a   b   a&&b   a||b !a  !b
   //   0   0    0      0    1   1
   //   0   1    0      1    1   0
   //   1   0    0      1    0   1
   //   1   1    1      1    0   0
   
   
   String username="abc";
   String pswd="abc123";
   System.out.println(username=="abc"&&pswd=="abc123");
   System.out.println(username=="abc"||pswd=="abc123");
   System.out.println(!(username=="abc"));
   System.out.println(!(pswd=="abc12"));
   
   System.out.println("......unary operators.......");
   int z=5;
   System.out.println(z++); //postincrement
   System.out.println(z);  
   System.out.println(++z);  //preincrement
   System.out.println(z);
   System.out.println(--z);  //predecrement
   System.out.println(z);
   System.out.println(z--);  //postdecrement
   System.out.println(z);
   
   String s=u>v?"u is greater":"v is greater";
   System.out.println(s);
	}
}
