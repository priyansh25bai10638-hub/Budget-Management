import java.util.ArrayList;
import java.util.Scanner;

public class SmartBudget {

    // Scanner for user input
    static Scanner sc = new Scanner(System.in);

    // Financial variables
    static double totalIncome = 0;
    static double totalExpense = 0;
    static double monthlyBudget = 0;

    // Lists for storing expense information
    static ArrayList<String> expenses = new ArrayList<>();
    static ArrayList<String> categories = new ArrayList<>();
    static ArrayList<Double> amounts = new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        System.out.println("====================================");
        System.out.println("       SMART BUDGET SYSTEM");
        System.out.println("  Personal Budget Management System");
        System.out.println("====================================");

        do {
            displayMenu();

            choice = readInt("Enter your choice: ");

            switch (choice) {

                case 1:
                    addIncome();
                    break;

                case 2:
                    addExpense();
                    break;

                case 3:
                    setBudget();
                    break;

                case 4:
                    showExpenses();
                    break;

                case 5:
                    showReport();
                    break;

                case 6:
                    checkBudget();
                    break;

                case 7:
                    System.out.println("\nThank you for using SmartBudget!");
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("\nInvalid choice!");
                    System.out.println("Please select a number between 1 and 7.");
            }

        } while (choice != 7);

