import java.util.Scanner;

public class edades_estudiantes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] numero = new float[10];
        double media_estudiantes=0;
        double prom_estudiantes = 0;
        double conteo_cincos=0;
        double alumnos = 0, edad = 0, edad2 = 0;

        System.out.printf("bienvenido al programa de el colegio");
        System.out.printf("¿cuales son las edades de cuantos alumnos desea digitar?");
        alumnos = entrada.nextDouble();
        for (int i = 0; i < alumnos; i++) {
            System.out.printf("cual es la edad del alumno");
            edad = entrada.nextDouble();

            if (edad>5){

                edad = edad + edad2;
                edad2 = edad;
                prom_estudiantes = edad / alumnos;}
                System.out.printf("el promedio de la edad de los alumnos es " + prom_estudiantes);
            if (edad<5){
                media_estudiantes=edad/i;}
                System.out.printf("la media de los estudiantes es "+media_estudiantes);

           if (edad==5) {
               conteo_cincos++;}
               System.out.printf("el numero de 5 es " + conteo_cincos);


            }


        }
    }




