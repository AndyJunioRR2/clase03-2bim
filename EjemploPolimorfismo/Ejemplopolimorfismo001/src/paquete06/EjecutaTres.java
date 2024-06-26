package paquete06;
public class EjecutaTres {
    public static void main(String[] args) {
        String nombre = "Andy";
        String apellido = "Veintimilla";
        EstudianteDistancia e = new EstudianteDistancia(nombre, apellido,5,150);
        e.establecerIdentificacionEstudiante("10101010");
        e.establecerEdadEstudiante(20);
        e.calcularMatricula();
        System.out.printf("%s\n",e);
    }
}
