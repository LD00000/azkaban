FROM daocloud.io/ld00000/jdk-8

COPY build/distributions/azkaban-exec-server-3.8.0-4-g4cfede7.tar.gz /opt/k2data/azkaban-exec-server.tar.gz

WORKDIR /opt/k2data

RUN tar -xvzf azkaban-exec-server.tar.gz

EXPORT 12321

ENTRYPOINT bin/azkaban-exec-start.sh
