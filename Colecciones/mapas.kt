fun main(){
    val ladas: Map<Int, String> = mapOf(
        1 to "USA",
        34 to "España",
        52 to "Mexico",
        67 to "Colombia",
        70 to "Argentina"
    )    
    println(ladas)
    println(ladas[1])
    println()

    ladas.forEach(action = {(key, value) -> println("La clave lada de $value es $key")})
    println()

    println("La lada de Colombia es ${ladas.filter { it.value == "Colombia" }.keys}")
    println()

    println("Tamaño: ${ladas.size}")
    println()

    println("Claves: ${ladas.keys}")
    println("Valores: ${ladas.values}")
    println("Entradas: ${ladas.entries}")
    println("Valor de lada 48: ${ladas.getOrDerefault(48, "Pais desconocido")}");

    //Comprobar si el mapa esta vacio
    println("Mapa vacio: ${ladas.isEmpty()}");

    //Comprobar si existe una clave especifica en el mapa
    println("Existe la clave lada 86: ${86 in ladas}");

    //Comprobar si existe el valor en el mapa
    println("Existe el valor Mexico en el mapa: ${"Mexico" in ladas.values}");

    //Mapa mutable
    var nums = mutableMapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3
        "four" to 4
    );
    println("Mapa de numeros: $nums");

    // Eliminar valores del mapa 
    nums.remove("two");
    // Agregado por el mapa
    nums["six"] = 6;
    println("Mapa nuevo de numeros: $nums");

    var sortedNums = nums.toSortedMap();
    println("Mapa ordenado: $sortedNums");


}