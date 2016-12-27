FROM daocloud.io/ld00000/jdk-8:0.6.0

COPY build/distributions/azkaban-exec-server-*.tar.gz /opt/k2data/azkaban-exec-server.tar.gz

WORKDIR /opt/k2data

RUN tar -xvzf azkaban-exec-server.tar.gz
RUN mv azkaban-exec-server-* azkaban-exec-server

WORKDIR /opt/k2data/azkaban-exec-server

COPY conf conf

EXPOSE 12321

CMD bin/azkaban-executor-start.sh
