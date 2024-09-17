
//ClassName (pascal)
//functionName (camel)

//In Java, all code must be contained within a class.
public class Main{
// since this class needs to be accessible by the Java runtime to start the program, it must be declared public
// and public class name should match with the file name (compile takes filename and search for that class)
// public is access modifier
    public static void main(String[] args) {
        // here we have made function as static so that it can run using ClassName.functionName(without object)
        System.out.println("Hello, World!");
        // System is a final class in java.lang library
        // out is object of PrintStream class (as a public static final field inside system class)
        // println is a method of PrintStream class
    }
}
/*
Tokens vs keywords
Keywords are reserved words like if,while,for,public
Tokens are the smallest element meaningful to the compiler like class,a,5,+,{
Tokens include keywords,identifier,literal,operators,seperators except whitespace and comments
*/

/*
Primitive data type in java are:
byte,int,float,long,char,double,bool,short

java is statically-typed language(need to tell the type of variable)
1. byte:    takes 1byte
2. short:   takes 2bytes
3. int:     takes 4bytes
4. float:   takes 4bytes (stores 6 to 7 decimal places)
5. long:    takes 8bytes 
6. double:  takes 8bytes (stores 15 decimal places)
7. boolean: takes 1bit
8. char:    takes 2bytes(single character/Ascii values)

*/
///literals
class Main{
    public static void main(String[]args){
        System.out.print("Print function don't add new line automatically");
        byte b = 12;
        int i = 30;
        long l = 1234567890l;
        float f = 123.12f; //must write suffix f/F as by default decimal are taken as double 
        double d = 12.345678d;
        char c = 'A';
        String s = "Pied Piper";
        System.out.println(b);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(s);
        //println don't support multiple variables like
        //System.out.println(b,i,l,f,d) 
    }
}

// import java.util.Scanner;
// Scanner class helps to take user input 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer:");
        int x=sc.nextInt();
        //? It never went to when condition as if we enter any value other than integer it throws error
        if(sc.hasNextInt()){
            System.out.println(x+" is not an integer");
        }
        System.out.println("Enter any float:");
        float f = sc.nextFloat();
        System.out.println("Enter any string:");
        String w = sc.next(); // it takes only single word(terminates after white space)
        System.out.println("Enter any string:");
        String str = sc.nextLine(); //it takes single line

        System.out.println("f="+f+" | w="+w+" | str="+str);
    }
}

/*
    Arithmetic Operators: +,-,*,/,%
    Assigment Operators: =,+=,-=,*=,/=
    Comparison Operators: ==,>=,<=
    Logical Operators: &&,||,!
    Bitwise Operators: &,|

*/
public class Main{
    public static void main(String[] args) {
        float x=12.9f;
        float y=2.2f;
        //All arithmetic operators also works for float and double
        System.out.println(x%y);
        int a= 5; // 101
        int b= 6; // 110
        // --------------
        //           100
        System.out.println(a&b);
    }
}

/*
 Operators----Precendence----Associativity 
    +,-        low              L->R
    *,/        high             L->R
    ++,--,==   very high        R->L
 */


 /*
  data type conversion (promoted to preserve the precision)
  float + byte/short/int = float
  double + byte/short/int/float = double
  int + byte/short = int
Also,
  int x= byte + short (here both will be promoted to int)
 */

 /*********************Strings**************************/
 //String are immutable 

 public class Main{
    public static void main(String[] args) {

        int a=12;
        float b=12.3333f;
        System.out.printf("The value of a =%d and b=%8.2f",a,b); 
        // %8.2f means upto 2 decimal places and 8 is spaces
        // print using format specifier 
        // String: %s, Char: %c

        String s1 = "This is one way to initialize";
        String s2 = new String("This is another");

        System.out.println(s1.length());// return length of string
        System.out.println(s1.toUpperCase());// return string with all uppercase letter 
        System.out.println(s1.trim());// returns trimmed starting and trailing spaces
        System.out.println(s1.endsWith("way"));// returns boolean
        System.out.println(s1.charAt(1)); // return char at that index
        System.out.println(s1.indexOf('i')); // returns index of first occurrence of char from forward
        System.out.println(s1.indexOf('i',4)); // returns index of first occurrence of char but it starts searching forward from that index
        System.out.println(s1.lastIndexOf('i')); // returns index of first occurence for char from backwards
        System.out.println(s1.lastIndexOf('i',4)); // return index of first occurrence of char but it starts searching backward from that index
        System.out.println(s1.replace('s','w')); // replaces all occurrences of old char(first) with new char(second)
        System.out.println(s1.replace("is","was")); // replaces all occurences of old string(first) with new string(second)

        System.out.println("This is \"double\" \t digit"); // backlash is used before for escape sequence

    }
}


