class A {

static void doSomething1() {

System.out.print("A.doSomething1 ");

}

void doSomething2() {

System.out.print("A.doSomething2 ");

}

void doSomething3() {

doSomething1();

doSomething2();

}

}

class B extends A {

static void doSomething1() {

System.out.print("B.doSomething1 ");

}

void doSomething2() {

System.out.print("B.doSomething2 ");

}

public static void main(String[] args) {

new B().doSomething3(); //1

}

}