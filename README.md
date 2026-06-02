# Employee Payroll System 
A desktop-based Java Swing application with a MySQL backend designed to manage employee payroll, calculate net salaries, and track allowances/deductions.

---

## 🛠️ Prerequisites & System Requirements

Before running the application, ensure you have the following installed on your system:
* **Java Development Kit (JDK):** Version 8 or higher.
* **MySQL Database Server:** Available via XAMPP, WAMP, or a standalone MySQL installation.
* **Any Java IDE/Editor:** NetBeans, IntelliJ IDEA, Eclipse, or Visual Studio Code.

---

## 🗄️ Database Setup

1. Start your local MySQL server (e.g., open **XAMPP** and click **Start** next to MySQL).
2. Open your web browser and navigate to `http://localhost/phpmyadmin`.
3. Create a new database named `payroll_db`.
4. Import the setup script:
   * Select the `payroll_db` database in phpMyAdmin.
   * Click on the **Import** tab.
   * Browse and select the `Employee_Payroll_System.sql` file located inside the `Database/` folder of this repository.
   * Click **Go** / **Import**.

---

## 🚀 How to Run the Project (Any IDE)

You can run this project in any development environment by following these general steps:

### 1. Import the Project
* **NetBeans:** `File` > `Open Project` > Select the `Employ_Payroll` folder.
* **IntelliJ IDEA:** `File` > `Open` > Select the root directory.
* **VS Code:** Open the root folder and ensure the *Java Extension Pack* is installed.

### 2. Configure the Classpath (CRITICAL)
This project requires the **MySQL JDBC Driver** to connect to the database. You must link the external library:
* Locate the `.jar` files inside the `Libraries/` folder included in this repository.
* Add these JAR files to your project's dependencies/libraries patch inside your chosen IDE:
  * **NetBeans:** Right-click Project > `Properties` > `Libraries` > `Add JAR/Folder`.
  * **IntelliJ:** `File` > `Project Structure` > `Modules` > `Dependencies` > `+` > `JARs or Directories`.
  * **VS Code:** Expand the `Java Projects` panel on the sidebar > Scroll to `Referenced Libraries` > Click `+`.

### 3. Run the App
Locate the main Java file containing the `public static void main(String[] args)` method (usually your main login or dashboard JFrame frame) inside the `src/` directory, right-click it, and select **Run**.

