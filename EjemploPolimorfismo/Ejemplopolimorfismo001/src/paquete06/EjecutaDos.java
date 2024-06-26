package paquete06;
public class EjecutaDos {
    public static void main(String[] args) {
        String nombre = "Andy";
        String apellido = "Veintimilla";
        EstudianteDistancia e = new EstudianteDistancia(nombre, apellido);
        e.establecerIdentificacionEstudiante("10101010");
        e.establecerEdadEstudiante(20);
        e.establecerNumeroAsginaturas(10);
        e.establecerCostoAsignatura(100);
        e.calcularMatricula();
        System.out.printf("%s\n",e);
    }
}
