class Lady{
 void role() {
System.out.println("Lady");
}

void role(int a,int b)
{
System.out.println("Lady" +a +b);
}
}

class Empl extends Lady {
void role(int a) {
System.out.println("empl"+a);
}
}


class StaticPoly {
public static void main(String args[]){
Lady lady = new Lady();
lady.role();
lady.role(2,3);
Empl e = new Empl();
e.role(3);
}
}