FROM hive-base:1.0

LABEL Description="This is the  hive meta-store node for Hive Datawarehouse" \
      Author="Razumovskiy Dmitriy <diman-rraazz@mail.ru>"

COPY startup.sh /usr/local/bin/
RUN chmod +x /usr/local/bin/startup.sh

EXPOSE 10000
EXPOSE 10002

HEALTHCHECK CMD netstat -tuplen | grep 10000 || exit 1

CMD startup.sh
