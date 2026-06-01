===========================================================
PROJECT NAME: Employee Payroll System (G3)
===========================================================

SYSTEM REQUIREMENTS:
1. XAMPP (Apache & MySQL started)
2. Java JDK 8 or higher
3. NetBeans IDE

-----------------------------------------------------------
DATABASE SETUP (CRITICAL):
-----------------------------------------------------------
1. Open XAMPP and start MySQL.
2. Go to http://localhost/phpmyadmin in your browser.
3. Click the "SQL" tab at the top.
4. Copy and paste the following code to create the database:

CREATE DATABASE IF NOT EXISTS payroll_db;
USE payroll_db;

CREATE TABLE IF NOT EXISTS employees (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(100) DEFAULT NULL,
  base_salary double DEFAULT NULL,
  allowance double DEFAULT NULL,
  deduction double DEFAULT NULL,
  net_salary double DEFAULT NULL,
  PRIMARY KEY (id)
);

or you can just import the database sql file from the folder 
\Documents\JavaProject_G3
-----------------------------------------------------------
HOW TO RUN THE PROJECT:
-----------------------------------------------------------
1. Open NetBeans.
2. File > Open Project > Select the "Employ_Payroll" folder.
3. Right-click the project > Properties > Libraries.
4. Ensure the JAR files in the /Libraries folder are linked.
5. Right-click the project and select "Run".

===========================================================