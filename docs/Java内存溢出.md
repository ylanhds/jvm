### 一、常见 java.lang.OutOfMemoryError 问题

------

1、用一段循环添加对象的代码来模拟内存溢出问题。

```java
package com.fablen;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author fablen
 * @version v1.0.0
 * @date 2020-10-28 15:58
 * @see
 */
public class OutOfMemoryDemo {
    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        while (true) {
            objectList.add(new Object());
        }
    }

}

```

2、运行程序

------

![image-20201028163507475](D:\IdeaProjects\jvm\docs\images\OutOfMemoryError.png)

3、问题已经出现了，那么我们分析它是这么溢出的。首先查看OutOfMemoryError.java这个类的说明。当Java虚拟机无法分配对象（因为它内存不足，并且垃圾回收器无法再提供更多内存）时，抛出该异常。通常就2个原因

1. 当Java虚拟机无法分配对象，内存耗尽。
2. 垃圾回收无法及时回收内存








