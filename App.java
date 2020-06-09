import java.util.Scanner;
public class App {
    static Scanner input = new Scanner(System.in);
    public static void ejercicio01() {
        int salario = 1500;
        for (int i = 1; i <= 6; i++) {
            salario += salario*0.10;
            System.out.println("El salario al cabo de "+ i +" aÃ±o es: "+ salario);
        }
    }
    public static void ejercicio02() {
        int n, valor, contador = 0, contador2 = 0, contador3 = 0;
        System.out.println("Ingresar la cantidad de nÃºmeros: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingresa el nÃºmero: ");
            valor = input.nextInt();
            if (valor == 0) {
                contador++;
            }
            if (valor > 0) {
                contador2++;
            }
            if (valor < 0) {
                contador3++;
            }
        }
        System.out.println("Los ceros son: "+ contador);
        System.out.println("Mayores a cero son: "+ contador2);
        System.out.println("Menores a cero: "+ contador3);
    }
    public static void ejercicio03() {
        int n, valor, i = 1, rojo = 0, blanco = 0, verde = 0;
        System.out.println("Ingresar la cantidad de focos: ");
        n = input.nextInt();
        while (i <= n) {
            System.out.println("Ingresa el color de los focos: \n" +
                    "   1 = rojo \n" +
                    "   2 = blanco \n" +
                    "   3 = verde");
            valor = input.nextInt();
            if (valor == 1) {
                rojo++;
            }
            if (valor == 2) {
                blanco++;
            }
            if (valor == 3) {
                verde++;
            }
            i++;
        }
        System.out.println("focos de color rojo: "+ rojo);
        System.out.println("focos de color blanco: "+ blanco);
        System.out.println("focos de color verde: "+ verde);
    }
    public static void ejercicio04() {
        long ahorro = 1;
        for (int i = 1; i <= 365; i++) {
            ahorro*=3;
        }
        System.out.println("El total es: "+ ahorro);
    }
    public static void ejercicio05() {
        int n, arti; double totalr = 0; double total_1, total = 0;
        System.out.println("Ingrese el nÃºmero de artÃ­culos: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("El costo del "+i+" artÃ­culo: ");
            arti = input.nextInt();
            if (arti >= 200) {
                total_1 = arti * 0.15;
                totalr = arti - total_1;
            }
            if (arti > 100 && arti < 200) {
                total_1 = arti * 0.12;
                totalr = arti - total_1;
            }
            if (arti <= 100) {
                total_1 = arti * 0.10;
                totalr = arti - total_1;
            }
            total += totalr;
            System.out.println("El monto a pagar es: "+ totalr);
        }
        System.out.println("El total a pagar es de: "+ total);
    }
    public static void ejercicio06() {
        int num, valor, total;
        System.out.println("Ingresa la cantidad de nÃºmeros: ");
        valor = input.nextInt();
        for (int i = 1; i <= valor; i++) {
            System.out.println("Ingresa el "+i+" nÃºmero: ");
            num = input.nextInt();
            total = (int)Math.pow(num, 3);
            System.out.println("El cubo es: "+ total);
        }
    }
    public static void ejercicio07() {
        int num, total;
        System.out.println("Digite el nÃºmero para la tabla correspondiente: ");
        num = input.nextInt();
        for (int i = 1; i <= 12; i++ ) {
            total = num*i;
            System.out.println(num + " x " + i + " = "+total);
        }
    }
    public static void ejercicio08() {
        int n, valor, nota, aprobado = 0, reprobado = 0;
        System.out.print("Ingrese el nÃºmero de alumnos: ");
        n = input.nextInt();
        System.out.print("Ingrese la nota aprobatoria: ");
        valor = input.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.print("Ingrese la nota del alumno "+i+": ");
            nota = input.nextInt();
            if (valor <= nota) {
                aprobado++;
            }
            else {
                reprobado++;
            }
        }
        System.out.println("El nÃºmero de aprobados es: "+ aprobado);
        System.out.println("El nÃºmero de reprobados es: "+ reprobado);
    }
    public static void ejercicio09() {
        double x, años, total = 0;
        System.out.println("Ingresa la cantidad de aÃ±os: ");
        años = input.nextDouble();
        for (int a = 1; a <= años; a++){
            System.out.println(a + " AÃ±o");
            for (int i = 1; i <= 12; i++) {
                System.out.println("Ingresar la cantidad del " + i + " mes depositada: ");
                x = input.nextDouble();
                total += x;
                System.out.println("La inversiÃ³n del mes " + i + " es: " + total);
            }
            total += total * 0.10;
            System.out.println("El total del "+a+" aÃ±os es: "+ total);
            total -= total;
        }
    }
    public static void ejercicio10() {
        int aulas, estudia, edad, total = 0,total_final = 0, promedio = 0, promedio_total = 0;
        System.out.print("Ingresa la cantidad de aulas: ");
        aulas = input.nextInt();
        for (int i = 1; i <= aulas; i++) {
            System.out.println("Aula "+i);
            System.out.print("Ingresa la cantidad de estudiantes: ");
            estudia = input.nextInt();
            for (int e = 1; e <= estudia; e++) {
                System.out.print("Ingresa la edad del "+e+" estudiante: ");
                edad = input.nextInt();
                total += edad;
                promedio = total / estudia;
            }
            System.out.println("El promedio del aula "+i+" es: "+ promedio);
            total_final += promedio;
            promedio_total = total_final/aulas;
        }
        System.out.println("El promedio total de todas las aulas es: "+promedio_total);
    }
    public static void ejercicio11() {
        int numero;
        int numero2;
        int total = 0;
        System.out.println("Ingresa un número: ");
        numero = input.nextInt();
        System.out.println("Ingresa otro numero: ");
        numero2 = input.nextInt();
        total = numero + numero2;
        System.out.println("El resultado es: "+ total);
    }
    public static void main(final String[] args) {
        System.out.println("Probar Algoritmos: ");
        String opcion;
        int numero;
        do {
            System.out.println("Ingrese el Algoritmo que desea probar: ");
            numero = input.nextInt();
            switch (numero) {
                case 1:ejercicio01();
                    break;
                case 2:ejercicio02();
                    break;
                case 3:ejercicio03();
                    break;
                case 4:ejercicio04();
                    break;
                case 5:ejercicio05();
                    break;
                case 6:ejercicio06();
                    break;
                case 7:ejercicio07();
                    break;
                case 8:ejercicio08();
                    break;
                case 9:ejercicio09();
                    break;
                case 10:ejercicio10();
                    break;
                case 11:ejercicio11();
                    break;
                default:
                    System.out.println("El valor que ingresó es incorrecto");
                    break;
            }
            System.out.println("Desea probar mas algoritmos? SI/NO");
            opcion = input.next();
        }while(opcion.equals("SI")|| opcion.equals("si"));
    }
}