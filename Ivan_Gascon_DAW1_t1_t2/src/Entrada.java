import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa de carreras");
        boolean parar = false;
        Coche predeterminado1= new Coche("Nissan","GTR",565,4,"7777PRE");
        predeterminado1.registrarCoche(predeterminado1);
        Coche predeterminado2=new Coche("Volkswagen","Golf",245,2,"0000PRE");
        predeterminado2.registrarCoche(predeterminado2);
        do{
            System.out.println("Elige una opcion");
            System.out.println("1.Registrar 1 coche");
            System.out.println("2.Registrar 2 coches");
            System.out.println("3.Empezar una carrera, se dispone de coches ya registrados");
            System.out.println("4.Salir");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Indica la marca ");
                    String marca = scanner.next();
                    System.out.println("Indica el modelo ");
                    String modelo = scanner.next();
                    System.out.println("Indica los CV");
                    int cv = scanner.nextInt();
                    System.out.println("Indica los CC");
                    int cc = scanner.nextInt();
                    System.out.println("Indica la Matricula");
                    String matricula = scanner.next();
                    Coche coche1= new Coche(marca, modelo,cv,cc,matricula);
                    coche1.registrarCoche(coche1);
                    break;
                case 2:
                    System.out.println("Vamos a registrar el primer coche");
                    System.out.println("Indica la marca ");
                    marca = scanner.next();
                    System.out.println("Indica el modelo ");
                    modelo = scanner.next();
                    System.out.println("Indica los CV");
                    cv = scanner.nextInt();
                    System.out.println("Indica los CC");
                    cc = scanner.nextInt();
                    System.out.println("Indica la Matricula");
                    matricula = scanner.next();
                    Coche coche2= new Coche(marca, modelo,cv,cc,matricula);
                    coche2.registrarCoche(coche2);
                    System.out.println("Ahora el segundo coche");
                    System.out.println("Vamos a registrar el segundo coche");
                    System.out.println("Indica la marca ");
                    marca = scanner.next();
                    System.out.println("Indica el modelo ");
                    modelo = scanner.next();
                    System.out.println("Indica los CV");
                    cv = scanner.nextInt();
                    System.out.println("Indica los CC");
                    cc = scanner.nextInt();
                    System.out.println("Indica la Matricula");
                    matricula = scanner.next();
                    Coche coche3= new Coche(marca, modelo,cv,cc,matricula);
                    coche3.registrarCoche(coche3);
                    break;
                case 3:
                    System.out.println("Vamos a crear un carrera");
                    System.out.println("¿Cuantos kilometros tiene el circuito?");
                    int km = scanner.nextInt();
                    System.out.println("¿De cuantas vueltas es la carrera?");
                    int vueltas = scanner.nextInt();
                    System.out.println("¿Quieres ver los coches disponibles para la carrera? S/N");
                    char opt = scanner.next().charAt(0);
                    if(opt=='S' || opt=='s'){
                        Coche.mostrarLista();
                    }
                    System.out.println("Selecciona el numero del primer participante");
                    int numero = scanner.nextInt();
                    System.out.println("Selecciona el numero del segundo participante");
                    int numero2= scanner.nextInt();
                    Carrera carrera = new Carrera(Coche.listaCoches.get(numero),Coche.listaCoches.get(numero2),vueltas,km);
                    System.out.println("¿Listo para empezar la carrera?");
                    System.out.println("Pulsa enter para empezar la carrera");
                    scanner.nextLine();
                    carrera.iniciarCarrera(carrera);
                    System.out.println("GANADOR!!!");
                    carrera.getGanador().mostrarDatosCoche(carrera.getGanador());

                    break;
                case 4:
                    System.out.println("Saliendo");
                    parar=true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;







            }

        }while(!parar);
    }
}
