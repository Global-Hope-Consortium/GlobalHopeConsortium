# Use the official PostgreSQL image as the base image
FROM postgres:14-alpine

# Copy the initialization script into the container
COPY init.sql /docker-entrypoint-initdb.d/

# Expose the default PostgreSQL port
EXPOSE 5432