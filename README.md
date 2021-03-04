# Setup
1. Create directory: C:\Users\USERNAME\databene
2. Select build.xml in Project Explorer
...*Right-click and select Run As
...*Select "1 Ant Build"

![plot](./img/successful_build.png)

3. Verify everything is running properly by executing the test
...*Select src/test/java in Project Explorer
...*Right-click and select Run As
...*Select "JUnit Test"

![plot](./img/successful_tests.png)

# Artifacts
1. Comment in Main.java says it retrieves meta data from a database and prints it to the console in a tree structure.
2. Comment in DBUtil.java says it provides database utility methods.
3. Comment in QueryDataIterator.java says it's DataIterator method provides results of a SQL query.
4. Comment in SQLUtil.java says it provides methods for creating SQL queries and commands.
5. Several comments refer to JDBC databases (Java Database Connectivity) so it must be for use with them.

Overall it seems the code provides various utilities related to JDBC databases. It has utilites for creating SQL commands and queries, connecting to databases, retrieving metadata, and parsing SQL queries. It has various tests for various SQL dialects such as SQL Server, Firebird, Postgre SQL, Oracle, and HSQL.