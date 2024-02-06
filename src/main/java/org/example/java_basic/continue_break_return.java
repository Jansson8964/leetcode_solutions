package org.example.java_basic;

public class continue_break_return {
    public static void main(String[] args) {
        boolean flag = false;
        for (int i = 0; i <= 3; i++) {
            if (i == 0) {
                System.out.println("0");
            } else if (i == 1) {
                System.out.println("1");
                continue;
            } else if (i == 2) {
                System.out.println("2");
                flag = true;
            } else if (i == 3) {
                System.out.println("3");
                break;
            } else if (i == 4) {
                System.out.println("4");
            }
            System.out.println("xixi");
        }
        if (flag) {
            System.out.println("haha");
            return;
        }
        System.out.println("heihei");
    }

    /*
    continue
作用：continue用于立即跳过当前循环的剩余部分，转而开始下一次的循环迭代。
示例中的应用：在if (i == 1)块中，当i的值为1时，continue;被执行。这导致循环跳过当前迭代剩余的代码（即不执行打印"xixi"的那行代码），直接进入下一个循环迭代（i增加到2）。
break
作用：break用于立即退出循环，不再执行任何后续迭代。
示例中的应用：在if (i == 3)块中，当i的值为3时，执行break;。这导致循环完全终止，即使for循环的条件允许继续。break的执行意味着for循环后面的迭代（比如i == 4的情况）不会执行。
return
作用：return用于从当前方法中退出。在main方法中使用return;会导致程序终止。
示例中的应用：在检查flag值之后，如果flag == true（实际上在循环中已经设置为true），则执行System.out.println("haha");后，紧接着执行return;。这导致程序立即结束，因此System.out.println("heihei");这行代码不会被执行。
总结：

continue 在循环中用于跳过当前迭代的剩余部分，直接进入下一次迭代。
break 用于完全终止循环，不再执行任何后续的迭代。
return 从当前执行的方法中退出。如果这个方法是main，则导致程序终止。*/

    /*
    The continue statement is used within a loop to skip the remainder of the current iteration and jump directly to the next iteration.
The break statement is used to completely terminate the loop, halting the execution of any subsequent iterations.
The return statement exits from the current executing method. If this method is main, it results in the termination of the program.
     */
}
