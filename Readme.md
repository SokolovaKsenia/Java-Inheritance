#	Inheritance

The purpose of this exercise is to introduce you to inheritance in Java.

Estimated time - 90 minutes.

## Description

Task #6 Inheritance

Create classes `Employee`, `SalesPerson`, `Manager` and `Company` with the following features.

#### General Level Task:

Create basic class `Employee` with the following content:

- Private fields: `name`, `salary` and `bonus`
- Public method `getName` for reading employee’s last name
- Public method `getSalary` for reading and recording `salary` field
- Constructor with parameters to initialize `name` and `salary`
- Method `setBonus` to set the `bonus` field
- Method `toPay` returns the summary of `salary` and `bonus`.

Create class `SalesPerson` as class `Employee` inheritor and declare within it:

- Private integer field `percent` (percent of sales plan completion)
- Constructor with parameters to initialize `name`, `salary`, `percent`. 
Two of them are passed to the base class constructor
- Override the `setBonus` method as follows: 
if the seller has completed the plan by more than 100%, 
then his bonus is doubled, and if more than 200%, 
the bonus is tripled.

- Create the class `Manager` as a subclass of the `Employee` class with the following content:
- Private integer field `clientAmount` (number of clients, served by the manager per month)
- Constructor with parameters to initialize the employee's `name`, `salary`, and `clientAmount`. Two of them are passed to the base class constructor..
- Override the `setBonus` method as follows: 
if the manager has served more than 100 clients, 
his bonus is increased by 500, and if more than 150 clients, 
then the bonus is increased by 1000.

### Advanced level requirements:

To fully complete Low level tasks.

Create class `Company` with the following content:

- Private field `employees` (an array of Employee objects).
- Constructor that receives ean array of Employee objects.
- Method `giveEverybodyBonus` with the `companyBonus` parameter
that sets the amount of basic bonus for each employee.
- Method `totalToPay` the total salary of all employees including bonuses.
- Method `nameMaxSalary` that returns the name of the employee who received the maximum salary including bonus.
