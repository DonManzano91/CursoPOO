class Carro{
    Integer id;
    String license;
    Cuenta driver;
    private Integer pasajero;

    /*Edición o generación de un nuevo constructor*/
    public Carro(Cuenta driver, String license) {
        this.driver = driver;
        this.license = license;
        pasajero = 3;
        System.out.println("Pasajeros en el auto: " + pasajero);
    } 
    
    /**
     * @return the pasajero to get
     */
    public Integer getPasajero() {
        return pasajero;
    }

    /**
     * @param pasajero the pasajero to set
     */
    public void setPasajero(Integer pasajero) {
        if (pasajero == 4) {
            this.pasajero = pasajero;    
        } else{
            this.pasajero = null;
            System.out.println("No se puede asignar ese valor");
        }
        
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
