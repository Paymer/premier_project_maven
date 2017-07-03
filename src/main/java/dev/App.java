package dev;


import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 


{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        String asciiArt = FigletFont.convertOneLine("oh là là");
        System.out.println(asciiArt);
        

        
    }
}




