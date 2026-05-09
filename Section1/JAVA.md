JAVA 

Java is a high level  programming language developed by james gosling in year 1982 
based on oops and can be used to develop large scale application 

java is platform independent language because the compiler convert the code into platform indepent 
byte code 

Platform independence means your software can run on any operating system
but that system should have (JVM)

JVM : Java virtual machine -> is the engine that runs java code it converts java byte code into
 machine language (understandable by os)

 JRE : Java runtine environment -> JVM + Libraries + other components needed to run java 

 JDK : Java development kit -> JRE + Development tools required to  develop java application 


 JDK have those tools which compiles java and make java devlopment easier 

 you can run a software without JDK if you have JVM installed 
 but you can develop a software/Program without JDK in java 

Create a file in camelcase with .java extension 
we write all the code in class because it is oops based language 

so the syntax is like 
public class Hello {

    public static void main(String[] args)
    {
        System.out.println("Hello World");// this will print and then change to next line 
    }
}

to run the program you can write in terminal : javac Filename.java
what what does it do javac is the java compiler it read the code you wrote in .java file and convert it 
into byte code and the file readable by your computer 
it creates a .class file and that file  we dhould run using command  java FileName