        sc.close();
    }

    // Displays the main menu
    static void displayMenu() {

        System.out.println("\n====================================");
        System.out.println("           MAIN MENU");
        System.out.println("====================================");
        System.out.println("1. Add Income");
        System.out.println("2. Add Expense");
        System.out.println("3. Set Monthly Budget");
        System.out.println("4. View All Expenses");
        System.out.println("5. View Financial Report");
        System.out.println("6. Check Budget Status");
        System.out.println("7. Exit");
        System.out.println("====================================");
    }

    // Adds income to the system
    static void addIncome() {

        System.out.println("\n---------- ADD INCOME ----------");

        System.out.print("Enter income source: ");
        String source = sc.nextLine().trim();

        if (source.isEmpty()) {
            System.out.println("Income source cannot be empty.");
            return;
        }

        double amount = readDouble("Enter income amount: ");

        if (amount <= 0) {
            System.out.println("Income amount must be greater than 0.");
            return;
        }

        totalIncome += amount;

        System.out.println("\nIncome added successfully!");
        System.out.println("Source: " + source);
        System.out.printf("Amount: Rs. %.2f%n", amount);
        System.out.printf("Total Income: Rs. %.2f%n", totalIncome);
    }

    // Adds an expense to the system
    static void addExpense() {

        System.out.println("\n---------- ADD EXPENSE ----------");

        System.out.print("Enter expense name: ");
        String expense = sc.nextLine().trim();

        if (expense.isEmpty()) {
            System.out.println("Expense name cannot be empty.");
            return;
        }

        System.out.print("Enter category: ");
        String category = sc.nextLine().trim();

        if (category.isEmpty()) {
            System.out.println("Category cannot be empty.");
            return;
        }

        double amount = readDouble("Enter expense amount: ");

        if (amount <= 0) {
            System.out.println("Expense amount must be greater than 0.");
            return;
        }

        expenses.add(expense);
        categories.add(category);
        amounts.add(amount);

        totalExpense += amount;

        System.out.println("\nExpense added successfully!");
        System.out.println("Expense: " + expense);
        System.out.println("Category: " + category);
        System.out.printf("Amount: Rs. %.2f%n", amount);

        // Budget warning
        if (monthlyBudget > 0) {

            double percentage = (totalExpense / monthlyBudget) * 100;

            if (totalExpense > monthlyBudget) {
                System.out.println("\nWARNING: Monthly budget exceeded!");
            } else if (percentage >= 80) {
                System.out.println("\nWARNING: You have used 80% or more of your budget.");
            }
        }
    }

    // Sets the monthly budget
    static void setBudget() {

        System.out.println("\n---------- SET MONTHLY BUDGET ----------");

        double budget = readDouble("Enter your monthly budget: ");

        if (budget <= 0) {
            System.out.println("Budget must be greater than 0.");
            return;
        }

        monthlyBudget = budget;

        System.out.printf(
            "Monthly budget set successfully: Rs. %.2f%n",
            monthlyBudget
        );

        if (totalExpense > monthlyBudget) {
            System.out.println("Warning: Current expenses already exceed this budget.");
        }
    }

    // Displays all recorded expenses
    static void showExpenses() {

        System.out.println("\n---------- ALL EXPENSES ----------");

        if (expenses.isEmpty()) {
            System.out.println("No expenses have been recorded yet.");
            return;
        }

        System.out.println(
            String.format("%-5s %-25s %-20s %12s",
            "No.", "Expense", "Category", "Amount")
        );

        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < expenses.size(); i++) {

            System.out.printf(
                "%-5d %-25s %-20s Rs. %8.2f%n",
                i + 1,
                expenses.get(i),
                categories.get(i),
                amounts.get(i)
            );
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("Total Expenses: Rs. %.2f%n", totalExpense);
    }

    // Generates the financial report
    static void showReport() {

        System.out.println("\n========== FINANCIAL REPORT ==========");

        double balance = totalIncome - totalExpense;

        System.out.printf("Total Income       : Rs. %.2f%n", totalIncome);
        System.out.printf("Total Expenses     : Rs. %.2f%n", totalExpense);
        System.out.printf("Current Balance    : Rs. %.2f%n", balance);

        if (monthlyBudget > 0) {

            double remaining = monthlyBudget - totalExpense;
            double percentage = (totalExpense / monthlyBudget) * 100;

            System.out.printf("Monthly Budget     : Rs. %.2f%n", monthlyBudget);
            System.out.printf("Budget Remaining   : Rs. %.2f%n", remaining);
            System.out.printf("Budget Used        : %.2f%%%n", percentage);

            if (remaining < 0) {
                System.out.println("Status             : BUDGET EXCEEDED");
            } else if (percentage >= 80) {
                System.out.println("Status             : WARNING - HIGH SPENDING");
            } else {
                System.out.println("Status             : WITHIN BUDGET");
            }

        } else {
            System.out.println("Monthly Budget     : Not Set");
            System.out.println("Budget Remaining   : Not Available");
            System.out.println("Budget Used        : Not Available");
        }

        System.out.println("======================================");
    }

    // Checks the current budget status
    static void checkBudget() {

        System.out.println("\n---------- BUDGET STATUS ----------");

        if (monthlyBudget <= 0) {

            System.out.println("Monthly budget has not been set.");

            System.out.print("Would you like to set a budget now? (yes/no): ");
            String answer = sc.nextLine().trim().toLowerCase();

            if (answer.equals("yes")) {
                setBudget();
            } else {
                System.out.println("Budget was not set.");
            }

            return;
        }

        double remaining = monthlyBudget - totalExpense;
        double percentage = (totalExpense / monthlyBudget) * 100;

        System.out.printf("Monthly Budget : Rs. %.2f%n", monthlyBudget);
        System.out.printf("Total Spent    : Rs. %.2f%n", totalExpense);
        System.out.printf("Remaining      : Rs. %.2f%n", remaining);
        System.out.printf("Budget Used    : %.2f%%%n", percentage);

        System.out.println();

        if (totalExpense > monthlyBudget) {

            double exceeded = totalExpense - monthlyBudget;

            System.out.println("STATUS: BUDGET EXCEEDED");
            System.out.printf(
                "You have exceeded the budget by Rs. %.2f%n",
                exceeded
            );

        } else if (percentage >= 80) {

            System.out.println("STATUS: WARNING");
            System.out.println("You have used 80% or more of your budget.");
            System.out.printf(
                "Amount remaining: Rs. %.2f%n",
                remaining
            );

        } else {

            System.out.println("STATUS: WITHIN BUDGET");
            System.out.printf(
                "You still have Rs. %.2f available.%n",
                remaining
            );
        }
    }

    // Reads an integer safely
    static int readInt(String message) {

        while (true) {

            System.out.print(message);
            String input = sc.nextLine().trim();

            try {

                return Integer.parseInt(input);

            } catch (NumberFormatException e) {

                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    // Reads a decimal value safely
    static double readDouble(String message) {

        while (true) {

            System.out.print(message);
            String input = sc.nextLine().trim();

            try {

                return Double.parseDouble(input);

            } catch (NumberFormatException e) {

                System.out.println(
                    "Invalid amount. Please enter a valid numeric value."
                );
            }
        }
    }
}
