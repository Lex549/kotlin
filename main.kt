fun main() {
// esto es un valor inmutable
    val veces = 35;
    val border = "+";


    printBorder(3,1);
    println("Hola mundo Kotlin");
    printBorder( 5, 4);
    println();
    println("En este programa el caracter de border es: ${border}");
    println("Y se imprime ${veces} veces");
}

fun printBorder(numero: Int, border: Int ){
    when (border) {
        1 -> {
            repeat(numero) {
                print("+");
            }
        }
        2 -> {
            repeat(numero) {
                print("=");
            }
        }
        3 -> {
            repeat(numero) {
                print("-");
            }
        }
        else -> {
            repeat (numero) {
                print(" 2 ");
            }
        }
    }
    println()
}

// fun printBorder(numero: Int, border: String = "="){
//     repeat(numero){
//         print(border);
//     }
//     println();
// }