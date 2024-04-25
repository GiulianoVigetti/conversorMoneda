import com.google.gson.Gson; // Importamos la clase Gson para convertir JSON a objetos Java
import java.net.URI; // Importamos la clase URI para trabajar con direcciones URL
import java.net.http.HttpClient; // Importamos la clase HttpClient para realizar solicitudes HTTP
import java.net.http.HttpRequest; // Importamos la clase HttpRequest para construir solicitudes HTTP
import java.net.http.HttpResponse; // Importamos la clase HttpResponse para manejar respuestas HTTP
import java.util.Map; // Importamos la interfaz Map para trabajar con estructuras de datos de tipo clave-valor

public class ConsultaApi {

    // Método para convertir una cantidad de una moneda a otra
    public double convertirMoneda(String monedaBase, String monedaDestino) {

        // Construimos la URL de la API utilizando la moneda base proporcionada
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/efb191243d4a1ada5d48730e/latest/" + monedaBase);

        // Creamos una instancia de HttpClient para realizar la solicitud HTTP
        HttpClient client = HttpClient.newHttpClient();

        // Construimos la solicitud GET utilizando la URL creada
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            // Enviamos la solicitud y obtenemos la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Convertimos la respuesta JSON en un objeto Moneda utilizando Gson
            Moneda moneda = new Gson().fromJson(response.body(), Moneda.class);

            // Obtenemos las tasas de conversión de la respuesta
            Map<String, Double> conversionRates = moneda.getConversion_rates();

            // Obtenemos la tasa de conversión específica para la moneda de destino
            Double tasaConversion = conversionRates.get(monedaDestino);

            // Verificamos si la tasa de conversión para la moneda de destino existe
            if (tasaConversion != null) {
                return tasaConversion; // Devolvemos la tasa de conversión
            } else {
                throw new RuntimeException("Tasa de conversión no encontrada para la moneda de destino");
            }
        } catch (Exception e) {
            // Capturamos y relanzamos cualquier excepción que ocurra durante el proceso
            throw new RuntimeException("Error al obtener la tasa de conversión");
        }
    }
}
