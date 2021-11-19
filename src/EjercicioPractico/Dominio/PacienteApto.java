package EjercicioPractico.Dominio;

public class PacienteApto extends Paciente implements Operable{

    public PacienteApto(String nombre, int edad, boolean necesitaCirujia) {
        super(nombre, edad, necesitaCirujia);
    }

    @Override
    public void operar() {

    }
}
