#!/bin/bash

# Stop and remove the containers
docker-compose down

# Rebuild the project and containers
./gradlew clean build

# Start the containers fresh
docker-compose up --build -d

# Apply flyway migrations
./gradlew flywayMigrate
