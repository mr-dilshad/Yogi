# Use an official MySQL runtime as a parent image
FROM mysql:latest

# Set environment variables for MySQL
ENV MYSQL_ROOT_PASSWORD=root_password
ENV MYSQL_DATABASE=my_database
ENV MYSQL_USER=my_user
ENV MYSQL_PASSWORD=my_password

# Expose the MySQL port
EXPOSE 3306

# Copy a custom configuration file if needed (optional)
# COPY my_custom_config.cnf /etc/mysql/conf.d/

# Start MySQL when the container launches
CMD ["mysqld"]