/*************if else switch for while***************/
//same as c/c++
public class Main{
    public static void main(String[] args) {
        int x= 34;
        if (x>=18 && x<=60){
            System.out.println("You are eligible");
        }else{
            System.out.println("You are not eligible");
        }

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("Now your life will become hell");
                break;
            case 60:
                System.out.println("Take care of your health");
                //if we don't add break, after condition is matched it will execute all belows
            default:
                System.out.println("Aah! here we go again");
        }

        int i = 1;
        while (i<=100) { 
            System.out.println(i);
            i++;
        }

        // while (1) { doesn't run in java lang
        // } instead of 1 we can use true

        //break; to break out of loop
        //continue; go to start of loop
    }
}

/****************Array*************/

public class Main {
    public static void main(String[]args){
        // Three ways to define an array
        int []arr = new int[5]; // declare + memory allocation
        //total = (5*4)bytes = 20bytes contigous memory allocated
        //initialization
        arr[0]=1;
        arr[1]=22;
        arr[2]=333;
        arr[3]=4444;
        arr[4]=55555;
        // arr[5]= 1234; - throws error
        System.out.println(Arrays.toString(arr)); //[1,22,333,4444,55555]

        int []nums; //declare
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nums = new int[n]; //memory allocation
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt(); //intialize
        }
        //method to print the whole array
        System.out.println(Arrays.toString(nums));

