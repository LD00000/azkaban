FROM daocloud.io/ld00000/jdk-8:0.6.0
MAINTAINER <lidong9144@163.com>

COPY build/distributions/azkaban-web-server-*.tar.gz /opt/k2data/azkaban-web-server.tar.gz

WORKDIR /opt/k2data

RUN tar -xvzf azkaban-web-server.tar.gz
RUN mv azkaban-web-server-* azkaban-web-server

WORKDIR /opt/k2data/azkaban-web-server

RUN mkdir logs
COPY conf/conf conf
#COPY plugins plugins
COPY conf/log4j.properties log4j.properties

#COPY entrypoint.sh entrypoint.sh
#
#RUN chmod +x /opt/k2data/azkaban-exec-server/entrypoint.sh

EXPOSE 8081

#ENTRYPOINT ["./entrypoint.sh"
CMD ["bin/start-web.sh"]
