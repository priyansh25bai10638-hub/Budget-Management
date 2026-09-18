# SmartBudget – Personal Budget Management System

## Problem Statement

Managing personal finances can be difficult when income and expenses are recorded manually or not tracked regularly. Students and individuals often spend money on food, travel, education, entertainment, shopping, and other daily needs without having a clear understanding of their total spending.

SmartBudget is developed as a simple Personal Budget Management System to help users record their income and expenses and manage a monthly spending budget. The system allows users to add income, record expenses with categories, set a monthly budget, view recorded expenses, and generate a financial report.

The application also monitors the user's spending against the defined monthly budget. It calculates the total income, total expenses, available balance, and remaining budget. When spending reaches a high percentage of the budget or exceeds the budget, the system provides a warning to the user.

The main purpose of the project is to provide a simple and easy-to-use solution for basic personal financial management while demonstrating the practical implementation of Java programming concepts.

## Scope

The scope of SmartBudget is limited to basic personal budget and expense management through a Java console application.

The system provides the following functionality:

- Adding income from different sources.
- Recording expenses with expense name, category, and amount.
- Setting a monthly spending budget.
- Viewing all recorded expenses.
- Calculating total income.
- Calculating total expenses.
- Calculating the available balance.
- Calculating the remaining monthly budget.
- Monitoring budget usage.
- Generating a simple financial report.
- Displaying warnings when spending approaches or exceeds the budget.
- Validating financial input values.

The current version stores data temporarily in memory using Java variables and `ArrayList` collections. Therefore, the data is available only while the application is running.

The project does not currently include online banking, online payments, real-time bank transactions, investment management, or external financial institution integration.

## Target Users

### Students

Students can use SmartBudget to manage their monthly allowance and track expenses such as food, transportation, education, entertainment, and other daily requirements.

### Individual Users

Individuals can use the application to record their income and expenses and monitor whether their spending is within their planned monthly budget.

### Beginners

The application provides a simple interface for users who are new to personal finance management and want a basic method of tracking their spending.

### Java Programming Learners

The project can also be useful for students learning Java because it demonstrates concepts such as methods, variables, loops, conditional statements, collections, user input, calculations, and validation.

## High-Level Features

### 1. Income Management

Users can enter an income source and the corresponding amount. The system validates the amount and adds valid income to the total income.

### 2. Expense Management

Users can record an expense by entering its name, category, and amount. The expense details are stored temporarily and included in the total expense calculation.

### 3. Monthly Budget Management

Users can set a monthly budget according to their expected spending. The system uses this budget to monitor the user's expenses.

### 4. Expense Tracking

The application provides an option to view all recorded expenses along with their names, categories, and amounts.

### 5. Financial Reporting

The system generates a simple financial report showing important financial information such as:

- Total Income
- Total Expenses
- Current Balance
- Monthly Budget
- Remaining Budget

### 6. Budget Monitoring

The application calculates how much of the monthly budget has been used and displays the remaining budget amount.

### 7. Budget Alerts

The system provides warnings when the user's spending reaches 80% or more of the defined budget and when expenses exceed the monthly budget.

### 8. Input Validation

The system validates monetary values and prevents zero or negative income, expense, and budget amounts from being accepted.

## Project Objective

The main objective of SmartBudget is to develop a simple personal finance management application using Java. The project aims to provide users with basic tools for recording income and expenses, managing a monthly budget, monitoring spending, and generating financial information.

From a technical perspective, the project demonstrates the practical use of Java programming concepts including classes, methods, variables, conditional statements, loops, collections, user input, calculations, and error handling.

## Project Limitations

The current version of SmartBudget has the following limitations:

- Data is stored only temporarily in memory.
- Data is lost when the application is closed.
- The application does not use a database.
- The application does not have a graphical user interface.
- User authentication and login functionality are not included.
- Expenses cannot currently be edited or deleted.
- The system does not connect to bank accounts.
- The system does not process online payments.
- The system does not provide investment management features.

These limitations can be addressed through future enhancements such as database integration, persistent storage, user authentication, graphical interfaces, and advanced financial analysis.