        int []marks = {95,89,72,98,86}; //declare + intialization
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks of subject_"+(i+1)+"="+marks[i]);
        }
        // an alternate way to print an array
        for (int mark : marks){ 
            System.out.println(mark);
        }

        //2D array
        String [][]flat = new String[2][3];
        flat[0][0]="001";
        flat[0][1]="002";
        flat[0][2]="003";
        flat[1][0]="101";
        flat[1][1]="102";
        flat[1][2]="103";
        for (int i = 0; i < flat.length; i++) {
            for (int j = 0; j < flat[0].length; j++) {
                System.out.print(flat[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}

/********************Method****************/

public class Main {
    int diff(int a, int b){
       if (a>b){
           return a-b;
       }else{
           return b-a;
       }
   }
   public static void main (String[]args){
       int x=4;
       int y=7;
       // System.out.println(diff(x, y)); 
       //here, diff must me static (only static methods can be called from static method )

       Main t = new Main();
       // in c++ , Main t; works as we can create object in stack as well as heap
       // in java , objects are always created in heap ,therefore, new Main() is required
       int z = t.diff(x, y);
       // in c++/java it is ok to use object of class inside the method of the same class
       System.out.println(z);

   }
}
/*********Method Overloading && VarArgs(Variable Arguments)************/

public class Main {
    // function with same name but different parameters
    public static void foo(){
        System.out.println("foo with no parameter");
    }
    public static void foo(int x){
        System.out.println("foo with one parameter");
    }
    public static void foo(int a, int b){ //Parameters
        System.out.println("foo with two parameter");
    }
    public static int sum(int ...arr){ //VarArgs (can take multiple number of parameter)
        int sum = 0;
        for (int x: arr){
            sum+=x;
        }
        return sum;
    }
    public static void main (String[]args){
        foo();
        foo(2);
        foo(1,2); //Arguments

        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum(5,6,7));        
    }
}

/***************OOPS*****************/

class Employee{
    private String name;
    private int age;
    private float salary;
    //setter function (for private variables)
    public void setName(String name) {
        this.name = name;
    }
    //getter function (for private variables)
    public String getName() {
        return name;
    }
    //Constructor : method having same name as class and don't have return type
    public Employee(){
        this.name = "john doe";
        this.age = 23;
        this.salary = 80000f;
    }
    // constructor can be overloaded
    public Employee(String name, int age, float salary){
        // this refer to the current object (i mean stores address of current object)
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    void EmployeeDetail(){
        System.out.println("Employee Name: "+this.name+"\nEmployee Age:"+this.age+"\nEmployee Salary:"+this.salary);
    }
}

public class Main {
    
    public static void main (String[]args){
        Employee e = new Employee();
        e.setName("Rahul singhania");
        System.out.println(e.getName());

        Employee emp = new Employee("Robert jr",48,9999999f);
        emp.EmployeeDetail();
    }
}
//************Inheritance ***************************/

// parent's default constructor will be called automatically after creating an object
// but to call parameterized constructor of the parent we need to use super

// Base/Parent/Super class
class Animal {
    protected String name;
    protected int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    public void displayName() {
        System.out.println("Animal Name: " + name);
    }

    public void displayNameAge(){
        System.out.println("Animal: "+name+" | age= "+age);
    }
}

// Derived/Child/Sub class
class Dog extends Animal{
    public Dog(String name,int age){
        super(name,age);
    }
    //compiler looks if it has been correctly overridden or not else throws error at compile time
    //for readability also
    @Override
    public void makeSound(){
        System.out.println(name+" says: Woof...Woff..");
    }
}

// Super refers to the immediate superclass of the current object
// Super is used to 
// 1. to call the constructor of superclass
// 2. to call the variables of superclass
// 3. to call the methods of superclass

class Cat extends Animal{
    private String catage;
    public Cat(String name,String catage){
        super(name,0);
        this.catage = catage;
    }
    @Override
    public void displayNameAge(){
        super.displayNameAge();
        System.out.println("Animal: "+name+" | Cat age= "+catage);
    }

    public void diplaySuperClass(){
        System.out.println("Animal: "+name+" | age= "+super.age);
    }
}
public class Main {

    public static void main (String[] args){
        Dog d = new Dog("Tommy",4);
        d.displayName();
        d.makeSound();

        Cat c= new Cat("Me-chan","6 months");
        c.displayNameAge();
        c.diplaySuperClass();
    }  
}

// Dynamic Method Dispatch (runtime polymorphism)
class Phone {
    void alarm(){
        System.out.println("Setting the alarm...");
    }
    void on(){
        System.out.println("Switching on the phone...");
    }
}

class SmartPhone extends Phone{
    void game(){
        System.out.println("starting the game...");
    }
    @Override
    void on(){
        System.out.println("Switching on the smart phone...");
    }
}
public class Main {

    public static void main(String[] args) {
        // superclass reference (Phone ph) can refer to subclass object (new SmartPhone)
        // happens at runtime
        Phone ph = new SmartPhone(); //Allowed
        // SmartPhone smph = new Phone(); //Not Allowed

        //only overridden methods can be called as it checks object type
        ph.on();//calls method of subclass
        ph.alarm();

        // non-overridden methods can't be called as it checks reference type
        // ph.game();
    }
}


// Abstract = exist in thought without concrete existence

// Abstract class ( class having atleast one abstract method )
// it won't be having any object
abstract class Animal{
    //abstract method: method without implementation (does not have a body)
    abstract void makeSound();
    //concrete method:(does have a body)
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

class Dog extends Animal{
    @Override
    //all the abstract methods must be overridded
    void makeSound(){
        System.out.println("Says woof woof...");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Says meow meow...");
    }
}

public class Main{
public static void main(String[] args) {
    Dog spike = new Dog();
    spike.makeSound();
    spike.sleep();

    Cat tom = new Cat();
    tom.makeSound();
    tom.sleep();
}
}

// Interfaces used to declare a behavior that classes must implement.
// here all the methods are without the body

interface Device {
    //! variable in interface are by default (public static final)
    int power = 10000;
    // properties can be created in interface
    // although these properties are final (cannot be modified)
    
    // interface methods are public (by default)
    void powerOn();
    void powerOff();

    // Default methods do not need to be overridden in the implementing class unless customization is required.
    // They allow interfaces to be updated with new methods without breaking existing implementations.

    default void deviceInfo() {
        Apology();
        System.out.println("This is a generic device.");
    }
    // private methods cannot be used in inherited class
    // it is just to break the logic for default methods
    private void Apology(){
        System.out.println("Sorry for inconvenience");
    }
}

//interface can inherit another interface
interface Phone extends Device {
    void makeCall(String number);  
    void receiveCall(String number);
}

interface Camera extends Device {
    void takePhoto();  
    void recordVideo(); 

}
interface MusicPlayer extends Device {
    void playMusic(String song);
    void stopMusic();  
}

// Multiple inheritance can be implemented in java through interfaces
class Smartphone implements Phone, Camera, MusicPlayer {

    @Override
    public void powerOn() {
        System.out.println("Smartphone: Powering on.");
    }

    @Override
    public void powerOff() {
        System.out.println("Smartphone: Powering off.");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Smartphone: Calling " + number + "...");
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("Smartphone: Receiving a call from " + number + "...");
    }

    @Override
    public void takePhoto() {
        System.out.println("Smartphone: Taking a photo.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Smartphone: Recording a video.");
    }

    @Override
    public void playMusic(String song) {
        System.out.println("Smartphone: Playing the song \"" + song + "\".");
    }

    @Override
    public void stopMusic() {
        System.out.println("Smartphone: Stopping the music.");
    }

    // Overriding the default method from Device
    @Override
    public void deviceInfo() {
        System.out.println("This is a smartphone with phone, camera, and music player features.");
    }

}

public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone();

        // Using phone functionalities
        myPhone.powerOn();
        myPhone.makeCall("123-456-7890");
        myPhone.receiveCall("098-765-4321");

        System.out.println();

        // Using camera functionalities
        myPhone.takePhoto();
        myPhone.recordVideo();

        System.out.println();

        // Using music player functionalities
        myPhone.playMusic("Favorite Song");
        myPhone.stopMusic();

        System.out.println();

        // Using device info
        myPhone.deviceInfo();  // Overridden method from Device interface


        Device dev = new Smartphone();// dynamic method dipatch
        dev.powerOn();
        // cam.takePhoto(); // can only use methods of 
        

        //! called using class
        System.out.println(Device.power);
        // Payment.total=33;
    }
}

//abstract vs interfaces
//mutiple inheritance is allowed using interfaces but not using abstract


/*
 Main.java -----compiled(using javac compiler)---> Main.class (bytecode)
 Main.class (bytecode)[which is understood by jvm] -----interpreted by jvm then converted to machine code that h/w understands
 
 Main.class can be run in any platform as long as it has jvm
*/

/*

script to run java from command propmt:
 javac Main.java
 java Main

*/

/*
 'package' keyword is used to group related classes together

 so let’s say we have to create a package for Employee.
 We will create Employee.java file with package org.company.employees.
 Note: The general convention is to use a reverse domain name like com.shop to avoid naming conflicts if the same class is created in different packages.

 Once the file is created, run the following command:
 javac -d . Employee.java
 Here: "-d" specifies which directory to put the class file into.
 Here: "." specifies to put it in the current directory (i.e., directory defined in the package).
 => This will create a new folder structure org/company/employees where Employee.class will be placed.
 Note: It is good practice to pre-create the folder structure and keep Employee.java in that folder.

 To use the package -> import org.company.employees.Employee
 Here: This tells you want to use the Employee class from the "org.company.employees" package.
 
*/

/*

Access Levels
              Same    Same
Modifier	  Class	 Package  Subclass  World
public	        Y	    Y	    Y	     Y
protected	    Y	    Y	    Y	     N
default 	    Y	    Y	    N	     N
private	        Y	    N	    N	     N


public can be used in same class / same package / child class / any other class (by importing)
protected can be used in same class / same package / child class ( through child class instance )
default can be used in same class / same package (called as packaged-private)
private can be used in same class

here
same package => either same class file's object is using / other class in same package is using through import

Note: class B can use class A directly without importing (iff they are in same package)
*/

///////////////////// Multi-threading//////////////////k
// Concurrency vs Parallelism
// Concurrency : doing multiple tasks at once, not necessarily running simultaneously
// Parallelism : simultaneous execution of multiple tasks amongst different processors.

// for single core: 
// CPU switches between both threads(context switching) so fast that it gives the appearance of concurrency

// for multi core: 
// Different cores are executing different threads in parallel


// Method 1 [By Extending Thread Class]
class Thread1 extends Thread{
    @Override
    public void run(){ // this method is executed when thread starts
        int i=0;
        while(i<100){
            System.out.println("Thread 1 : Eating");
            i++;
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Thread 2 : Studying");
            i++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start(); // calls starts the thread which then call run method
        t2.start(); 

        // Both thread are running concurrently 
        // here, both will run 100 times but order can vary as it depends on how the thread scheduler 
        // (which is managed by the operating system) decides to switch between the two threads.
    }
}

// Method2 [By Implementing the Runnable Interface]

class MyThreadRunnable1 implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("This is MyThreadRunnable 1");
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("This is MyThreadRunnable 2");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();

        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}

/*
 Summary
 Method1: to extends thread class and override run function in your class
 Method2: pass the runnable object to the thread constructor

 Behind the hood => Thread class implements runnable interface (so class which extends will override run method) 
                    but if we pass the runnable object to it (custom runnable object class has overriden run method)
                    it will execute second one if both are present
                 => when thread starts it looks for run method as it the entry point for work
 */

/*
 Life cycle of thread
 1. New = instance is created but not yet started
 2. Runnable = after invocation of start and before it is selected to run by scheduler
 3. Running = after thread has been selected
 4. Non Runnable = thread alive , not eligible to run 
 5. Terminated = run method has exitted

 common constructors of thread:
 thread()
 thread(string name)
 thread(runnable r)
 thread(string name, runnable r)
 */

//priorities in thread

class MyThread extends Thread{
    public MyThread(String name){
        super(name); //name needs to be passed to thread class constructor
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName()+" is running..");
        }
        
    }
}

