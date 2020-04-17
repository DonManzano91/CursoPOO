
public class CarroTipoA extends Carro{

    String marca;
    String modelo;

    public CarroTipoA(Cuenta driver, String license, String marca, String modelo) {
        super(driver, license);
        this.marca = marca;
        this.modelo = marca;
    }
    
}