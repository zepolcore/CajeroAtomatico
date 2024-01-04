public class CuentaBancaria {
    String titular;
    TipoDeCuenta tipoDeCuenta;
    double saldo;

    public static final String TIPO_AHORRO = "ahorro";
    public static final String TIPO_NOMINA = "nomina";

    final double COMISION = 1.2;

    //constructor principal, es la base de los demas, asi que si lo modifico, modifico los demas
    CuentaBancaria(String titular, TipoDeCuenta tipo, double saldo) {
        this.titular = titular;
        this.tipoDeCuenta = tipo;
        this.saldo = saldo;
    }
    CuentaBancaria(){
        //llamo al constructor principal como base
        this("",TipoDeCuenta.AHORRO, 0);
    }
    CuentaBancaria(String titular, double saldo){
        //llamo al constructor principal como base
        this(titular,TipoDeCuenta.AHORRO, saldo);
    }

    void sacarDinero(double cantidad){
        if(cantidad<0){
            return;
        }
        double comision = 0.0;
        if(tipoDeCuenta.equals(TIPO_AHORRO)){
            comision = COMISION;
        }
        saldo -= cantidad;
    }
    void ingresarDinero(double cantidad){
        if(cantidad<0){
            return;
        }
        saldo += cantidad;
    }
    double obtenerSaldo(){
        return saldo;
    }
    void cambiarTipoDeCueta(TipoDeCuenta nuevoTipo){
        tipoDeCuenta = nuevoTipo;
    }
    double calcularComision(){
            switch (tipoDeCuenta) {
                case AHORRO:
                    return COMISION;
                case NOMINA:
                    return 0;
                default:
                    return 0;
            }
    }
}

