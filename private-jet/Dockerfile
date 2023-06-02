# Use a base image with JDK 8
FROM adoptopenjdk:11-jdk-hotspot

# Set the working directory
WORKDIR /app

# Copy the Gradle project files to the container
COPY build.gradle .
COPY src ./src
COPY settings.gradle .

# Copy the Gradle wrapper files
COPY gradlew .
COPY gradle ./gradle

# Grant execution permissions to the Gradle wrapper script
RUN chmod +x gradlew


COPY src/test/resources/dependencies.gradle src/test/resources/

# Copy the entire project (excluding the build directory)
COPY . .

# Run the Gradle tests
CMD ["./gradlew", "--no-daemon", "--console=plain", "--quiet", "runTests"]