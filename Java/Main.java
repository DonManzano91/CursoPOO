

class Main{

    public static void main(String[] args) {
        System.out.println("Bienvenido al curso de POO de platzi, JAVA version");
        Carro carro = new Carro();
        carro.id = 1;
        carro.driver = "Alex Manzano";
        carro.license = "QWE!5243";
        carro.pasajero = 5;
        carro.toString();
        System.out.println("Los datos del primer carro son: " + carro.toString());

    }

    

}