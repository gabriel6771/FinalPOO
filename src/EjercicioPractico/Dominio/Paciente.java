package EjercicioPractico.Dominio;

public abstract class Paciente {
    private String nombre;
    private int edad;
    private boolean necesitaCirujia;

    public Paciente(String nombre, int edad, boolean necesitaCirujia) {
        this.nombre = nombre;
        this.edad = edad;
        this.necesitaCirujia = necesitaCirujia;
    }
}
