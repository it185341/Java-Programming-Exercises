# Lab 9:  Generalization, Polymorphism Part2
## Assignment Description
Write in Java a class named Tilefono (Phone) that provides the basic functions of a telephone:

- dial – initiate a call to a given number.
- cost – calculate the cost of telephone calls.

The above class is inherited by the classes Stathero (Landline) and Kinito (Mobile), which describe the functions of a landline and a mobile phone respectively.

In each class, define the attributes/variables you consider necessary.
For each class, in addition to the default constructor, also define a constructor that initializes all the variables of the respective class, as well as the corresponding get and set methods.

### dial Method Specifications
The dial method should:
-Accept as a parameter the phone number (String) to call.
-Display the message: Call from the <landline/mobile> phone <caller_number> to the <landline/mobile> phone with number <receiver_number>
- Call from the <landline/mobile> phone <caller_number> to the <landline/mobile> phone with number <receiver_number>
- Update the total number of call seconds made to landlines or to mobiles by the current phone, depending on the type of the recipient.

The duration of each call is random in seconds (random number from 0 to 1000).
### cost Method Specifications
The cost method should calculate and return either:
The total cost of calls made to mobiles by the current phone, or
The total cost of calls made to landlines by the current phone.
The cost per second depends on the source and destination type as follows:

| From     | To       | Cost per second (€) |
| -------- | -------- | ------------------- |
| Landline | Landline | 0.02                |
| Landline | Mobile   | 0.05                |
| Mobile   | Landline | 0.06                |
| Mobile   | Mobile   | 0.07                |


### Phone Number Format
Each phone number has 10 digits and is in the form:
"2?????????" → Landline (2 as the first digit)
"6?????????" → Mobile (6 as the first digit)
Each ? is a random digit from 0 to 9.

## Main Program Requirements
- The company has N phones.
- N is provided as a command-line argument. If it is not provided, the user is prompted to enter it via keyboard.
- Some phones are mobile and some are landline.
- In the main program, create and initialize an array of N phones for the company:
  - 60% Landlines
  - 40% Mobiles
-Then, in a loop, F calls are made:
  - F is a random number between 100 and 2000.
  - Calls are made from company phones to randomly generated numbers (landline or mobile).
- For each call:
  - dial is executed, displaying the correct message.
  - Call duration is updated (random value between 5 and 600 seconds).

## Calculations to Display
Using appropriate methods, display:
  1. A catalog with each phone’s number and total call cost.
  2. The total seconds of calls made by all landline phones, and their cost.
  3. The total seconds of calls made by all mobile phones, and their cost.
  4. The total cost of calls to landlines.
  5. The total cost of calls to mobiles.
  6. The company’s total telephone expenses from all calls.

### Hints
Store phone numbers as String.
Store the total seconds of calls made to landlines and to mobiles as integers.
All phones have a number, so this attribute should belong to the Tilefono class.

The Tilefono class is not instantiated directly, so it should be declared abstract.

The methods dial and cost should be declared abstract if they are implemented differently in each subclass.

The call cost values can be stored in an array in the Tilefono class.
