import modules.EnergyGenerator
import modules.ResearchLab
import resources.OutpostResource
import resources.ResourceManager


//fun characters.characters.modules.resources.main(){
//    val manager = resources.ResourceManager()
//    val minerals = resources.OutpostResource(1,"Minerals",300)
//    val gas = resources.OutpostResource(2,"Gas",100)
//    manager.add(minerals)
//    manager.add(gas)
//    manager.printAll()
//    val bonus = minerals.copy(amount = minerals.amount+50)
//    println("Копия минералов с бонусом: $bonus")
//}

fun main(){
    val manager= ResourceManager()
    manager.add(OutpostResource(1, "Minerals", 120))
    manager.add(OutpostResource(2, "Gas", 40))
    val generator= EnergyGenerator()
    val lab = ResearchLab()
    generator.performAction(manager)
    lab.performAction(manager)
    println()
    manager.printAll()
}