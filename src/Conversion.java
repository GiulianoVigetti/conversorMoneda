import java.util.ArrayList; // Importa la clase ArrayList para usar listas dinámicas
import java.util.List; // Importa la interfaz List para trabajar con listas

public class Conversion {

    private List<RegistroConversion> registrosConversion = new ArrayList<>();

    public String resultadoConversion(String monedaBase, String monedaDestino, double valor) {
        ConsultaApi consultaApi = new ConsultaApi();
        double tasaConversion = consultaApi.convertirMoneda(monedaBase, monedaDestino);
        double resultado = tasaConversion * valor;
        String respuesta = String.format("Tasa de conversión de %s a %s: %.2f", monedaBase, monedaDestino, resultado);

        // Registra la conversión
        RegistroConversion registro = new RegistroConversion(monedaBase, monedaDestino, valor);
        registrosConversion.add(registro);

        return respuesta;
    }

    public void mostrarRegistrosConMarcaDeTiempo() {

        System.out.println("Registros de conversiones con marca de tiempo:");
        for (RegistroConversion registro : registrosConversion) {
            System.out.println(registro.getTimestamp() + " | " + registro.getMonedaBase() + " -> " +
                    registro.getMonedaDestino() + " | Valor: " + registro.getValorConvertido());
        }
    }
}