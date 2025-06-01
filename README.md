# khalidalseddiq-backend

- Start MySQL Server with this Command
- `brew services start mysql` log in to the MySQL or MariaDB command-line client as the root user. Breakdown:mysql: Starts the MySQL command-line tool. -u root: Specifies the username, in this case, root -p: Prompts you to enter the password for the user root. Then Enter password: .. . ou can run SQL commands like: SHOW DATABASES;
  USE your_database;
  SELECT * FROM your_table;



-  Unix/Linux systems to find processes related to MySQL that are using network connections.
- `lsof -i | grep mysql` lsof -i: Lists all open internet (network) connections. This includes TCP and UDP ports, showing which processes are using them. grep mysql: Filters the output to show only lines that contain the word mysql.
- 
