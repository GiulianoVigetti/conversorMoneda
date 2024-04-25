import java.util.*;


public class Menu {
    private Scanner leer = new Scanner(System.in);
    private static Conversion conversion = new Conversion();
    private Map<Integer, String> monedas = new HashMap<>();

    String monedaDestinoCompleta = "";

    List<String> historialConversiones = new ArrayList();

    public Menu() {
        inicializarMonedas();
    }

    private void inicializarMonedas() {

        monedas.put(1, "USD - Dólar estadounidense");
        monedas.put(2, "AED - Dirham de los Emiratos Árabes Unidos");
        monedas.put(3, "AFN - Afghani afgano");
        monedas.put(4, "ALL - Lek albanés");
        monedas.put(5, "AMD - Dram armenio");
        monedas.put(6, "ANG - Florín antillano neerlandés");
        monedas.put(7, "AOA - Kwanza angoleño");
        monedas.put(8, "ARS - Peso argentino");
        monedas.put(9, "AUD - Dólar australiano");
        monedas.put(10, "AWG - Florín arubeño");
        monedas.put(11, "AZN - Manat azerí");
        monedas.put(12, "BAM - Marco convertible de Bosnia-Herzegovina");
        monedas.put(13, "BBD - Dólar de Barbados");
        monedas.put(14, "BDT - Taka bangladesí");
        monedas.put(15, "BGN - Lev búlgaro");
        monedas.put(16, "BHD - Dinar bareiní");
        monedas.put(17, "BIF - Franco burundés");
        monedas.put(18, "BMD - Dólar bermudeño");
        monedas.put(19, "BND - Dólar de Brunéi");
        monedas.put(20, "BOB - Boliviano boliviano");
        monedas.put(21, "BRL - Real brasileño");
        monedas.put(22, "BSD - Dólar bahameño");
        monedas.put(23, "BTN - Ngultrum butanés");
        monedas.put(24, "BWP - Pula botsuano");
        monedas.put(25, "BYN - Rublo bielorruso");
        monedas.put(26, "BZD - Dólar beliceño");
        monedas.put(27, "CAD - Dólar canadiense");
        monedas.put(28, "CDF - Franco congoleño");
        monedas.put(29, "CHF - Franco suizo");
        monedas.put(30, "CLP - Peso chileno");
        monedas.put(31, "CNY - Yuan chino");
        monedas.put(32, "COP - Peso colombiano");
        monedas.put(33, "CRC - Colón costarricense");
        monedas.put(34, "CUP - Peso cubano");
        monedas.put(35, "CVE - Escudo caboverdiano");
        monedas.put(36, "CZK - Corona checa");
        monedas.put(37, "DJF - Franco yibutiano");
        monedas.put(38, "DKK - Corona danesa");
        monedas.put(39, "DOP - Peso dominicano");
        monedas.put(40, "DZD - Dinar argelino");
        monedas.put(41, "EGP - Libra egipcia");
        monedas.put(42, "ERN - Nakfa eritreo");
        monedas.put(43, "ETB - Birr etíope");
        monedas.put(44, "EUR - Euro");
        monedas.put(45, "FJD - Dólar fiyiano");
        monedas.put(46, "FKP - Libra malvinense");
        monedas.put(47, "FOK - Corona feroesa");
        monedas.put(48, "GBP - Libra esterlina británica");
        monedas.put(49, "GEL - Lari georgiano");
        monedas.put(50, "GGP - Libra de Guernsey");
        monedas.put(51, "GHS - Cedi ghanés");
        monedas.put(52, "GIP - Libra de Gibraltar");
        monedas.put(53, "GMD - Dalasi gambiano");
        monedas.put(54, "GNF - Franco guineano");
        monedas.put(55, "GTQ - Quetzal guatemalteco");
        monedas.put(56, "GYD - Dólar guyanés");
        monedas.put(57, "HKD - Dólar de Hong Kong");
        monedas.put(58, "HNL - Lempira hondureño");
        monedas.put(59, "HRK - Kuna croata");
        monedas.put(60, "HTG - Gourde haitiano");
        monedas.put(61, "HUF - Forinto húngaro");
        monedas.put(62, "IDR - Rupia indonesia");
        monedas.put(63, "ILS - Shekel israelí");
        monedas.put(64, "IMP - Libra de Isla de Man");
        monedas.put(65, "INR - Rupia india");
        monedas.put(66, "IQD - Dinar iraquí");
        monedas.put(67, "IRR - Rial iraní");
        monedas.put(68, "ISK - Corona islandesa");
        monedas.put(69, "JEP - Libra de Jersey");
        monedas.put(70, "JMD - Dólar jamaicano");
        monedas.put(71, "JOD - Dinar jordano");
        monedas.put(72, "JPY - Yen japonés");
        monedas.put(73, "KES - Chelín keniano");
        monedas.put(74, "KGS - Som kirguís");
        monedas.put(75, "KHR - Riel camboyano");
        monedas.put(76, "KID - Dólar de Kiribati");
        monedas.put(77, "KMF - Franco comorense");
        monedas.put(78, "KRW - Won surcoreano");
        monedas.put(79, "KWD - Dinar kuwaití");
        monedas.put(80, "KYD - Dólar de las Islas Caimán");
        monedas.put(81, "KZT - Tenge kazajo");
        monedas.put(82, "LAK - Kip laosiano");
        monedas.put(83, "LBP - Libra libanesa");
        monedas.put(84, "LKR - Rupia de Sri Lanka");
        monedas.put(85, "LRD - Dólar liberiano");
        monedas.put(86, "LSL - Loti lesothense");
        monedas.put(87, "LYD - Dinar libio");
        monedas.put(88, "MAD - Dirham marroquí");
        monedas.put(89, "MDL - Leu moldavo");
        monedas.put(90, "MGA - Ariary malgache");
        monedas.put(91, "MKD - Dinar macedonio");
        monedas.put(92, "MMK - Kyat birmano");
        monedas.put(93, "MNT - Tugrik mongol");
        monedas.put(94, "MOP - Pataca de Macao");
        monedas.put(95, "MRU - Ouguiya mauritana");
        monedas.put(96, "MUR - Rupia de Mauricio");
        monedas.put(97, "MVR - Rufiyaa de Maldivas");
        monedas.put(98, "MWK - Kwacha malauí");
        monedas.put(99, "MXN - Peso mexicano");
        monedas.put(100, "MYR - Ringgit malasio");
        monedas.put(101, "MZN - Metical mozambiqueño");
        monedas.put(102, "NAD - Dólar de Namibia");
        monedas.put(103, "NGN - Naira nigeriano");
        monedas.put(104, "NIO - Córdoba nicaragüense");
        monedas.put(105, "NOK - Corona noruega");
        monedas.put(106, "NPR - Rupia nepalesa");
        monedas.put(107, "NZD - Dólar neozelandés");
        monedas.put(108, "OMR - Rial omaní");
        monedas.put(109, "PAB - Balboa panameño");
        monedas.put(110, "PEN - Sol peruano");
        monedas.put(111, "PGK - Kina de Papúa Nueva Guinea");
        monedas.put(112, "PHP - Peso filipino");
        monedas.put(113, "PKR - Rupia pakistaní");
        monedas.put(114, "PLN - Zloty polaco");
        monedas.put(115, "PYG - Guaraní paraguayo");
        monedas.put(116, "QAR - Riyal catarí");
        monedas.put(117, "RON - Leu rumano");
        monedas.put(118, "RSD - Dinar serbio");
        monedas.put(119, "RUB - Rublo ruso");
        monedas.put(120, "RWF - Franco ruandés");
        monedas.put(121, "SAR - Riyal saudí");
        monedas.put(122, "SBD - Dólar de las Islas Salomón");
        monedas.put(123, "SCR - Rupia de Seychelles");
        monedas.put(124, "SDG - Libra sudanesa");
        monedas.put(125, "SEK - Corona sueca");
        monedas.put(126, "SGD - Dólar de Singapur");
        monedas.put(127, "SHP - Libra de Santa Elena");
        monedas.put(128, "SLE - Leone de Sierra Leona");
        monedas.put(129, "SLL - Leone de Sierra Leona");
        monedas.put(130, "SOS - Chelín somalí");
        monedas.put(131, "SRD - Dólar surinamés");
        monedas.put(132, "SSP - Libra sursudanesa");
        monedas.put(133, "STN - Dobra de Santo Tomé y Príncipe");
        monedas.put(134, "SYP - Libra siria");
        monedas.put(135, "SZL - Lilangeni suazi");
        monedas.put(136, "THB - Baht tailandés");
        monedas.put(137, "TJS - Somoni tayiko");
        monedas.put(138, "TMT - Manat turcomano");
        monedas.put(139, "TND - Dinar tunecino");
        monedas.put(140, "TOP - Pa'anga tongano");
        monedas.put(141, "TRY - Lira turca");
        monedas.put(142, "TTD - Dólar de Trinidad y Tobago");
        monedas.put(143, "TVD - Dólar de Tuvalu");
        monedas.put(144, "TWD - Nuevo dólar taiwanés");
        monedas.put(145, "TZS - Chelín tanzano");
        monedas.put(146, "UAH - Hryvnia ucraniano");
        monedas.put(147, "UGX - Chelín ugandés");
        monedas.put(148, "UYU - Peso uruguayo");
        monedas.put(149, "UZS - Som uzbeko");
        monedas.put(150, "VES - Bolívar venezolano");
        monedas.put(151, "VND - Dong vietnamita");
        monedas.put(152, "VUV - Vatu vanuatuense");
        monedas.put(153, "WST - Tala samoano");
        monedas.put(154, "XAF - Franco CFA de África Central");
        monedas.put(155, "XCD - Dólar del Caribe Oriental");
        monedas.put(156, "XDR - Derechos especiales de giro (FMI)");
        monedas.put(157, "XOF - Franco CFA de África Occidental");
        monedas.put(158, "XPF - Franco CFP");
        monedas.put(159, "YER - Rial yemení");
        monedas.put(160, "ZAR - Rand sudafricano");
        monedas.put(161, "ZMW - Kwacha zambiano");
        monedas.put(162, "ZWL - Dólar zimbabuense");
    }

