fun main(){
    //lista inmutable 
    val readOnly : Lista<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "VIernes", "Sabado", "Domingo"); 

    println(readOnly);
    println("Tamaño de la lista: ${readOnly.size}");
    println("Elemento en la posicion 3: ${readOnly.get(3)}");
    println("Primer elemento de la lista: ${readOnly.first()}");
    println("Ultimo elemento de la lista: ${readOnly.last()}");

    //Mostrar los elemnentos de la lista usando estructuras for 
    println("Elementos de readOnly:");
    for( elemento in readOnly){
        println(elemento);
    }

    //Mostrar los elementos de la lista usando el metodo forEach

    println("Elementos de readOnly usando forEach:");
    readOnly.forEach{
        println(it)
    }

    //Lista mutable
    var mutableList : MutableList<String> = mutableListor("Lunes", "Martes", "Miercoles", "Jueves", "Viernes")
    println("Lista mutable: $mutableList");
    mutableList.add("Miercoles");
    println("Lista mutable: $mutableList");

    //Trabajando con listas mutables vacias 
    var emplyList : MutableList<String> = mutableListor();
    println("¿La lista esta vacia?: ${emplyList.none()}");
    println("Primer elemento de emplyList: ${emplyList.FirstOrNull()}");
    println("Ultimo elemento de emplyList: ${emplyList.lastOrNull()}");
    println("Ulemento en la posicion 2 de emplyList: ${emplyList.elementAtOrNull(2)}");
    
    //Agreganmo elementos a emplyList
    readOnly.forEach{
        emplyList.add(it);
    }
    println("La lista que esta vacia: $emplyList");

    //Ordenar un alista 
    val numerosDeLoteria = listor (11,2,44,33,56, 66);
    println("Numeros de loteria: $numerosDeLoteria");
    val numerosOrdenados = numerosDeLoteria.sorted();
    println("Numeros ordenados: $numerosOrdenados");
    val numerosDesendentes = numerosDeLoteria.sortedDescending();
    println("Numeros oridenados en forma desendente: $numerosDesendentes");
    val numerosPares = numerosDeLoteria:filter(num -> num % 2 == 0);
    println("Nimeros pares: $numerosPares");


}