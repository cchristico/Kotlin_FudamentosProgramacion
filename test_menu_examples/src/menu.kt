import java.util.Arrays

fun main (args:Array<String>) {

    println("1. Arboles de *")
    println("2. Series")
    println("3. Juego de palabras")
    println("4. Juegos Matematicos")
    println("5. Ordenar Números")
    print("Ingrese un valor:")
    var input: Int = readLine()!!.toInt()
    //   print("Ingresarte =$input")

    when (input) {
        // Arboles
        1 -> {
            println("1. Arbol izquierda");
            println("2. Arbol derecha");
            println("3. Arbol completo");
            var arb: Int = readLine()!!.toInt()
            when (arb) {
                1 -> {
                    println("Arbol izquierda")
                    println("Ingrese en numero :")
                    var num: Int = readLine()!!.toInt()
                    for (i in 0 until num + 2) {
                        for (j in 1 until i) {
                            print("*")

                        }
                        println()
                    }
                }
                2 -> {
                    println("Arbol derecha")
                    println("Ingrese en numero :")

                    var num: Int = readLine()!!.toInt()
                    var k: Int = num - 1
                    var m: Int = 1
                    for (i in 0 until num) {

                        for (l in k - 1 downTo 0) {
                            print(" ")
                        }
                        for (n in 0 until m) {
                            print("*")
                        }
                        k--
                        m++

                        println("")
                    }

                }
                3 -> {
                    println("Arbol copleto")
                    println("Ingrese en numero :")
                    var num: Int = readLine()!!.toInt()
                    var num2: Int = num
                    var num3: Int = num
                    for (i in 1 until num + 1) {
                        var j = (num * 2) - 1

                        for (k in 1 until j + 1) {
                            if (k < num2) {
                                print(" ")
                            } else {
                                if (k > num3)
                                    print(" ")
                                else {
                                    print("*")
                                }
                            }

                        }
                        println("")
                        num2--
                        num3++
                    }

                }
                else -> {
                    println("Funcion no valida")
                }

            }
        }
        // Series
        2 -> {
            println("1. Fibonacci")
            println("2. Numero Perfecto")

            var num: Int = readLine()!!.toInt()
            when (num) {

                // Fibonacci
                1 -> {
                    print("Ingrese el numero de serie")
                    var ser: Int = readLine()!!.toInt()

                    var Fibbo = Array<Int>(ser) { 0 }
                    for (i in 0 until ser) {
                        if (i <= 1) {
                            Fibbo[i] = 1
                            Fibbo[i] = 1
                        } else {
                            Fibbo[i] = Fibbo[i - 1] + Fibbo[i - 2]
                        }
                    }
                    for (j in 0 until Fibbo.size) {
                        print(" " + Fibbo[j] + " ")

                    }

                }
                // Factorial
                // Número Perfecto
                2 -> {
                    var Num: Int = 0
                    for (i in 1 until 497) {
                        for (j in 1 until i) {
                            if (i % j == 0) {
                                Num = Num + j
                            }

                        }
                        if (i == Num) {
                            println("$Num ")

                        }
                        Num = 0

                    }
                }
            }


        }
        // Juego de Palabras
        3 -> {
            println("1. Palindromo")
            //println("2. Vocales Consonantes")
            println("Ingrese una opción:")

            var input: Int = readLine()!!.toInt()

            when (input) {
                // Palindromo
                1 -> {
                    print("Ingrese la Palabra")
                    var Palabra: String = readLine()!!

                    var PalabraA = Palabra.toCharArray()
                    var PalabraB = ""
                    for (i in PalabraA.lastIndex downTo 0) {
                        PalabraB += PalabraA[i];
                    }

                    var PalabraC = String(PalabraA)
                    if (PalabraC.equals(PalabraB)) {
                        print("La palabra $PalabraC es Palindromo")
                    } else {
                        print("La palabra $PalabraC ($PalabraB) no es Palindromo")
                    }

                }
                // Vocales consonantes
                2 -> {

                }

            }

        }
        //Juegos de Matematicos
        4 -> {
            println("Ingrese Valor")
            println("1. ¿ Es triangulo ?:")
            println("2. Terna de Pitagoras:")
            println("3. Numeros triangulares")

            var indice: Int = readLine()!!.toInt()

            when (indice) {
                1 -> {
                    println("Ingrese El lado a:")
                    var a: Int = readLine()!!.toInt()

                    println("Ingrese El lado b:")
                    var b: Int = readLine()!!.toInt()

                    println("Ingrese El lado c:")
                    var c: Int = readLine()!!.toInt()

                    if (a + b > c) {
                        if (a == b && b == c) {
                            println("Triangulo equilatero")

                        } else {
                            if ((a == b) || (a == c) || (b == c)) {
                                println("Triangulo Isóceles")

                            } else {
                                print("Tiangulo escaleno")

                            }
                        }
                    } else {
                        println("No es triangulo")
                    }

                }
                2 -> {

                    /*
     *  Un triangulo rectángulo puede tener lados que sean todos enteros. El conjunto de  tres valores
     *  enteros para los lados de untriángulo rectángulo se conoce como una terna pitagórica.
     *  Estos tres lados deben satisfacer la relación de que la suma de los cuadrados de dos lados es
     *  igual al cuadrado de la hipotenusa. Encuentre todas las ternas de Pitágoras para el
     *  cateto opuesto, cateto adyacente e hipotenusa,todos ellos no mayores de 500.
     * */

                    println("Ingrese el conjunto de valores para la terna");
                    var Numero: Int = readLine()!!.toInt()
                    // Hipotenusa
                    var H: Double
                    var C1: Double
                    var C2: Double
                    var Sum: Double
                    val exp: Int = 2
                    for (i in 1 until Numero + 1) {
                        //Cateto A
                        for (j in 1 until Numero + 1) {
                            // Cateto B
                            for (k in 1 until Numero + 1) {
                                H = Math.pow(i.toDouble(), exp.toDouble())
                                C1 = Math.pow(j.toDouble(), exp.toDouble())
                                C2 = Math.pow(k.toDouble(), exp.toDouble())
                                Sum = C1 + C2
                                // println("Hpoenusa $i c1: $j c2: $k || SUM $Sum")
                                if (H == Sum) {
                                    println("Terna H= ${i.toInt()} C1=${j.toInt()} c2=${k.toInt()}")
                                }
                                H == 0.00
                                C1 == 0.00
                                C2 == 0.00
                            }

                        }
                    }

                }
                3->{
                    /*
                    * Cumple la siguiente formula
                    *
                    * n
                    * E i
                    * i=1
                    *
                    * */
                    println("Ingrese el valor de n")
                    var n:Int = readLine()!!.toInt()
                    var t:Int=0
                    for (j in 1 until n+1){
                        t+=j
                    }
                    println("valor de $n - valor de t $t||")
                    println("Su formación triangular es:")
                    var k=n
                    var l=n
                    for (j in n downTo 1)
                    {

                        for(i in 1 until t+1)
                        {
                            if(i<l){
                                print(" ")
                            }
                            else{
                                if(i>k){
                                    print(" ")
                                }
                                else{
                                   // print("*")
                                    //l
                                    if(i%l!=0){
                                        print(" ")
                                    }
                                    else{
                                        if(j==1){
                                            if(i%2==0){
                                                print(" ")
                                            }
                                            else{
                                                print("*")
                                            }


                                        }
                                        else{
                                            print("*")
                                        }

                                    }
                                }
                            }

                        }
                        println("")
                        k++
                        l--
                    }




                }

            }


        }
        else -> {
            print("wow")
        }
    }
}


