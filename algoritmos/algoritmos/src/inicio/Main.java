package inicio;

import java.util.Scanner;
import java.util.Random;
import logica.Burbuja;
import logica.InsertionSort;
import logica.MergeSort;

public class Main {
		
	public static void main(String[] args) {
		
		Scanner scanner;
        int opcion;
        int[] numerosAleatorios;
        
        scanner = new Scanner(System.in);
        numerosAleatorios = new int[10];
        
        do {
            System.out.println("==== MENÚ PRINCIPAL ====");
            System.out.println("1. Burbuja ");
            System.out.println("2. Insert Sort");
            System.out.println("3. Merge Sort");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                	try 
                	{
                		Burbuja burbuja;
                		
                		burbuja = new Burbuja();
                		
                		burbuja.burbuja(numeros(numerosAleatorios));
					}
                	catch (Exception e) {
						e.printStackTrace();
					}
                    break;
                case 2:
                	try 
                	{
                		InsertionSort insertS;
                		
                		insertS = new InsertionSort();
                		
                		insertS.insertionSort(numeros(numerosAleatorios));
					}
                	catch (Exception e) {
						e.printStackTrace();
					}
                    break;
                case 3:
                	try 
                	{
                		MergeSort mergeS;
                		
                		mergeS = new MergeSort();
                		
                		mergeS.mergeSort(numeros(numerosAleatorios));
					}
                	catch (Exception e) {
						e.printStackTrace();
					}
                    break;
                case 4:
                	 System.exit(0);
                	 System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
	
	public static int[] numeros(int[] numerosAleatorios)
	{
		Random random;
        random = new Random();
        
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(10); 
        }
        
        System.out.println("Números aleatorios generados");
        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.printf("%4d", numerosAleatorios[i]); 
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        
        return  numerosAleatorios;
	}
	
	}
	