public class Main{
public static void main(String[] args){
        
    MyThread t1 = new MyThread("t1"); // we can assign a name to the thread
    MyThread t2 = new MyThread("t2");
    MyThread t3 = new MyThread("t3");
    MyThread t4 = new MyThread("t4");
    MyThread t5 = new MyThread("t5");

    t5.setPriority(Thread.MAX_PRIORITY);// we can set priority to the thread so cpu will give more time to it
    t1.setPriority(Thread.MIN_PRIORITY);// it doesn't guarantee that t5 will finish first
    t2.setPriority(Thread.MIN_PRIORITY);// as os scheduler makes the final decision
    t3.setPriority(Thread.MIN_PRIORITY);
    t4.setPriority(Thread.MIN_PRIORITY);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
}
}

/* Code snippet for join method
    MyThread t00 = new MyThread("t00");
    MyThread t01 = new MyThread("t01");

    t00.start();
    try {
        t00.join();
    } catch (Exception e) {
        System.out.println(e);
    }
    t01.start();

    here , t01 won't start until unless t00 finishes
*/


///Error Handling///
/*
 syntax error (compiler throws error)
 logical error (created by developer)
 runtime error (created by user)
 */

// Exception : disruption from the normal flow
// Exception Handling

 public class Main{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        // we handle exeption using try catch block
        try {
            int c = a/b;
        } catch (Exception e) {
            System.out.println("The exception happened due to reason: "+ e.getMessage());
        }
        // so program don't exit abruptly
        // instead it executed the whole
        System.out.println("End of the program");
    }
}



