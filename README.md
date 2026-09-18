# Budget-Management
SmartBudget is a Java-based application designed to manage income, expenses, and monthly budgets. It helps users track spending, monitor their remaining budget, and identify when their budget is exceeded. The system also generates simple financial reports to provide a clear overview of the user's financial status.
# SmartBudget – Personal Budget Management System

## 1. Project Overview

SmartBudget is a simple Java-based Personal Budget Management System. It helps users record their income and expenses, set a monthly budget, monitor spending, and view their financial status through a console-based menu.

## 2. Features

* Add income with an income source
* Add expenses with name, category, and amount
* Set a monthly budget
* View all recorded expenses
* Calculate total income and expenses
* Calculate current balance
* Check remaining budget
* Display budget usage percentage
* Show warning when the budget is exceeded
* Input validation for income, expenses, and budget amounts
* Generate a financial report

## 3. Technologies / Tools Used

* **Programming Language:** Java
* **IDE:** Visual Studio Code
* **Data Structure:** ArrayList
* **JDK:** Java Development Kit (JDK 8 or above)
* **Version Control:** Git and GitHub

## 4. Project Structure

```text
SmartBudget/
│
└── SmartBudget.java
```

The complete project is implemented in a single Java file.

## 5. Installation and Running

### Step 1: Install Java

Install JDK 8 or a newer version on your computer.

### Step 2: Open the Project

Open the `SmartBudget` folder in Visual Studio Code.

### Step 3: Compile the Program

Open the VS Code terminal and run:

```bash
javac SmartBudget.java
```

### Step 4: Run the Program

```bash
java SmartBudget
```

## 6. How to Use

After starting the program, the following menu is displayed:

```text
1. Add Income
2. Add Expense
3. Set Monthly Budget
4. View All Expenses
5. View Financial Report
6. Check Budget Status
7. Exit
```

Select the required option by entering its number.

## 7. Testing

The following test cases can be used to test the application:

| Test Case             | Expected Result                                     |
| --------------------- | --------------------------------------------------- |
| Add valid income      | Income is added successfully                        |
| Add valid expense     | Expense is recorded                                 |
| Enter negative amount | Error message is displayed                          |
| Set monthly budget    | Budget is saved                                     |
| View expenses         | All recorded expenses are displayed                 |
| Generate report       | Income, expenses, balance, and budget are displayed |
| Exceed budget         | Budget exceeded warning is displayed                |
| No expenses           | System displays that no expenses are recorded       |

## 8. Screenshots

The following screenshots can be added to demonstrate the working project:

* Main menu
* Adding income
* Adding an expense
* Setting monthly budget
* Expense list
* Financial report
* Budget status and warning

## 9. Project Objective

The objective of SmartBudget is to provide a simple way to manage personal finances while demonstrating Java concepts such as variables, methods, loops, conditional statements, ArrayList collections, user input, and input validation.
