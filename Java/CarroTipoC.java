import java.util.ArrayList;
import java.util.Map;

public class CarroTipoC extends Carro{

    Map<String, Map<String, Integer>> tipoCarroAceptado;
    ArrayList<String> materialAsientos;

    public CarroTipoC(Cuenta driver, String license, 
            Map<String, Map<String, Integer>> tipoCarroAceptado, ArrayList<String> materialAsientos) {
        super(driver, license);
        this.tipoCarroAceptado = tipoCarroAceptado;
        this.materialAsientos = materialAsientos;
    }
    
}