// import java.io.*;
 
// public class Employee{
//    String name;
//    int age;
//    String designation;
//    double salary;
//    // Employee ��Ĺ�����
//    public Employee(String name){
//       this.name = name;
//    }
//    // ����age��ֵ
//    public void empAge(int empAge){
//       age =  empAge;
//    }
//    /* ����designation��ֵ*/
//    public void empDesignation(String empDesig){
//       designation = empDesig;
//    }
//    /* ����salary��ֵ*/
//    public void empSalary(double empSalary){
//       salary = empSalary;
//    }
//    /* ��ӡ��Ϣ */
//    public void printEmployee(){
//       System.out.println("����:"+ name );
//       System.out.println("����:" + age );
//       System.out.println("ְλ:" + designation );
//       System.out.println("нˮ:" + salary);
//    }
// }

public class Employee{
   //aa�Ǿ�̬��˽�б���,Ҳ�������
   private static double aa;
   // DEPARTMENT��һ������
   public static final String DEPARTMENT = "������Ա";
   // ���ʵ������������ɼ�
   public String name;
   // ˽�б��������ڸ���ɼ�
   private double salary;
   //�ڹ������ж�name��ֵ
   public Employee (String empName){
      name = empName;
   }
   //�趨salary��ֵ
   public void setSalary(double empSal){
      salary = empSal;
   }  
   // ��ӡ��Ϣ
   public void printEmp(){
      System.out.println("���� : " + name );
      System.out.println("нˮ : " + salary);
   }
 
   public static void main(String[] args){
      Employee empOne = new Employee("RUNOOB");
      empOne.setSalary(1000);
      empOne.printEmp();
   }
}