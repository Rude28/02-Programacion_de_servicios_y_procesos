fun main() {
   val entero: Int=4

    val enero14: Short=4

    val caracer: Char= 'G'

    val letra="A"

    val cadenita: String = 23.toString()

    val numero: Int=23

    val numerito: String= numero.toString()

    println(numerito)

    // los datos pueden ser val o var los val son inmutables y el var son mutables

    var cocaian: String= "cocaina"

    cocaian= "peperoni"

    println(cocaian)
    /* cuando hacemos una lista con lista(mutableListOf) se puede atacar a los datos de memoria a los que
    apunta dentro pero no al propio lista, sin embargo esto si lo podemos hacer cuando va con var con listOf
    pero no se puede cambiar a donde apunta dentro

    */
    /*
    Aqui granCambiante puede cambiar todos los elementos de dentro de la lista uno por uno ya que es var y puedes
    cambiar todos los elementos de dentro de una tacada ya que es mutableListof
    */
    var granCambiante= mutableListOf(0,1,2,3)
    granCambiante.sort()
    /*
    Aqui pequeñoCambiante puede cambiar todos los elementos de dentro de la lista uno por uno ya que es var y no puedes
    cambiar todos los elementos de dentro de una tacada ya que es mutableListof, por eso tienes que crear una nueva
    lista con sorted
    */
    var pequeñoCambiante=listOf(0,1,2,3)
    var pequeñoCambianteOrdenado= pequeñoCambiante.sorted()

    /*
    Aqui granoCambiante no puede cambiar todos los elementos de dentro de la lista uno por uno ya que es var y puedes
    cambiar todos los elementos de dentro de una tacada ya que es mutableListof
    */
    val granoCambiante= mutableListOf(0,1,2,3)
    granoCambiante.sort()

    /*
    Aqui pequeñonoCambiante no puede cambiar todos los elementos de dentro de la lista uno por uno ya que es var y no
    puedes cambiar todos los elementos de dentro de una tacada ya que es Listof
    */
    val pequeñonoCambainte= listOf(0,1,2,3)


    //Funciones lambda ejemplos:
    var pequeñonoCambainteOrdenado= pequeñonoCambainte.sorted()

    fun esPar(parametro: Int): Boolean{ //Esto es una sentencia porque hace algo
        return parametro%2==0
    }

    fun  esPar2(parametro: Int): Boolean= parametro%2==0 //esto es una expresión porque tiene un igual

    fun vacia(palabritas:String): Unit=print(palabritas)

    vacia("Esta es una función vacía")


    //Revisar despues porque no entiendo nada
    fun unirVacias (funcion: (String)->Unit, mundo:String):String{
            vacia("Hello world")
        return mundo
    }
    fun suma(a:Int, b:Int):Int=a+b

    fun sumaEntero(funcion:(n1:Int,n2:Int)->Int, otroNumero:String){
        otroNumero.toInt()+suma(a=2, b = 4)
    }

    //Kotlin nos pide que rellenemos las funciones dentro de la llamada

    fun resta(a:Int,b:Int):Int{
        return a-b
    }

    fun sumaYresta(resta:(n4:Int, n5:Int)->Int, num:Int):Int{
        return resta(1,5)+num
    }
    sumaYresta(::resta,5)
}