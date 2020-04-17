import java.util.Date;

public class TarjetaBancaria extends Pago{

    Integer tipoTarjeta;
    Integer numTarjeta;
    Integer ccv;
    Date    expiacion;

    public TarjetaBancaria(Integer id, Integer numTarjeta, Integer ccv, Date expiacion,
                Integer tipoTarjeta) {
        super(id);
        this.tipoTarjeta = tipoTarjeta;
        this.numTarjeta = numTarjeta;
        this.ccv = ccv;
        this.expiacion = expiacion;s

    }
    

}