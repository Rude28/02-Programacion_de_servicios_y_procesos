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
    var pequeñonoCambainteOrdenado= pequeñonoCambainte.sorted()


}