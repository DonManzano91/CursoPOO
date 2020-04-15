class Carro{
    Integer id;
    String license;
    Cuenta driver;
    Integer pasajero;

    /*Edición o generación de un nuevo constructor*/
    public Carro(Cuenta driver, String license) {
        this.driver = driver;
        this.license = license;
    } 
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nid: " + id + 
        "\nlicense: " + license + 
        "\ndriver: " + driver + 
        "\npasajero: " + pasajero;
    }
}
