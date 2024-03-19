//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val controller = Controller()

    controller.registerClient("SpongeBob SquarePants", "555-1234", "Bikini Bottom")
    controller.registerEmployee("Patrick Star", "555-4321", "Jellyfish Catcher")

    val client = Client("Squidward Tentacles", "555-9876", "Annoying Neighbors St")
    val employee = Employee("Mr. Krabs", "555-6789", "Money Hoarder")
    controller.registerMovingRequest(client, employee, "2024-04-01")
}