// Handling specific exceptions
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an array index: ");
        int index = scanner.nextInt();
        
        System.out.print("Enter a number to divide by: ");
        int divisor = scanner.nextInt();
        
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // Possible ArrayIndexOutOfBoundsException
            int number = numbers[index];
            
            // Possible ArithmeticException
            int result = number / divisor;

            System.out.println("Result: " + result);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("End of program.");
        }

        scanner.close();
    }
}

// we can put try inside an other try statement

// Creating Custom Exception
import java.util.Scanner;

class InvalidSideSquareException extends Exception {
    @Override
    public String toString() {
        return "InvalidSideSquareException: Side of square cannot be zero or negative";
    }

    @Override
    public String getMessage(){
        return "Side of square cannot be zero or negative";
    }
}

public class Main {
    public static void CalculateArea(int s) throws InvalidSideSquareException{
        // throws tells the function caller to must handle the exception using try catch
        if (s<=0) throw new InvalidSideSquareException();

        // java doesn't need curly braces for one line if    
        System.out.println("Area of square is : " + s*s);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length of the side of the square: ");
            int s = sc.nextInt();
              
            try {
                CalculateArea(s);

            } catch (Exception e) {
                System.out.println(e); //same as e.toString()
                System.out.println(e.getMessage());
            }
            finally{
                // they definitely run , doesn't matter if try has return , break or other
                System.out.println("clearing out the memory...");
            }
    }
}
}

