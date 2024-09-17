package com.example;

    public class ClassA {
        public int publicNumber=1;
        protected int protectedNumber=2;
        private int privateNumber=3;
        int defaultNumber=4;
        void printAll(){
            System.out.println(publicNumber);
            System.out.println(protectedNumber);
            System.out.println(privateNumber);
            System.out.println(defaultNumber);
        }
        public static void main(String[] args) {
            ClassA ex = new ClassA();
            ex.printAll();
        }
    }

 /*
  main Method: Required as the entry point for program execution.
  Since main is static, it can be called by the JVM without creating an instance of the class.
  This is crucial because, at the start of execution, there’s no object created yet.
  The main method being static allows the JVM to invoke it directly using the class name.
  JVM specifically looks for the main(String[] args) method to start the execution of the program.
  */