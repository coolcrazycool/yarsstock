FROM  airflow-base:1.0

LABEL Description="This is a Apache Airflow Worker node" \
      Author="Razumovskiy Dmitriy <diman-rraazz@mail.ru>"

COPY startup.sh /usr/local/bin/
RUN chmod +x /usr/local/bin/startup.sh

HEALTHCHECK --start-period=10s CMD netstat -tuplen | grep 8793 || exit 1

USER airflow
WORKDIR ${AIRFLOW_HOME}

ENTRYPOINT ["/usr/local/bin/startup.sh"]
