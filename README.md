# SmartBudget – Personal Budget Management System

## Project Overview

SmartBudget is a Java-based Personal Budget Management System designed to help users manage their income, expenses, and monthly budgets.

The application provides a simple console-based interface where users can add income, record expenses, categorize their spending, set a monthly budget, view all recorded expenses, generate a financial report, and check their budget status.

The project is designed as a practical Java application that demonstrates the use of fundamental programming concepts while solving a real-world personal finance management problem.

---

## Features

### 1. Add Income

Users can add income by entering:

- Income source
- Income amount

The system adds the valid amount to the total income.

### 2. Add Expense

Users can record an expense by entering:

- Expense name
- Expense category
- Expense amount

The expense is stored temporarily and added to the total expenses.

### 3. Set Monthly Budget

Users can define a monthly spending budget.

The budget is used by the application to monitor spending and calculate the remaining available budget.

### 4. View All Expenses

Users can view all expenses recorded during the current program session.

Each expense contains:

- Expense name
- Expense category
- Expense amount

### 5. Financial Report

The application generates a financial report containing:

- Total income
- Total expenses
- Current balance
- Monthly budget
- Remaining budget

### 6. Check Budget Status

The system calculates the percentage of the budget that has been used.

It also informs the user whether the spending is within the budget or has exceeded the defined monthly budget.

### 7. Budget Alerts

The application provides warnings when:

- 80% or more of the monthly budget has been used.
- Total expenses exceed the monthly budget.

### 8. Input Validation

The system validates monetary inputs and prevents invalid values such as zero or negative amounts for income, expenses, and budgets.

---

## Technologies Used

| Technology / Tool | Purpose |
|---|---|
| Java | Main programming language |
| JDK 8+ | Compilation and execution |
| Visual Studio Code | Development environment |
| ArrayList | Temporary storage of expense data |
| Git | Version control |
| GitHub | Source code repository |

---

## Project Structure

```text
SmartBudget/
│
├── SmartBudget.java
├── README.md
└── statement.md
