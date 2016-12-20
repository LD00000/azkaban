FROM daocloud.io/ld00000/jdk-8

COPY build/distributions/azkaban-web-server-3.8.0-4-g4cfede7.tar.gz /opt/k2data/azkaban-web-server.tar.gz

WORKDIR /opt/k2data

RUN tar -xvzf azkaban-web-server.tar.gz

EXPORT 8443

ENTRYPOINT bin/azkaban-web-start.sh
