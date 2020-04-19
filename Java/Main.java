

class Main{

    public static void main(String[] args) {
        System.out.println("Bienvenido al curso de POO de platzi, JAVA version");
        Carro carro = new Carro(new Cuenta("Alejandro Manzano", "mala910321", "e@g.com"), "QWE!5243");
        carro.id = 1;
        carro.setPasajero(4);
        System.out.println("Los datos del primer carro son: " + carro.toString());

    }

    

}