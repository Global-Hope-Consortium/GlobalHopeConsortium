-- Create role if not exists
DO
$$
BEGIN
   IF NOT EXISTS (
      SELECT FROM pg_catalog.pg_roles
      WHERE rolname = 'Immaculate') THEN

      CREATE ROLE Immaculate WITH LOGIN PASSWORD 'Website24#';
   END IF;
END
$$;

-- Create database if not exists
DO
$$
BEGIN
   IF NOT EXISTS (
      SELECT FROM pg_database
      WHERE datname = 'global_hope') THEN

      CREATE DATABASE global_hope;
   END IF;
END
$$;

-- Grant privileges
GRANT ALL PRIVILEGES ON DATABASE global_hope TO Immaculate;

-- Create tables for your application
CREATE TABLE IF NOT EXISTS users (
  id SERIAL PRIMARY KEY,
  username VARCHAR(100) NOT NULL,
  password VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS transport (
  id SERIAL PRIMARY KEY,
  vehicle_type VARCHAR(100),
  availability_status VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS electronics (
  id SERIAL PRIMARY KEY,
  product_name VARCHAR(100),
  condition VARCHAR(50)
);