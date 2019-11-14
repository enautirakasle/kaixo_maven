package eus.enautirakasle.kaixoMaven;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	String matricula = crackImage("C:\\Users\\ikaslea\\Pictures\\matricula.jpg");
    	System.out.println(matricula);
    }
    
    public static String crackImage(String filePath) {  

        File imageFile = new File(filePath);  

        ITesseract instance = new Tesseract();  

        try {  

        	//instance.setLanguage("spa");
            String result = instance.doOCR(imageFile);  

            return result;  

        } catch (TesseractException e) {  

            System.err.println(e.getMessage());  

            return "Error while reading image";  

        }  

    }
}
