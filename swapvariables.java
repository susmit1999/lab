public class swapvariables{
public static void main(String args[]){

int a=5;
int b=6;

System.out.println("before swap a=" + a +",b="+b);

int temp=a;
a=b;
b=temp;

System.out.println("after swap a=" + a +",b="+b);
}
}