//************************Collections*********************//

//************************ArrayList*********************//
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Integer> l1 = new ArrayList<>(3); // <Integer> specifies the type of elements
        ArrayList<Integer> l2  = new ArrayList<>(3); // Initial capacity of 3

        l2.add(11);
        l2.add(33);
        
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(3);
        l1.add(7); // Insert 7 at the last
        l1.add(0, 888); // Insert 888 at index 0

        l1.addAll(0, l2); // Add all elements of l2 starting at index 0

        // l1.clear(); // to clear the list

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i)); // get the element at index i as l1[i] doesn't work
        }
        
        System.out.println("****");
        
        System.out.println(l1.contains(3)); // Check if l1 contains 3
        System.out.println(l1.indexOf(3)); // Get the first occurrence index of 3
        System.out.println(l1.lastIndexOf(3)); // Get the last occurrence index of 3

        
        ArrayList<Integer> t = (ArrayList<Integer>) l1.clone(); // Clone l1 to t
        // here typecasting is done as clone method return object
        System.out.println(t.equals(l1)); // Check if t equals l1
        
        l1.set(1, 55); // Replace element at index 1 with 55
        System.out.println("Orginal arraylist l1");
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i)+","); 
        }
        System.out.println();
        System.out.println("Shallow copy t = ");
        for (int i = 0; i < t.size(); i++) {
            System.out.print(t.get(i)+","); 
        }

        /*
        When you clone a list containing immutable objects, each list has its own set of immutable objects.
        Thus, changes to one list do not affect the other list, even though it's a shallow copy.
        like Integer , String
        */
        
    }
}
/*
 initial default capacity of arraylist is 10

 When the array is full, a new larger array is created.
 The existing elements are copied to the new array.
 The capacity of the ArrayList is typically increased by 1.5 times the current capacity.
*/

//************************LinkedList*********************//
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        
       LinkedList<Integer> l1 = new LinkedList<>();
       // most of the methods are same as of arraylist
       l1.add(10); 
       l1.add(20);
       l1.add(30);
       
       // Insert an element at a specific index
       l1.add(1, 15);
       
       // LinkedList allows efficient insertion at any index (compared to ArrayList)
       // because it doesn't require shifting elements, it just changes references.

       System.out.println("LinkedList after insertion:");
       for (int i = 0; i < l1.size(); i++) {
           System.out.print(l1.get(i) + " ");
       }

       System.out.println("\n");

       // Remove an element
       l1.remove(2);

       System.out.println("LinkedList after removal:");
       for (int i = 0; i < l1.size(); i++) {
           System.out.print(l1.get(i) + " ");
       }
    }
}