    public void mostrarMenu() {

        System.out.println("*** Bienvenido al conversor de moneda ***");

        resultado();
    }


    public void resultado() {
        System.out.println("*********************************************");
        System.out.println("Elija la moneda base:");
        System.out.println("*********************************************");
        mostrarMonedas(20);
        String monedaBase = seleccionarMonedaBase();

        System.out.println("*********************************************");
        System.out.println("Elija la moneda de destino:");
        System.out.println("*********************************************");
        mostrarMonedas(20);
        String monedaDestino = seleccionarMonedaDestino();

        System.out.println("*********************************************");
        System.out.println("Ingrese el valor a convertir:");
        System.out.println("*********************************************");
        double valor = leer.nextDouble();

        String resultado = conversion.resultadoConversion(monedaBase, monedaDestino, valor);
        System.out.println(resultado + " " + monedaDestinoCompleta);
        historialConversiones.add(resultado);

        // Mostrar historial de conversiones anteriores
        System.out.println("*********************************************");
        System.out.println("¿Desea ver el historial de conversiones? (S/N):");
        System.out.println("*********************************************");
        char verHistorial = leer.next().charAt(0);
        if(verHistorial == 'S' || verHistorial == 's') {
            System.out.println("Historial de conversiones:");
            for (String conversion : historialConversiones) {
                System.out.println(conversion);
            }
        }

        System.out.println("*********************************************");
        System.out.println("¿Desea ver registros con marca de tiempo? (S/N):");
        System.out.println("*********************************************");
        char ver = leer.next().charAt(0);
        if(ver == 'S' || ver == 's') {
            //Registros con Marca de Tiempo
            conversion.mostrarRegistrosConMarcaDeTiempo();
        }

        System.out.println("*********************************************");
        System.out.println("¿Desea continuar convirtiendo? (S/N):");
        System.out.println("*********************************************");
        char continuar = leer.next().charAt(0);
        if (continuar == 'S' || continuar == 's') {
            resultado(); // Llamada recursiva solo si se desea continuar
        } else {
            System.out.println("*********************************************");
            System.out.println("Gracias por usar utilizar el servicio. ¡Hasta luego!");
            System.out.println("*********************************************");
            leer.close(); // Cierra el Scanner al finalizar
        }
    }

