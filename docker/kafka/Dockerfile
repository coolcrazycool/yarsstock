FROM bigdata-baseimg:1.0

LABEL Description="This is a image for kafka nodes" \
      Author="Razumovskiy Dmitriy <diman-rraazz@mail.ru>"

ENV SCALA_VERSION=2.13
ENV KAFKA_VERSION=3.1.0
ENV KAFKA_HOME /opt/kafka_"$SCALA_VERSION"-"$KAFKA_VERSION"

# Install Kafka and other needed things
RUN wget -q https://www.apache.org/dyn/closer.cgi?path=/kafka/"$KAFKA_VERSION"/kafka_"$SCALA_VERSION"-"$KAFKA_VERSION".tgz -O /tmp/kafka_"$SCALA_VERSION"-"$KAFKA_VERSION".tgz && \
    tar xfz /tmp/kafka_"$SCALA_VERSION"-"$KAFKA_VERSION".tgz -C /opt && \
    rm /tmp/kafka_"$SCALA_VERSION"-"$KAFKA_VERSION".tgz

ADD start-kafka.sh /usr/bin/start-kafka.sh
RUN chmod +x /usr/bin/start-kafka.sh

EXPOSE 9092

HEALTHCHECK --start-period=10s CMD netstat -tuplen | grep 9092 || exit 1

ENTRYPOINT ["/usr/bin/start-kafka.sh"]