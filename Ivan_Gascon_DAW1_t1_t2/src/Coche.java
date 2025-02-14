import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Coche {
    Scanner scanner = new Scanner(System.in);
    private String marca;
    private String modelo;
    private int cv;
    private int cc;
    private String matricula;
    private int velocidad;
    private int kmRecorridos;

    public ArrayList<Coche> listaCoches = new ArrayList<>();

    public Coche() {
    }

    public Coche(String marca, String modelo, int cv,
                 int cc, String matricula, int velocidad, int kmRecorridos) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.cc = cc;
        this.matricula = matricula;
        this.velocidad = velocidad;
        this.kmRecorridos = kmRecorridos;

    }

    public Coche(String marca, String modelo, int cv, int cc, String matricula) {

        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.cc = cc;
        this.matricula = matricula;
    }
    public void registrarCoche(Coche coche){
        listaCoches.add(coche);
    }
    public void mostrarLista(){
        for (Coche coche : listaCoches){
            coche.mostrarDatosCoche(coche);
        }
    }

    public void acelerar(Coche coche , int velocidad){
        System.out.println("Introduce la velocidad de aceleracion");
        velocidad = scanner.nextInt();
        if(velocidad<10) {
            System.out.println("La velocidad de aceleracion minima es de 10km/h, se establecera a esta");
            velocidad=10;
        }
        if (coche.getCv() >= 100) {
            coche.setVelocidad(coche.getVelocidad() + (int) (Math.random() * velocidad) + 10);
            coche.setKmRecorridos(coche.getKmRecorridos() + (coche.getVelocidad() * 50 / 100));
        } else {
            coche.setVelocidad(coche.getVelocidad() + (int) (Math.random() * velocidad));
            coche.setKmRecorridos(coche.getKmRecorridos() + (coche.getVelocidad() * 50 / 100));
        }

    }
    public void mostrarDatosCoche(Coche coche){
        System.out.println("Datos del coche");
        System.out.println("Marca: "+coche.getMarca());
        System.out.println("Modelo: "+coche.getModelo());
        System.out.println("CV: "+coche.getCv());
        System.out.println("CC: "+coche.getCc());
        System.out.println("Matricula: "+coche.getMatricula());
        System.out.println("Velocidad: "+coche.getVelocidad());
        System.out.println("Kilometros Recorridos: "+coche.getKmRecorridos());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
}
