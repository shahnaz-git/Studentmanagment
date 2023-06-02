# Fetching latest version of Java
#FROM openjdk:8-jdk-alpine
#FROM openjdk:17-alpine
FROM openjdk:17-oracle
# Setting up work directory
WORKDIR /app

# Copy the jar file into our app
COPY ./target/*.jar /app/app.jar

#copy gcp key
#COPY ./GcsKey/achievers-one-1fdb21f92e43.json /app/gcp_credentials.json

#ARG value=`cat /app/gcp_credentials.json`


#setting env variable
#RUN echo $PATH
#ENV GOOGLE_APPLICATION_CREDENTIALS=/app/gcp_credentials.json
#RUN echo $GOOGLE_APPLICATION_CREDENTIALS


# Exposing port 8080
EXPOSE 8080

# Starting the application
CMD ["java", "-jar", "app.jar"]
