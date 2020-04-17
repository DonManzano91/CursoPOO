
public class Conductor extends Cuenta{

        String idConductor;
        Integer cuentaDeposito;

    public Conductor(String name, String document, String email, String idConductor, Integer cuentaDeposito) {
        super(name, document, email);
        this.idConductor = idConductor;
        this.cuentaDeposito = cuentaDeposito;
        // TODO Auto-generated constructor stub
    }



}