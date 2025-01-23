1.2 - Task 01

a) An arrival event triggers the arrival of a new entity (like a customer or task) into the system. 
For ongoing simulations, we need to keep the arrivals coming at regular intervals. 
So, after one arrival, a new arrival event is created to simulate the next entity arriving. 
Without it, the system would stop after the first arrival.

b) When the service starts, a new event should be created to mark the end of the service, called a departure event. 
This event indicates that the current service is completed, and it might trigger the next action (like the next customer arriving or system becoming idle). 
This keeps the flow of the system going.