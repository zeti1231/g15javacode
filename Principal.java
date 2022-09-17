import java.util.Scanner;

/**

*

* @author desaextremo

*/

public class Principal {

public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);

System.out.print("Ingrese un numero para generara su tabla de multiplicar:\n");

int tabla = entrada.nextInt();

System.out.println("Tabla de multiplicar del nro " + tabla);

for (int i = 1; i <= 10; i++) {

System.out.println(i + " X " + tabla + " = " + (i * tabla));

}

}

}