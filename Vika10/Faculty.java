/******************************************************************************
 *  Nafn    : Liang
 *  Introduction to Java Programming and Data Structures, Comprehensive Version
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

    public class Faculty extends Employee {
        public static void main(String[] args) {
            new Faculty();
        }

        public Faculty() {
            System.out.println("(4) Faculty's no-arg constructor is invoked");
        }
    }

    class Employee extends Person {
        public Employee() {
            this("(2) Invokes Employee’s overloaded constructor");
            System.out.println("(3) Employee's no-arg constructor is invoked");
        }

        public Employee(String s) {
            System.out.println(s);
        }
    }

    class Person {
        public Person() {
            System.out.println("(1) Person's no-arg constructor is invoked");
        }
    }

