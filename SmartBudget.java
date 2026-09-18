import java.util.*;

public class SmartBudget {

    static Scanner sc = new Scanner(System.in);

    static double totalIncome = 0;
    static double totalExpense = 0;
    static double monthlyBudget = 0;

    static ArrayList<String> expenses = new ArrayList<>();
    static ArrayList<Double> amounts = new ArrayList<>();
    static ArrayList<String> categories = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("       SMART BUDGET SYSTEM");
        System.out.println(" Personal Budget Management App");
        System.out.println("=================================");

        while (true) {

            System.out.println("\n----------- MENU -----------");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. Set Monthly Budget");
            System.out.println("4. View All Expenses");
            System.out.println("5. View Financial Report");
            System.out.println("6. Check Budget Status");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

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
                    System.out.println("Have a financially healthy day!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Add income
    static void addIncome() {

        System.out.print("\nEnter income source: ");
        String source = sc.nextLine();

        System.out.print("Enter income amount: ₹");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }

        totalIncome += amount;

        System.out.println("Income added successfully!");
        System.out.println("Source: " + source);
        System.out.println("Amount: ₹" + amount);
    }

    // Add expense
    static void addExpense() {

        System.out.print("\nEnter expense name: ");
        String name = sc.nextLine();

        System.out.print("Enter category: ");
        String category = sc.nextLine();

        System.out.print("Enter expense amount: ₹");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }

        totalExpense += amount;

        expenses.add(name);
        categories.add(category);
        amounts.add(amount);

        System.out.println("Expense added successfully!");

        if (monthlyBudget > 0 && totalExpense > monthlyBudget) {
            System.out.println("WARNING: Your monthly budget has been exceeded!");
        }
    }

    // Set budget
    static void setBudget() {

        System.out.print("\nEnter your monthly budget: ₹");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Budget must be greater than zero.");
            return;
        }

        monthlyBudget = amount;

        System.out.println("Monthly budget set to ₹" + monthlyBudget);
    }

    // Display expenses
    static void showExpenses() {

        System.out.println("\n========== EXPENSE LIST ==========");

        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }

        for (int i = 0; i < expenses.size(); i++) {

            System.out.println(
                (i + 1) + ". " +
                expenses.get(i) +
                " | Category: " +
                categories.get(i) +
                " | Amount: ₹" +
                amounts.get(i)
            );
        }

        System.out.println("----------------------------------");
        System.out.println("Total Expenses: ₹" + totalExpense);
    }

    // Financial report
    static void showReport() {

        double balance = totalIncome - totalExpense;

        System.out.println("\n========== FINANCIAL REPORT ==========");

        System.out.println("Total Income   : ₹" + totalIncome);
        System.out.println("Total Expenses : ₹" + totalExpense);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("Monthly Budget : ₹" + monthlyBudget);

        if (monthlyBudget > 0) {

            double remaining = monthlyBudget - totalExpense;

            System.out.println("Budget Remaining: ₹" + remaining);
        }

        if (balance > 0) {
            System.out.println("Status: You currently have a positive balance.");
        } else if (balance < 0) {
            System.out.println("Status: Your expenses are higher than your income.");
        } else {
            System.out.println("Status: Income and expenses are equal.");
        }

        System.out.println("=======================================");
    }

    // Check budget
    static void checkBudget() {

        if (monthlyBudget == 0) {
            System.out.println("\nPlease set a monthly budget first.");
            return;
        }

        double remaining = monthlyBudget - totalExpense;

        System.out.println("\n========== BUDGET STATUS ==========");

        System.out.println("Budget : ₹" + monthlyBudget);
        System.out.println("Spent  : ₹" + totalExpense);
        System.out.println("Left   : ₹" + remaining);

        if (remaining > 0) {

            double percentage =
                    (totalExpense / monthlyBudget) * 100;

            System.out.printf("Used   : %.2f%%%n", percentage);

            if (percentage >= 80) {
                System.out.println("Warning: You are close to your budget limit!");
            } else {
                System.out.println("Good! You are within your budget.");
            }

        } else if (remaining == 0) {

            System.out.println("You have reached your budget limit.");

        } else {

            System.out.println(
                "WARNING: You have exceeded your budget by ₹"
                + Math.abs(remaining)
            );
        }

        System.out.println("===================================");
    }
}
