// All the Data is Encapsulated in Encapsulation class.

public class Encapsulation {
    private int eid;
    private String ename;
    private int esalary;
    void getData(int id, String name, int salary){
        eid=id;
        ename=name;
        esalary=salary;

    }

    void show(){
        System.out.println("Employee Id is : "+eid);
        System.out.println("Employee Name is : "+ename);
        System.out.println("Employee Slary is : "+esalary);
    }

    public static void main(String[] args) {
        Encapsulation emp = new Encapsulation();
        emp.getData(1, "Masoom Raza", 2400);
        emp.show();

    }
    
}
