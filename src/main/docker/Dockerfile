FROM frolvlad/alpine-oraclejdk8:slim

VOLUME /tmp

ADD das-weather-service-0.0.1-SNAPSHOT.jar das-weather-service.jar

RUN sh -c 'touch /das-weather-service.jar'

ENV JAVA_OPTS="-Xmx512m -Xms256m"

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /das-weather-service.jar" ]

