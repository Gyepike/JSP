package com.anti;

/**
 * Hello world!
 *  
 * mvn install -DskipTests ha nem akarjuk teszteket futatni
 * normal build mvn install 
 * execute cmd line package java -cp target\summaven-1.0-SNAPSHOT.jar com.anti.App 12 56	
 * create project mvn archetype:generate -DgroupId=com.anti -DartifactId=summaven -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false	
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Sum arguments" );
        System.out.println("Argument count: " + args.length);
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
              sum  += Integer.parseInt(args[i]);
        }
         System.out.println(sum);
    }
}
