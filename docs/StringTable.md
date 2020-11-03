一、String的基本特性

------

- String：双引号表示字符串。

  ```java
          String s1 = "fablen";    //字面量的定义方式
          String s2 = new String("fablen"); // new方式
  ```

  

- String：由 final 关键字修饰。

  ```java
    public final class String implements java.io.Serializable, Comparable<String>, CharSequence {...}
  ```




- String：不可变性，代表不可变的字符序列。

  1. 当字符串重新赋值时，需要重写内存区域赋值，不能使用原有的value进行赋值

  2. 当对现有的字符串进行连接时，也需要重新指定内存区域赋值，不能使用原有的value进行赋值

     ```java
         @Test
         public void test2() {
             String s1 = "fablen";
             String s2 = "fablen";
             String s3="fablen";
             s2 += "hello";
             System.out.println(s1 == s2); //判断地址：false
         }
     ```

     

  3. 当调用String的replace()方法修改指定字符串或字符时，也需要重新指定内存区域赋值，不能使用原有的value进行赋值

     ```java
         @Test
         public void test3() {
             String s1 = "fablen";
             String s2 = s1.replace("f","y");
             System.out.println(s1); // fablen
             System.out.println(s2); // yablen
         }
     ```



- 在字符串常量池中是不会存储相同内容的字符串

		> Java语言规范里要求完全相同的字符串字面量应该包含相同的Unicode字符序列（同一份码点序列的常量），并且必须是指向同一个String类实例 



二、String的内存分配

------

- String类型的常量池比较特殊，主要的使用方法有2种

  1. 直接使用双引号声明出来的String对象会直接存储在常量池中

     ```java
             String info = "fablen";   //"fablen" 字符串是直接存储在常量池中
     ```

     

  2. 使用intern（）方法

     ```java
         // -XX:MetaspaceSize=60m -XX:MaxMetaspaceSize=60m -Xms60m -Xmx60m
         public static void main(String[] args) {
             //使用set保持常量池引用，避免full gc 回收常量池行为
             Set<String> set= new HashSet<>();
             short i = 0;
             while (true){
                 set.add(String.valueOf(i++).intern());
             }
         }
     ```

     

  



三、String的基本操作

------





字符串拼接

------





intern()的使用

------





String的垃圾回收

------

