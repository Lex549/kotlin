   //Reto:
    //Crear un directorio español - ingles usando un mapa
    //1-Funcion para crear o cargar el directorio
    //2- Funcion para conaultar, resiba una palabra en español 
    // y regrese su traduccion, sino existe, traduccion, un valor por default
    //3- impirmir todo el directorio 

    import java.util.*

fun main() {
    val directorio = crearDirectorio()
    consultarPalabra(directorio)
    imprimirDirectorio(directorio)
}

fun crearDirectorio(): Map<String, String> {
    return mapOf(
        "hola" to "hello",
        "adiós" to "goodbye",
        "buenos días" to "good morning",
        "gracias" to "thank you",
        "por favor" to "please"
    )
}

fun consultarPalabra(directorio: Map<String, String>) {
    val scanner = Scanner(System.`in`)

    print("Ingresa una palabra en Español: ")
    val palabra = scanner.nextLine()

    val traduccion = directorio[palabra]
    if (traduccion != null) {
        println("La traducción de \"$palabra\" es \"$traduccion\".")
    } else {
        println("No se encontró una traducción para \"$palabra\".")
    }
}

fun imprimirDirectorio(directorio: Map<String, String>) {
    println("Directorio Español-Inglés:")
    directorio.forEach { (espanol, ingles) ->
        println("$espanol - $ingles")
    }
}
