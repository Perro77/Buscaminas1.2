import java.util.Scanner;

public class Tablero {
    private Posicio[][] posicion;
    private int filas;
    private int columnas;
    Scanner entrada = new Scanner(System.in);

    public Tablero(){
        System.out.println("Cuantas filas? ");
        this.filas = entrada.nextInt();
        System.out.println("Cuntas columnas? ");
        this.columnas = entrada.nextInt();
        posicion = new Posicio[filas][columnas];
    }
    public Posicio[][] tablero(){
        for(int i=0; i< posicion.length; i++){
            for(int k=0;posicion[i].length; k++){
                System.out.println(posicion[i][k]);
            }
        }
        return posicion;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
}
