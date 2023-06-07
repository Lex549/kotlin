fun main(){
    var i = 1;
    println("valores de i: " );
    for (i in 1..10){
        println(1);
        
    }
    println()

    println("Letras: ")
    for(i in 'a'..'g' step 2){
        println(i)
    }
    println("Letras reversas: ")
    for ( i in 'g' downTo 'a'){
        println(i)
    }

    println()
    println("Mascotas: ");
    val mascotas = arrayOf("Michi", "Tigre", "Puma", "Max", "Leo", "Tigre");
    for(mascota in mascotas){
        println(mascota)
    }

    println()
    println("Divide un estring por caracteres: ")
    for(letra in "Hola mundo"){
        println(letra)
    }
}