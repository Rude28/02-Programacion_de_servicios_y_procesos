fun main() {
// 1 Tipos de datos básicos

    val entero:Int= 4
    val numeroCorto:Short=4
    val caracter: Char='G' //Char representa un único carácter y utiliza comillas simples ' '
    val cadena: String="Hola" //String representa una cadena de caracteres y utiliza comillas dobles " ".

// 2 Conversiones entre tipos

    // conversion de Int-> String
    val numero: Int=23
    val texto: String= numero.toString()

    // conversion de String-> Int
    val number: String="14"
    val numerichi: Int= number.toInt()

    // val numeroExtraño: Int = "23sadf".toInt() //va dar error por lo que tenemos que hacer añadir una ? al int
    val numeroExtraño: Int? = "23sadf".toIntOrNull()
    // ahora nos dara un null porque estamos usando el Int? y to int or null
    val numero1: Int? ="23".toIntOrNull()// este dara 23

// 3 Val y var
    // sirven para declarar variables, ojo pero no son lo mismo

    // val es para referencias que no pueden ser reasignadas
    val numero3: Int= 10

    // var es para referencias que pueden ser reasignadas

    var numero4:Int=20
    numero4=50

// 4 List y MutableList
    //Listof es un array de solo lectura, no puedes agregar borrar ni cambbair elementos una vez creada
        val lista=listOf(1,2,3,4)
        lista.get(2)//lo que no podemos hacer es add
        val listaOrdenada=lista.sorted()// esta seria la forma de ordenar, creando una lista nueva
    //MutableListOf es una lista que puede cambiar puedes cambiar su contenido libremente despues de crearla
        val lista2=mutableListOf(1,2,3,4)
        lista2[0]=45
        lista2.add(5)
        lista2.sort()// aqui podemos ordenar la lista totalmente

    //val+listof-> no podemos cambiar elementos de dentro ni agregar, borrar, etc Osea se queda como está y punto
    val pequeñonoCambainte= listOf(0,1,2,3)

    //var+listof-> podemos cmabiar elementos de dentro pero podemos agregar, borrar, etc
    var pequeñoCambiante=listOf(0,1,2,3)
    var pequeñoCambianteOrdenado= pequeñoCambiante.sorted()

    //val+mutablelistof-> no podemos cambiar elementos de dentro pero si añadir, osea
    val granoCambiante= mutableListOf(0,1,2,3)
    granoCambiante.sort()

    //var+mutablelistof-> podemos cambiar elementos de dentro y añadir
    var granCambiante= mutableListOf(0,1,2,3)
    granCambiante.sort()


// 5 Funciones
    // Debemos verlas como una maquina a la que damos algo, la maquina hace algo y la maquina devuelve algo
        //lo que se nos pide    lo que nos devuelve
    fun sumar(a:Int, b:Int )    :Int{
        //lo que hace
        return a+b
    }
    // Esto lo podemos modificar y hacer que solo nos pida una cosa o no nos devuelva ni nos pida nada solo que haga
    fun esPar(parametro: Int): Boolean {
        return parametro % 2 == 0
    }
    fun vacia(palabritas: String) {
        print(palabritas)
    }
    fun saludar(){
        return print("Hola bon día")
    }

    // Como somos muy vagos vamos hacer estas funciones para que ocupen menos en modo landa

    fun sumar2(a:Int,b:Int):Int=a+b

    fun esPar2(parametro:Int): Boolean= parametro%2==0

    fun vacia2(palabritas: String)= print(palabritas)

    fun saludar2()= print("Hola bon día")

// 6 Funciones que reciben como parametro otras funciones

    // En kotlin podemos hacer funciones que reciban otras funciones para que las ejecuten.
    /* Vamos a tomar la función sumar

        fun sumar(a:Int, b:Int )    :Int{
        //lo que hace
        return a+b
    }
        */
    fun utilizarSumar(
        a: Int,
        b: Int,
        funcion: (Int, Int) -> Int
    ): Int {
        return funcion(a, b)
    }
    // la parte de funcion es la que pide una funcion que reciba dos int y devuelva un int, ahi entra dentro cualquiera

    val resultado= utilizarSumar(2,3,::sumar)

    //:: sumar significa pasa la función como objeto para poder utilizarla despues

// 7 Función lambda

    // Es una función que se utiliza dentro de una variable

    val resultado2= {a: Int, b:Int->a+b}
}

