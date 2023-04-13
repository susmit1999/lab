interface My {

}

class MyClass implements My {

}

class TestQuestion extends MyClass {

public static void main(String args[]) {

MyClass parent = new MyClass( );

TestQuestion child = new TestQuestion( );

System.out.println (parent instanceof My);

System.out.println (parent instanceof MyClass);

System.out.println (child instanceof My);

}

}