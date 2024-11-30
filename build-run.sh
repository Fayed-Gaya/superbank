#!/bin/bash

# Build the project
./gradlew build

# Build the Docker image
docker build -t superbank .

# Stop any running containers (if they exist)
docker stop superbank-container || true

# Remove the old container (if it exists)
docker rm superbank-container || true

# Run the Docker container
docker run --name superbank-container -p 8080:8080 superbank
