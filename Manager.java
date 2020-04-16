class Employee {}
class Admin extends Employee {
public static int count ;
{ count += 1; }
void getcount(){
System.out.println(count);
}}
class Manager extends Admin {
Manager() {
super();
}
public static void main(String args[]){
Employee emp =new Admin();
emp= new Admin();
emp= new Admin();
emp= new Admin();
emp= new Admin();
emp = new Manager();
emp = new Manager();
emp = new Manager();
Manager manager = (Manager)emp;//downcasting making employee object to manager
manager.getcount();
}
}
