FROM spark-base:1.0

LABEL Description="This is spark worker node" \
      Author="Razumovskiy Dmitriy <diman-rraazz@mail.ru>"

HEALTHCHECK CMD curl -f http://localhost:8081/ || exit 1

WORKDIR $SPARK_HOME

COPY worker.sh $SPARK_HOME
RUN chmod +x $SPARK_HOME/worker.sh

ENV SPARK_WORKER_WEBUI_PORT 8081
ENV SPARK_WORKER_LOG  /var/log/spark-worker

EXPOSE 8081

CMD ["./worker.sh"]
