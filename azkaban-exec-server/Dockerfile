FROM daocloud.io/ld00000/jdk-8:0.6.0
MAINTAINER <lidong9144@163.com>

COPY build/distributions/azkaban-exec-server-*.tar.gz /opt/k2data/azkaban-exec-server.tar.gz

WORKDIR /opt/k2data

RUN tar -xvzf azkaban-exec-server.tar.gz
RUN mv azkaban-exec-server-* azkaban-exec-server

WORKDIR /opt/k2data/azkaban-exec-server

RUN mkdir logs
COPY conf/conf conf
COPY plugins plugins
COPY conf/log4j.properties log4j.properties

#COPY entrypoint.sh entrypoint.sh
#
#RUN chmod +x /opt/k2data/azkaban-exec-server/entrypoint.sh

EXPOSE 12321

#ENTRYPOINT ["./entrypoint.sh"
CMD ["bin/start-exec.sh"]
