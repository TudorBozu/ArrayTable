import kotlin.system.exitProcess

fun main(){
    println("Enter names and salaries comma (,) as separator")

    val names = readLine().orEmpty()

    val namesarray = names.split(",")

    println("Enter salaries using camma(,) as separator")

    val salarie = readLine().orEmpty()

    val salariesarray = salarie.split(",")

    if(namesarray.size != salariesarray.size){
        println("Names list must be the same as salaries list")
        exitProcess(0)
    }
    validatelenght(namesarray,10,"name")
    validatelenghtsalary(salariesarray,6,"salary")
    printtable(namesarray,salariesarray)
}

fun printtable(namesarray: List<String>, salariesarray: List<String>) {
 println("-".repeat(23))
 for(name in namesarray){
     val index = namesarray.indexOf(name)
     val salary = salariesarray[index]
     val f1 =(12 - name.length)/2
     val f2 =12 - name.length - f1
     val s1 = (8-salary.length)/2
     val s2 = 8 - salary.length-s1

     print("|")
     print(" ".repeat(f1))
     print(name)
     print(" ".repeat(f2))
     print("|")
     print(" ".repeat(s1))
     print(salary)
     print(" ".repeat(s2))
     println("|")

 }
    println("-".repeat(23))
}

fun validatelenghtsalary(salariesarray: List<String>, maxsum: Int, salary: String) {
for (sal in salariesarray){
    if(sal.length > maxsum){
        println("$salary must be up to $maxsum characters")
        exitProcess(0)
    }
  }
}

fun validatelenght(namesarray: List<String>, maxsize: Int, entity: String) {

    for (name in namesarray){
        if(name.length > maxsize){
            println("$entity must be up to $maxsize characters")
            exitProcess(0)
        }
    }
}
