import java.util.Scanner;

public class Carrera {
    private Coche coche1;//duda
    private Coche coche2;//duda
    private Coche ganador;
    private int kmTotales;
    private int numVueltas;

    public Carrera() {
    }
    public Carrera(Coche coche1, Coche coche2, Coche ganador, int numVueltas, int kmTotales) {
        this.coche1 = coche1;
        this.coche2 = coche2;
        this.ganador = ganador;
        this.numVueltas = numVueltas;
        this.kmTotales = kmTotales;
    }

    public Carrera(Coche coche1, Coche coche2, int kmTotales, int numVueltas) {
        this.coche1 = coche1;
        this.coche2 = coche2;
        this.kmTotales = kmTotales;
        this.numVueltas = numVueltas;
    }

    public void iniciarCarrera(Carrera carrera){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Participantes");
        coche1.mostrarDatosCoche(coche1);
        System.out.print("\t\t");
        coche2.mostrarDatosCoche(coche2);
        System.out.print("\t");
        mostrarDatosCarrera(carrera);
        System.out.print("\t");
        System.out.println("Preparen motores");
        for (int i = 0; i < carrera.getNumVueltas(); i++) {
            System.out.println("¿ "+coche1.getModelo()+" cuanto quieres acelerar?");
            int velocidadAcelerar = scanner.nextInt();
            coche1.acelerar(coche1,velocidadAcelerar);
            System.out.println("¿ "+coche2.getModelo()+" cuanto quieres acelerar?");
            velocidadAcelerar = scanner.nextInt();
            coche2.acelerar(coche2,velocidadAcelerar);
        }
        if(carrera.kmTotales* carrera.numVueltas==coche1.getKmRecorridos() || carrera.kmTotales* carrera.numVueltas==coche2.getKmRecorridos() )
        {
            if(carrera.kmTotales* carrera.numVueltas==coche1.getKmRecorridos()){
                carrera.setGanador(coche1);
            }else{
                carrera.setGanador(coche2);
            }
        }else{
            while(carrera.kmTotales* carrera.numVueltas!=coche1.getKmRecorridos() || carrera.kmTotales* carrera.numVueltas!=coche2.getKmRecorridos() )
            {
                System.out.println("¿ "+coche1.getModelo()+" cuanto quieres acelerar?");
                int velocidadAcelerar = scanner.nextInt();
                coche1.acelerar(coche1,velocidadAcelerar);
                System.out.println("¿ "+coche2.getModelo()+" cuanto quieres acelerar?");
                velocidadAcelerar = scanner.nextInt();
                coche2.acelerar(coche2,velocidadAcelerar);
            }
            if(carrera.kmTotales* carrera.numVueltas==coche1.getKmRecorridos()){
                carrera.setGanador(coche1);
            }else{
                carrera.setGanador(coche2);
            }

        }


    }
    public void mostrarDatosCarrera(Carrera carrera){
        System.out.println(carrera.kmTotales);
        System.out.println(carrera.numVueltas);
    }


    public Coche getCoche1() {
        return coche1;
    }

    public void setCoche1(Coche coche1) {
        this.coche1 = coche1;
    }

    public Coche getCoche2() {
        return coche2;
    }

    public void setCoche2(Coche coche2) {
        this.coche2 = coche2;
    }

    public Coche getGanador() {
        return ganador;
    }

    public void setGanador(Coche ganador) {
        this.ganador = ganador;
    }

    public int getKmTotales() {
        return kmTotales;
    }

    public void setKmTotales(int kmTotales) {
        this.kmTotales = kmTotales;
    }

    public int getNumVueltas() {
        return numVueltas;
    }

    public void setNumVueltas(int numVueltas) {
        this.numVueltas = numVueltas;
    }
}