    public void mostrarMonedas(int inicio) {
        int contador = inicio;
        for (Map.Entry<Integer, String> entry : monedas.entrySet()) {
            if (contador > 0) {
                System.out.println(entry.getKey() + ". " + entry.getValue());
                contador--;
            } else {
                break;
            }
        }

        // Si quedan más monedas por mostrar, se da la opción de ver más o continuar
        if (monedas.size() > inicio) {
            System.out.println("*********************************************");
            System.out.println("Presione:");
            System.out.println("'M' para ver más monedas");
            System.out.println("'C' para continuar " + "\n Y luego agregue el número correspondiente a la moneda elegida");
            System.out.println("*********************************************");
            char opcion;
            do {
                opcion = leer.next().charAt(0);
                if (opcion == 'M' || opcion == 'm') {
                    mostrarMonedas(inicio + 20); // Mostrar siguientes 20 monedas
                    return; // Salir del método después de mostrar más monedas
                } else if (opcion == 'C' || opcion == 'c') {
                    // Puedes agregar aquí alguna acción relacionada con la opción 'C'
                } else {
                    System.out.println("Opción no válida. Por favor, ingrese 'M' para ver más monedas o 'C' para continuar:");
                }
            } while (opcion != 'M' && opcion != 'm' && opcion != 'C' && opcion != 'c');
        }
    }

    public String seleccionarMonedaBase() {
        int opcionBase = leer.nextInt();
        return monedas.get(opcionBase).split(" - ")[0]; // Obtener solo el código de la moneda
    }

    public String seleccionarMonedaDestino() {
        int opcionDestino = leer.nextInt();
        monedaDestinoCompleta = monedas.get(opcionDestino).split(" - ")[1];
        return monedas.get(opcionDestino).split(" - ")[0]; // Obtener solo el código de la moneda
    }

}