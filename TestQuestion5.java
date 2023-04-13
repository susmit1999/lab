class TestQuestion5 {

static int a = 10;

public static void main(String s[]) {

TestQuestion5 ob = new TestQuestion5();

ob.test(20);

}

static {

System.out.println(a);

}

static void test(int a) {

a+= 12;

System.out.print(a);

}

}