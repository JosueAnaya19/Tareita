class Controller {
    private val view = View()

    fun registerClient(name: String, phone: String, address: String) {
        val client = Client(name, phone, address)
        view.showClient(client)
    }

    fun registerEmployee(name: String, phone: String, position: String) {
        val employee = Employee(name, phone, position)
        view.showEmployee(employee)
    }

    fun registerMovingRequest(client: Client, deliveryPerson: Employee, date: String) {
        val request = MovingRequest(client, deliveryPerson, date)
        view.showMovingRequest(request)
    }
}