//************************Array Deque*********************//
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        
        // Create an ArrayDeque of Integer type
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        
        // deque: doubled ended queue (insertion and deletion happens at both the ends)
        deque.add(10);  // Adds element at the end 
        deque.addFirst(5);  // Adds element at the front
        deque.addLast(20);  // Adds element at the end
        
        System.out.println("Deque after insertions:");
        for (Integer elem : deque) {
            System.out.print(elem + " ");
        }
        System.out.println("\n");

        // Remove elements from both ends
        deque.removeFirst();  
        deque.removeLast(); 

        System.out.println("Deque after removals:");
        for (Integer elem : deque) {
            System.out.print(elem + " ");
        }
        System.out.println("\n");

        System.out.println("First element: " + deque.peekFirst());  // Peek at the front
        System.out.println("Last element: " + deque.peekLast());  // Peek at the end

        // Check if deque is empty
        System.out.println("Is deque empty? " + deque.isEmpty());
    }
}

/*
 java automatically converts 
 Autoboxing (automatic conversion from int to Integer)
 Unboxing (automatic conversion from Integer to int)
 */

//************************Hashset*********************//
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        
        // Create a HashSet of Integer type
        HashSet<Integer> hs = new HashSet<>();
        
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);  // Duplicate, will not be added
        
        // HashSet does not preserve insertion order
        System.out.println(hs);
        
        // Check if an element exists
        System.out.println("Does the set contain 20? " + hs.contains(20));

        // Remove an element
        hs.remove(20);
        
        // offers O(1) time complexity for basic operations like add, remove, and contains
    }
}


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        // returns number of milliseconds passed sinch epoch time (1 jan 1970)

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());

        Calendar c = Calendar.getInstance(); // getInstance is static method which return calendar object
        // here calendar is an abstract class
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2024));

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        System.out.println("********************");
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        // now is static function which return ready-made object with system's date and time

        DateTimeFormatter dtf1 = DateTimeFormatter.BASIC_ISO_DATE; //some standard pattern
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("|dd__MM__YYYY|"); //custom pattern

        System.out.println(dt1.format(dtf1));
        System.out.println(dt2.format(dtf2));
    }
}

// Annotation : changes the behaviour of compiler
// @Override : use to mark overriden elm of child classes
// @SuppressWarnings : use to supress generated warning 
// @Deprecated : to mark deprecated things


interface Vehicle{
    void start();
    void stop();
}

@FunctionalInterface // interface having only one method
interface Rook{
    void moveForward();
}

// Generic class
class Box <T>{
    private T item;
    public Box(T item){
        this.item = item;
    }
    void setItem(T item){
        this.item = item;
    }
    T getItem(){
        return item;
    }
}

// Generic methods
class ShowDetails{
    public static <T> void printList(T[] list){
        for (T elem : list) {
            System.out.print(elem);
            System.out.print(",");
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {

        // Anonymous class
        Vehicle v = new Vehicle() {
            @Override
            public void start(){
                System.out.println("starting the vehicle...");
            }
            @Override
            public void stop(){
                System.out.println("stoping the vehicle...");
            }
        };
        v.start();
        v.stop();

        // Lambda function (only for function interface)
        Rook r = ()->{
            System.out.println("moving in straight");
        };
        r.moveForward();

        // Generic 
        Box<String> xbox = new Box<>("hello");
        xbox.setItem("this is string now");
        System.out.println(xbox.getItem());

        Box<Integer> ybox = new Box<>(123);
        ybox.setItem(444);
        // ybox.setItem("string again"); // throws error at compile time
        // generic type help to make safety check
        Integer s = ybox.getItem();
        System.out.println(s);
        //also takes care of typecasting due to generics

        int[] l0 = {1,2,3,4};
        // As generic type only work for reference types(object) not for primitive types
        // because java does type erasure that means it remove 'T' with Object (or specific bound)
        // Also int <=> Integer handles by java autoboxing and unboxing
        Integer[] l1 = {1,2,3,4};
        String[] l2 = {"jack daniel","old monk","magic moments"};
        // ShowDetails.printList(l0);
        ShowDetails.printList(l1);
        ShowDetails.printList(l2);
    }
}

/* 
 Note:-
 When you override a method in a subclass, you can’t reduce the visibility of the overridden method (e.g., from public to private).
*/

/*
 Final keyword:
 - can be applied to class , methods and variables
 - final class prevents subclassing
 - same goes for methods and variables (cannot be overriden)
 - reason: can't compromise security , immutability and improve performance (as compiler knows it wouldnt be overridden)
*/

