package Registro;

import Servicios.Servicios;
import Clientes.Cliente;
import Mascotas.Gato;
import Mascotas.Perro;
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1234, "Juan", "Carrera 12 #50-12");
        Cliente cliente2 = new Cliente(4321, "Carlos", "Calle 21 #5 - 21");

        Gato gato1 = new Gato("Misu", 1, 0);
        Gato gato2 = new Gato("Felix", 2, 0);
        Perro perro1 = new Perro("Max", 2, 0);
        Perro perro2 = new Perro("Rocky", 4, 0);

        Servicios servicio1 = new Servicios(1, "Baño", 20000);
        Servicios servicio2 = new Servicios(2, "Vacunación", 50000);
        Servicios servicio3 = new Servicios(3, "Guardería", 100000);
        Servicios servicio4 = new Servicios(4, "Atención domiciliaria", 40000);

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("---Bienvenido a nuestra veterinaria---");
            System.out.print("Ingrese su número de identificación: ");
            int numeroDeIngreso = scanner.nextInt();

            if (numeroDeIngreso == cliente1.getIdentificacion() || numeroDeIngreso == cliente2.getIdentificacion()) {
                Cliente cliente = (numeroDeIngreso == cliente1.getIdentificacion()) ? cliente1 : cliente2;
                Gato gato = (cliente == cliente1) ? gato1 : gato2;
                Perro perro = (cliente == cliente1) ? perro1 : perro2;

                System.out.println("Bienvenido, " + cliente.getNombre() + "!");
                System.out.println("Mascotas registradas: ");
                System.out.println("GATO: " + gato.getNombre() + ", Edad: " + gato.getEdad() + " Año(s)");
                System.out.println("PERRO: " + perro.getNombre() + ", Edad: " + perro.getEdad() + " Año(s)");
                int opcion;
                int contadorAtencionDomiciliaria = 0;
                do {
                    System.out.println("---Seleccione una opción---");
                    System.out.println("1. Servicio para el gato");
                    System.out.println("2. Servicio para el perro");
                    System.out.println("3. Salir");
                    System.out.println("4. Cerrar sesion y cambiar de usuario");
                    System.out.print("Opción: ");
                    opcion = scanner.nextInt();
                    

                    if (opcion == 1 || opcion == 2) {
                        System.out.println("---Seleccione un servicio---");
                        System.out.println("1. Baño - $20,000");
                        System.out.println("2. Vacunación - $50,000");
                        System.out.println((opcion == 2) ? "3. Guardería - $100,000" : "3. Atención domiciliaria - $40,000");
                        System.out.println("4. Volver");
                        System.out.print("Opción: ");
                        int opcionServicio = scanner.nextInt();

                        if (opcionServicio == 3 && opcion == 1 ) {
                            contadorAtencionDomiciliaria++;
                        }

                        if (opcionServicio >= 1 && opcionServicio <= 3) {
                            Servicios servicio = (opcionServicio == 1) ? servicio1 : (opcionServicio == 2) ? servicio2 : (opcion == 1) ? servicio4 : servicio3;
                            System.out.println("------ FACTURA ------");
                            System.out.println("Cliente: " + cliente.getNombre());
                            System.out.println("Mascota: " + ((opcion == 1) ? gato.getNombre() : perro.getNombre()) + " Edad: " + ((opcion == 1) ? gato.getEdad() : perro.getEdad()) + " Año(s)");
                            System.out.println("Servicio: " + servicio.nombreServicio());
                            if (contadorAtencionDomiciliaria == 3) {
                                System.out.println("Total a pagar = 0 ");
                                System.out.println("Por aplicar 3 veces el servicio de atencion domiciliaria no se le cobrara" );
                                contadorAtencionDomiciliaria = 0;
                                
                            }else{
                                System.out.println("Total a pagar es: " + servicio.costoServicio());
                            }
                            
                        }
                    }
                    
                } while (opcion != 3 && opcion != 4);
                if (opcion == 3) continuar = false;
            } else {
                System.out.println("Identificación incorrecta");
                System.out.println("Intente de nuevo");
            }
        }
        scanner.close();
    }

}
