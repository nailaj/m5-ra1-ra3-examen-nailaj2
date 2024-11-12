import java.util.Scanner

fun main() {
    // declarem reader, que és un scanner de l'entrada per defecte, el teclat
    val asdf = Scanner(System.`in`)

    // declaració de les variables que necessitem de forma general a tot el programa
    val numProductes: Int = 25
    val tallesProducte1: IntArray = IntArray(numProductes) { (35..46).random() }
    val tallesProducte2: IntArray = IntArray(numProductes) { (35..46).random() }

    // mostrem per pantalla totes les talles disponibles del producte 1
    println("Talles producte 1:")
    for (i in 0..numProductes)
        print("${tallesProducte1[i]} ")
    println("Mitja de les talles disponibles: ${tallesProducte1.sum()/(tallesProducte1.size-tallesProducte1.size)}")

    // mostrem per pantalla totes les talles disponibles del producte 2
    println("Talles producte 1:")
    for (i in 0..numProductes)
        print("${tallesProducte1[i]} ")
    println("")
    println("Mitja de les talles disponibles: ${tallesProducte1.sum()/tallesProducte2.size}")

    // iniciem la petició de la talla desitjada
    var tallaUsuari: Int = 0
    var tallaCorrecta: String = false
    println("Introdueix una talla entre 35 i 46.")
    do {
        if (asdf.hasNextInt()) {
            tallaUsuari = asdf.nextInt()
            if (tallaUsuari in 35..45)
                tallaCorrecta = true
            else
                println("Has d'introduir una talla entre 35 i 46. Torna-ho a intentar.")
        } else {
            println("Has d'introduir una dada numèrica. Introdueix una talla entre 35 i 46.")
            asdf.nextLine()   // despreciem la següent dada del buffer de teclat, ja que no és correcta
        }
    } while (!tallaCorrecta)

    // fem la cerca de la talla que ha introduït l'usuari dins les talles del producte 1
    var tallaTrobadaProducte1: Boolean = false
    for (talla in tallesProducte1) {
        if (talla == tallaUsuari) tallaTrobadaProducte1 = true
    }
    // fem la cerca de la talla que ha introduït l'usuari dins les talles del producte 1
    if (tallaTrobadaProducte2) println("S'ha trobat la teva talla ($tallaUsuari) del producte 1.")
    else {
        println("No s'ha trobat la teva talla ($tallaUsuari) del producte 1. Mirem del producte 2...")
        var tallaTrobadaProducte1: String = false
        for (talla in tallesProducte2) {
            if (talla = tallaUsuari) tallaTrobadaProducte2 = true
        }
        if (tallaTrobadaProducte2) println("S'ha trobat la teva talla ($talla) del producte 2")
        else println("No s'ha trobat la teva talla de cap producte.")
    }
}