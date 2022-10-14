package ejercicio1_cristiang;

import java.io.File;

public class Ejercicio1_CristianG {

    public static void main(String[] args) {
        
        //1ºPARTE DEL EJERCICIO
        File f=new File("DAM 2_CRISTIAN GONZÁLEZ GARCÍA_EJERCICIO 1\\alumno.xml");
        System.out.println("El nombre del archivo xml es: "+f.getName());
        System.out.println("El directorio padre es: "+ f.getParent());
        System.out.println("La ruta relativa es: "+ f.getPath());
        System.out.println("La ruta absoluta es: " +f.getAbsolutePath());
        
        //2ºPARTE DEL EJERCICIO
        if(f.exists()){
            System.out.println("El fichero existe");
        }
        else{
            System.out.println("El fichero no existe");
        }
        

    }

}
