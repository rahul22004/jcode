class Employee{
    String  name,dob;
    int id;

    Employee(String n,String d,int i){
        name = n;
        dob = d;
        id = i;

    }
   void display(){
       System.out.println("Employeee Name :" + name);
       System.out.println("Date of birth :" + dob);
       System.out.println("Employeee ID :" + id);
}

}

class Manager extends Employee{
  double salary ;

  Manager(String n,String d,int i,double s){
    super(n,d,i);
    salary = s;
  }
  void display(){
    super.display();
    System.out.println("Employeee salary :" + salary);
  }
}

class SalseManager extends Manager{
double commission;

  SalseManager(String n, String d,int i,double s,double c){
    super(n,d,i,s);
    commission = c;

}
void display(){
    super.display();
    System.out.println("Employeee commission :" + commission);
}
}

class TestEmployee{
    public static void main(String args[]){
        SalseManager s1 = new SalseManager("Kunal","06-07-2004",212,80000,10000);
        s1.display();
    }
}
