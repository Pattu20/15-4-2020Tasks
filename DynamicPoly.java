class Lady{
 void role() {
System.out.println("Lady");
}
}

class Empl extends Lady {
void role() {
System.out.println("empl");
}
}

class HomeMaker extends Lady{
void role(){
System.out.println("HomeMaker");
}
}

class DynamicPoly{
public static void main(String args[]){
Lady lady = new Lady();
lady.role();
lady = new Empl();
lady.role();
lady=new HomeMaker();
lady.role();
}
}