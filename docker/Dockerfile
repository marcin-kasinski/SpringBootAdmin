FROM openjdk:9
MAINTAINER Marcin Kasiński <marcin.kasinski@gmail.com> 

RUN mkdir -p /usr/src/myapp/logs && touch /usr/src/myapp/logs/application.log

ADD start.sh /usr/src/myapp/start.sh
RUN sed -i -e 's/\r//g' /usr/src/myapp/start.sh &&\
chmod +x /usr/src/myapp/start.sh

COPY SpringBootAdmin-0.0.1-SNAPSHOT.jar /usr/src/myapp/SpringBootAdmin-0.0.1-SNAPSHOT.jar
WORKDIR /usr/src/myapp
EXPOSE 8080
ENTRYPOINT [ "/usr/src/myapp/start.sh" ]