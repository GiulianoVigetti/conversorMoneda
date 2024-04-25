import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroConversion {

    private String monedaBase;
    private String monedaDestino;
    private double valorConvertido;
    private LocalDateTime timestamp;

    public RegistroConversion(String monedaBase, String monedaDestino, double valorConvertido) {
        this.monedaBase = monedaBase;
        this.monedaDestino = monedaDestino;
        this.valorConvertido = valorConvertido;
        this.timestamp = LocalDateTime.now(); // Captura la marca de tiempo actual al crear el registro
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTimestamp = timestamp.format(formatter);
        return formattedTimestamp + " | " + monedaBase + " -> " + monedaDestino + " | Valor: " + valorConvertido;
    }
}