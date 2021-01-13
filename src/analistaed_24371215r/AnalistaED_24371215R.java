package analistaed_24371215r;

public class AnalistaED_24371215R {

    static final double FACTOR_HORA_EXTRA = 1.2;
    private final String nombreCompleto;
    private final String dni;
    private final double salarioBasePorHora = 10.56;

    public AnalistaED_24371215R(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora
                * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }

    // Este método no lo comentaremos con JavaDoc
    public static void main(String[] args) {
        AnalistaED_24371215R emp = new AnalistaED_24371215R("ESTHER JURADO",
                "24371215R");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes sera de "
                + emp.getSalarioEsteMes(horasExtra)
                + " euros, al hacer " + horasExtra + " horas extra.");
    }
}
