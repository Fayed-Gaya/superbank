#!/bin/bash

# Build the project
./gradlew build

# Build the Docker images and start the containers using Docker Compose
docker-compose up --build -d
