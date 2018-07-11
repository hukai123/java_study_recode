// import java.io.*;
 
// public class Employee{
//    String name;
//    int age;
//    String designation;
//    double salary;
//    // Employee 类的构造器
//    public Employee(String name){
//       this.name = name;
//    }
//    // 设置age的值
//    public void empAge(int empAge){
//       age =  empAge;
//    }
//    /* 设置designation的值*/
//    public void empDesignation(String empDesig){
//       designation = empDesig;
//    }
//    /* 设置salary的值*/
//    public void empSalary(double empSalary){
//       salary = empSalary;
//    }
//    /* 打印信息 */
//    public void printEmployee(){
//       System.out.println("名字:"+ name );
//       System.out.println("年龄:" + age );
//       System.out.println("职位:" + designation );
//       System.out.println("薪水:" + salary);
//    }
// }

public class Employee{
   //aa是静态的私有变量,也叫类变量
   private static double aa;
   // DEPARTMENT是一个常量
   public static final String DEPARTMENT = "开发人员";
   // 这个实例变量对子类可见
   public String name;
   // 私有变量，仅在该类可见
   private double salary;
   //在构造器中对name赋值
   public Employee (String empName){
      name = empName;
   }
   //设定salary的值
   public void setSalary(double empSal){
      salary = empSal;
   }  
   // 打印信息
   public void printEmp(){
      System.out.println("名字 : " + name );
      System.out.println("薪水 : " + salary);
   }
 
   public static void main(String[] args){
      Employee empOne = new Employee("RUNOOB");
      empOne.setSalary(1000);
      empOne.printEmp();
   }
}