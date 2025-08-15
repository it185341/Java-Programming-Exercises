# Lab 8 - Generalization, Polymorphism

## Assignment Description
Implement the classes Car, Truck, and Motorcycle, which describe a car, a truck, and a motorcycle respectively.
These classes inherit from (and extend) the Vehicle class you implemented in the previous lab, adding the following extra properties:
- Car: Number of doors
- Truck: Number of axles
- Motorcycle: Indicator of whether it has a side basket (sidecar)

Each object (regardless of vehicle type) should have the following methods:
transferOwnership
Accepts the new owner’s name as a parameter.
Replaces the old owner’s name with the new one.

Prints the message:
Ownership is transferred from <Old Owner Name> to <New Owner Name>

Displays a message depending on the vehicle type:

Car: You need a car driving license dear <Owner Name>
Truck: You must be a professional driver. This is a <X> axles truck Mr. <Owner Name (Where X is the number of axles.)
Motorcycle: Your car driving license is not enough. You need a special license dear <Owner Name>

## Main Program Requirements
Create an array of N vehicles.
N is provided as a command-line argument. If no argument is given, prompt the user to enter it via the keyboard.
The array must be filled with:
- 70% Cars
- 15% Trucks
- 15% Motorcycles

The placement of vehicles in the array should be random using Math.random().
Display the details of all vehicles in the array.

### Notes & Guidelines
The Vehicle class is general and should be implemented as abstract (since no objects of Vehicle itself are created).
The transferOwnership method is identical for all three subclasses. Therefore, it should only be implemented once in Vehicle and not overridden in the subclasses.
The drive method is different for each subclass and must be implemented in each subclass. It should be declared as abstract in the Vehicle class. This is also a mandatory reason for making Vehicle abstract.k
