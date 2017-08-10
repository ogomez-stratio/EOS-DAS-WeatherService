FROM frolvlad/alpine-oraclejdk8:slim

VOLUME /tmp

ADD dasWeatherService-1.0-SNAPSHOT.jar dasWeatherService.jar

RUN touch dasWeatherService.jar

ENV JAVA_OPTS="-Xmx512m -Xms256m"

ENTRYPOINT ["bash", "java -jar /dasWeatherService.jar $JAVA_OPTS " ]

