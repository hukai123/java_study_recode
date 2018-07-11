/*public class Test {
   public static void main(String args[]) {
      int x = 10;
      while( x < 20 ) {
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");
      }
   }
}*/


/*public class Test {
   public static void main(String args[]){
      int x = 10;
 
      do{
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");
      }while( x < 20 );
   }
}*/


//
/*public class Test {
   public static void main(String args[]) {
 
      for(int x = 10; x < 20; x = x+1) {
         System.out.print("value of x : " + x );
         System.out.print("\n");
      }
   }
}*/


//加强版的for循环
/*public class Test {
   public static void main(String args[]){
      int [] numbers = {10, 20, 30, 40, 50};
 
      for(int x : numbers ){
         System.out.print( x );
         System.out.print(",");
      }
      System.out.print("\n");
      String [] names ={"James", "Larry", "Tom", "Lacy"};
      for( String name : names ) {
         System.out.print( name );
         System.out.print(",");
      }
   }
}*/



//break
// break 关键字
// break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。
// break 跳出最里层的循环，并且继续执行该循环下面的语句。
/*public class Test {
   public static void main(String args[]) {
      int [] numbers = {10, 20, 30, 40, 50};
 
      for(int x : numbers ) {
         // x 等于 30 时跳出循环
         if( x == 30 ) {
            break;
         }
         System.out.print( x );
         System.out.print("\n");
      }
   }
}*/
// 结果： 10
//        20



// continue 关键字
// continue 适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。
// 在 for 循环中，continue 语句使程序立即跳转到更新语句。
// 在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。

/*public class Test {
   public static void main(String args[]) {
      int [] numbers = {10, 20, 30, 40, 50};
 
      for(int x : numbers ) {
         if( x == 30 ) {
        continue;
         }
         System.out.print( x );
         System.out.print("\n");
      }
   }
}*/
                        //continue跳出当前循环，进入下一个循环
// 10
// 20
// 40
// 50



//switch
public class Test {
   	public static void main(String args[]) {
		int a = 2;
		switch ( a ){
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;
			case 3:
				System.out.println(3);
				break;
			case 4:
				System.out.println(4);
				break;
			default: 
				System.out.println(0);
		}
	}
}
/*注意
当变量的值与 case 语句的值相等时，那么 case 语句之后的语句开始执行，直到 break 语句出现才会跳出 switch 语句。

当遇到 break 语句时，switch 语句终止。程序跳转到 switch 语句后面的语句执行。case 语句不必须要包含 break 语句。
如果没有 break 语句出现，程序会继续执行下一条 case 语句，直到出现 break 语句。*/



/**
* @author hukai
* java中的自动装箱与拆箱
* 简单一点说，装箱就是自动将基本数据类型转换为包装器类型；拆箱就是自动将包装器类型转换为基本数据类型。
*/
public class Number {
    public static void main(String[] args) {
        /*
        Integer i1 = 128;  // 装箱，相当于 Integer.valueOf(128);
        int t = i1; //相当于 i1.intValue() 拆箱
        System.out.println(t);
        */

        /*
        对于–128到127（默认是127）之间的值,被装箱后，会被放在内存里进行重用
        但是如果超出了这个值,系统会重新new 一个对象
        */
        Integer i1 = 200;
        Integer i2 = 200;

        /*   注意：
        注意 == 与 equals的区别
        == 它比较的是对象的地址
        equals 比较的是对象的内容
        */
        if(i1==i2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}


//注意，Java 会对 -128~127 的整数进行缓存，并且注意 == 和 equals 的区别。

Integer a = 10;
Integer b = 10;
System.out.println(a == b);        // true
System.out.println(a.equals(b));   // true
Integer a = 1000;
Integer b = 1000;
System.out.println(a == b);        // false
System.out.println(a.equals(b));   // true




















