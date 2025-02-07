class Employee{
    int empno;
    String ename;
    int salary;

    Employee(int empno, String ename, int salary){
this.empno = empno;
this.ename = ename;
this.salary = salary;
}
public String toString(){
return empno+

salary;
}
}
class EmployeeDemo{
public static void main(String[] args) throws Exception{
int choice = -1;
Scanner s = new Scanner(System.in);
Scanner s1 = new Scanner(System.in);
File file = new File("employee.txt");
ArrayList<Employee> al = new ArrayList<EmpLoyee>();
ObjectOutputStream oos = null;
ObjectInputStream ois = null;
ListIterator li = null;

if(file.isFile()){
ois = new ObjectInputStream(new FileInputStream(file));
al =(ArrayList<Employee>)ois.readObject();
ois.close();
}

do{

System.out.println("1.INSERT");
System.out.println("2.DISPLAY");
System.out.println("3.SEARCH");
System.out.println("4.DELETE");
System.out.println("5.UPDATE");
System.out.println("6.SORT By EmpNo - On Screen");
System. out.println("7.SORT By EmpNo - In File");
System.out.printIn("8.SORT By EmpName - On Screen");
System.out.println("9.SORT By EmpName - In File");
System.out.printLn("10.SORT By Salary - Dese - On Screen");
System.out.printLn("11.SORT By Salary - Asc - In File");
System.out.printLn("0.Exit");
System.out.println("Enter Your Choice : ");
choice = s.nextInt();

switch(choice){
case 1:
System.out.println("Enter how many employees you want : ");
int n = s.nextInt();
for(int i=0;i<n;i++){
System.out.print("Enter Employee No: ");
int empno = s.nextInt();

System.out.print("Enter Employee Name: ");
String ename = s1.nextLine();

System.out.print("Enter Employee Salary : ");
int salary = s.nextInt();

al.add(new Employee(empno,ename,salary));
}
oos = new ObjectOutputStream(new FileOutputStream(file));
oos.writeObject(al);
oos.close();
break;
case 2:
if(file.isFile()){
ois = new ObjectInputStream(new FileInputStream(file));
al =(ArrayList<Employee>)ois.readObject();
ois.close();

System.out.println("
li = al.listIterator();
while(li.hasNext())
System.out.println(li.next());
System.out.println("
}else{
System.out.println("File not Exists ....! ");
}
break;
case 3:
if(file.isFile()){
ois = new ObjectInputStream(new FileInputStream(file));
al =(ArrayList<EmpLoyee>)ois.readObject();
ois.close();

boolean found = false;
System.out.println("Enter empno to Search : ");
int empno = s.nextInt();
System.out.println("----------------------------");
li = al.listIterator();
while(li.hasNext()){
Employee e =(Employee)li.next();
if(e.empno == empno){
System.out.println(e);
found = true;
}
}
if(Ifound)
System.out.println("Record Not Found ...! ");
System.out.println("-----------------------------");
Jelse{
System.out.println("File not Exists ....! ");
}
break;
case 4:
if(file.isFile()){
ois = new ObjectInputStream(new FileInputStream(file));
al =(ArrayList<Employee>)ois.read0bject();
ois.close();

boolean found = false;
System.out.print("Enter empno to Delete : ");
int empno = s.nextInt();
System.out.println("-------------------------------");
li = al.listIterator();
while(li.hasNext()){
Employee e =(Employee)li.next();
if(e.empno == empno){
li.remove();
found = true;
}
}
if(found){
oos = new ObjectOutputStream(new FileOutputStream(file));
oos.writeObject(al);
oos.close();
System.out.println("Record Deleted Successfully ....! ");

else{
System.out.println("Record Not Found ...! ");
}
System.out.println("----------------------------------");
}else{
System.out.println("File not Exists ....! ");
}
break;
case 5:
if(file.isFile()){
ois = new ObjectInputStream(new FileInputStream(file));
al =(ArrayList<Employee>)ois.read0bject();
ois.close();

boolean found = false;
System.out.print("Enter empno to Update : ");
int empno =s.nextInt();
System.out.println("----------------------------------");
li = al.listIterator();
while(li.hasNext()){
Employee e = (EmpLoyee)li.next();
if(e.empno == empno){
System.out.print("Enter New EmpName : ");
String ename = s1.nextLine();

System.out.print("Enter new Salary : ");
int sal = s.nextInt();
li.set(new Employee(empno,ename,sal));
found = true;
}
}
if(found){
oos = new ObjectOutputStream(new FileOutputStream(file));
oos.writeObject(al);
oos.close();
System.out.println("Record Updated Successfully ....! ");
}
else{
System.out.println("Record Not Found ...! ");
}
System.out.println("-----------------------------------");
}else{
System.out.println("File not Exists ....! ");
}
break;
case 6:
if(file.isFile()){
ois = new ObjectInputStream(new FileInputStream(file));
al =(ArrayList<EmpLoyee>)ois.read0bject();
ois.close();

Collections.sort(al, new Comparator<Employee>(){
public int compare(Employee e1, Employee e2){
return e1.empno - e2.empno;
}
});

system.out.printLn("-----------------------------------");
li = al.ListIterator();
while(li.hasNext());
System.out.println(li.next());
System.out.println("-------------------------------------");
}else{
    System.out.println("File not Exists....!");
}
break;
case 7:
if(file.isFile()){
ois = new ObjectInputStream(new FileInputStream(file));
al =(ArrayList<Employee>)ois.read0bject();
ois.close();

Collections.sort(al, new Comparator<Employee>(){
public int compare(Employee e1, Employee e2){
return e1.empno - e2.empno;
}
});
oos = new ObjectOutputStream(new FileOutputStream(file));
oos.writeObject(al);
oos.close();

System.out.println("--------------------------------------");
li = al.listIterator();
while(li.hasNext())
System.out.println(li.next());
System.out.println("----------------------------------------");
}else{
System.out.println("File not Exists ....! ");
}
break;
case 8;
if(file.isFile()){
    ois = new ObjectInputStream(new FileInputStream(file));
    al = (ArrayList<Employee>ois.readObject());
    ois.close();

    Collections.sort(al, new Comparator<Employee>(){
        public int compare(Employee e1, Employee e2){
            return e1.ename.compareTo(e2.ename);
        }
    });

    System.out.println("-------------------------------");
li = al.listIterator();
while(li.hasNext())
System.out.println(li.next());
System.out.println("--------------------------------------");
}else{
System.out.println("File not Exists ....! ");
}
break;
case 9:
if(file.isFile()){
ois = new ObjectInputStream(new FileInputStream(file));
al = (ArrayList<Employee>)ois.readObject();
ois.close();

Collections.sort(al, new Comparator<Employee>(){
    public int compare(Employee e1, Employee e2){
        return e1.ename.compareTo(e2.ename);
    }
})
}