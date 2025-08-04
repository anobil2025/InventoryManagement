\# Inventory Management System



\## Overview

This is a Java-based console application for managing an inventory of electronic products, including smartphones, tablets, and laptops. The system allows users to:

\- View all products in the inventory.

\- Add new products (Smartphone, Tablet, or Laptop).

\- Remove products by name.

\- Display products with low stock (quantity ≤ 10).

\- Display high-priced products (price ≥ $1000).

\- Sort products by name or price.



The project uses object-oriented programming principles, with a `Product` superclass and subclasses `Smartphone`, `Tablet`, and `Laptop`, stored in an `ArrayList<Product>`.



\## Project Structure

&nbsp;    InventoryManagement/

&nbsp;    ├── src/

&nbsp;    │   └── com/

&nbsp;    │       └── company/

&nbsp;    │           ├── Product.java

&nbsp;    │           ├── Smartphone.java

&nbsp;    │           ├── Tablet.java

&nbsp;    │           ├── Laptop.java

&nbsp;    │           └── Main.java

&nbsp;    ├── .gitignore

&nbsp;    └── README.md

&nbsp;    ```



&nbsp;    ## Prerequisites

&nbsp;    - \*\*Java Development Kit (JDK)\*\*: Version 8 or higher.

&nbsp;    - \*\*IDE or Compiler\*\*: IntelliJ IDEA, Eclipse, or `javac` for compiling and running the code.

&nbsp;    - \*\*Git\*\*: To clone or manage the repository.



&nbsp;    ## Setup Instructions

&nbsp;    1. \*\*Clone the Repository\*\*:

&nbsp;       ```bash

&nbsp;       git clone https://github.com/anobil2025/InventoryManagement.git

&nbsp;       cd InventoryManagement

&nbsp;       ```

&nbsp;    2. \*\*Compile the Code\*\*:

&nbsp;       - If using an IDE, import the project and build it.

&nbsp;       - For command-line compilation:

&nbsp;         ```bash

&nbsp;         javac src/com/company/\*.java

&nbsp;         ```

&nbsp;    3. \*\*Run the Application\*\*:

&nbsp;       ```bash

&nbsp;       java -cp src com.company.Main

&nbsp;       ```



&nbsp;    ## Usage

&nbsp;    1. Run the program to access the interactive menu.

&nbsp;    2. Choose options (1-7) to:

&nbsp;       - \*\*1\*\*: View all products with details (name, price, quantity, and type-specific attributes like color, type, or RAM).

&nbsp;       - \*\*2\*\*: Add a new product by specifying its type (Smartphone, Tablet, or Laptop) and details.

&nbsp;       - \*\*3\*\*: Remove a product by entering its name (case-insensitive).

&nbsp;       - \*\*4\*\*: View products with low stock.

&nbsp;       - \*\*5\*\*: View high-priced products.

&nbsp;       - \*\*6\*\*: Sort products by name or price.

&nbsp;       - \*\*7\*\*: Exit the program.



&nbsp;    ## Example

&nbsp;    ```

&nbsp;    =========================Choose from the Menu=================

&nbsp;    1- View all products

&nbsp;    2- Add new product

&nbsp;    3- Remove a product

&nbsp;    4- Show low stock products

&nbsp;    5- Show high price products

&nbsp;    6- Sort the products

&nbsp;    7- Exit

&nbsp;    1

&nbsp;    Smartphone - Name: Mi12, Price: 600.0, Quantity: 100, Color: red

&nbsp;    Smartphone - Name: Iphone 16, Price: 20000.0, Quantity: 3, Color: silver

&nbsp;    Tablet - Name: TabAs10, Price: 750.0, Quantity: 80, Type: big

&nbsp;    Tablet - Name: Ipad 15, Price: 10000.0, Quantity: 4, Type: small

&nbsp;    Laptop - Name: Macbook, Price: 50000.0, Quantity: 2, RAM: 8

&nbsp;    Laptop - Name: Lenovo, Price: 650.0, Quantity: 10, RAM: 2

&nbsp;    ```



&nbsp;    ## Future Improvements

&nbsp;    - Add a GUI for a more user-friendly interface.

&nbsp;    - Implement file-based persistence to save/load inventory data.

&nbsp;    - Add search functionality by additional criteria (e.g., color or RAM).

&nbsp;    - Support updating existing products.



&nbsp;    ## Contributing

&nbsp;    Feel free to fork this repository, submit pull requests, or open issues for bugs or feature suggestions.



&nbsp;    ## License

&nbsp;    This project is unlicensed. Feel free to use and modify it as needed.

&nbsp;    ```



