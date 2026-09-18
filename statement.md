# SmartBudget – Personal Budget Management System

## 1. Problem Statement

Managing personal income and expenses manually can make it difficult to track spending and stay within a monthly budget. SmartBudget provides a simple Java-based solution to record income and expenses, set a budget, and monitor the user's financial status.

## 2. Scope of the Project

The project focuses on basic personal financial management through a console-based Java application. Users can add income, record categorized expenses, set a monthly budget, view their expenses, generate a financial report, and check their budget status.

The project does not include online banking, payment processing, or connection to real bank accounts.

## 3. Target Users

* Students
* College users
* Individuals who want to track their personal spending
* Beginners interested in simple personal budget management

## 4. High-Level Features

* **Income Management:** Add and track income from different sources.
* **Expense Management:** Record expenses with their name, category, and amount.
* **Budget Management:** Set a monthly spending limit.
* **Expense Tracking:** View all recorded expenses.
* **Financial Report:** Display total income, total expenses, and current balance.
* **Budget Monitoring:** Calculate remaining budget and percentage of budget used.
* **Budget Alerts:** Display warnings when expenses approach or exceed the budget.
* **Input Validation:** Prevent invalid or negative amounts from being entered.
# 5.3 Source Code / Project Files

The SmartBudget project is implemented as a simple and organized Java console application.

## Project Structure

```text
SmartBudget/
│
├── SmartBudget.java
├── README.md
└── statement.md
```

### File Description

* **SmartBudget.java** – Contains the complete source code of the application, including income management, expense management, budget management, financial reports, and budget monitoring.
* **README.md** – Provides the project overview, features, technologies used, installation steps, running instructions, and testing information.
* **statement.md** – Contains the problem statement, project scope, target users, and high-level features.

No external data files, assets, or configuration files are required because the current version stores data temporarily using Java `ArrayList` collections while the program is running.

