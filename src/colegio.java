import javax.swing.*;
import java.util.Scanner;

public class colegio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float edad[]=new float[0];
float prom_estudiantes=0, media_menores=0;
int estudiantes_cinco = 0;
//arreglo\\
        for (int contador=0;contador>0;contador++){
            System.out.printf((contador+1)+"por favor digite una edad");
            edad[contador]= entrada.nextFloat();

        if (edad[contador]<5) {
            media_menores +=edad[contador];
            System.out.printf("la media de estudiantes menores de 5 años es  "+media_menores);
        } else if (edad[contador]>5) {
            prom_estudiantes*=edad[contador];
            prom_estudiantes=prom_estudiantes/contador;
            contador++;
            System.out.printf("el promedio de estudiantes mayores de 5 años es "+ prom_estudiantes);
        }
else {
    estudiantes_cinco++;
            System.out.printf("la cantidad de estudiantes con 5 años es  "+contador);

        }
        }

    }
}
