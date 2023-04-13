class Frame1 {

private int part=2;

public int getPart() {

return part;

}

}

class Frame2 {

public static void main(String s[]) {

Frame1 obj = new Frame1();

obj.part = 2;

int part = obj.getPart( );

System.out.println(“no of parts:” +part);

}

}