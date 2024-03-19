class View {
    fun showClient(client: Client) {
        println("Name: ${client.name}")
        println("Phone: ${client.phone}")
        println("Address: ${client.address}")
    }

    fun showEmployee(employee: Employee) {
        println("Name: ${employee.name}")
        println("Phone: ${employee.phone}")
        println("Position: ${employee.position}")
    }

    fun showMovingRequest(request: MovingRequest) {
        println("Client:")
        showClient(request.client)
        println("Delivery Person:")
        showEmployee(request.deliveryPerson)
        println("Date: ${request.date}")
    }
}