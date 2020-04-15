

class Main{

    public static void main(String[] args) {
        System.out.println("Bienvenido al curso de POO de platzi, JAVA version");
        Carro carro = new Carro(new Cuenta("Alejandro Manzano", "mala910321"), "QWE!5243");
        carro.id = 1;
        carro.pasajero = 5;
        carro.toString();
        System.out.println("Los datos del primer carro son: " + carro.toString());

    }

    

}