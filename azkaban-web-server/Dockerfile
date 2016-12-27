FROM daocloud.io/ld00000/jdk-8:0.4.0

COPY build/distributions/azkaban-web-server-*.tar.gz /opt/k2data/azkaban-web-server.tar.gz

WORKDIR /opt/k2data

RUN tar -xvzf azkaban-web-server.tar.gz
RUN mv azkaban-web-server-* azkaban-web-server
COPY build/distributions/conf /opt/k2data/azkaban-web-server/conf
#COPY build/distributions/extlib /opt/k2data/azkaban-web-server/extlib

WORKDIR /opt/k2data/azkaban-web-server

EXPOSE 8081

ENTRYPOINT bin/azkaban-web-start.sh
