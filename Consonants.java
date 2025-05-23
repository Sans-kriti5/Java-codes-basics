import java.util.*;

class MyString
{
private String str;

public void SetData(String str)
{
this.str=str;
}
public void getConst() 
{
 for (int i=0; i < str.length();i++)
{
char ch =str.charAt(i);
if (ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')
{
System.out.print(ch);
}
}
}
}

public class Consonants
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a string:");
String ch=sc.nextLine();
MyString s=new MyString();
s.SetData(ch);
s.getConst();
}
}