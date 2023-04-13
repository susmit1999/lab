class Rose{

public void rsam(int k) {

int x=k;

for( int i=3; i<x; i++){

for (int j=2; j<x-2; j++){

int y = i + j;

System.out.println( i + " + " + j + " = " + y);

}

}

}

public static void main(String[] args) {

Rose r = new Rose();

r.rsam(5);

}

}