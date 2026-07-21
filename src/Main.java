import classes.Celular;
import classes.Computador;
import classes.Sensor;
import exceptions.SinalJaFalsoException;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.adicionarObservador(new Computador());
        sensor.adicionarObservador(new Celular());

        try {
            sensor.setSinal(true);
            sensor.setSinal(false);
        } catch(SinalJaFalsoException e){
            System.out.println(e.getMessage());
        }
    }
}