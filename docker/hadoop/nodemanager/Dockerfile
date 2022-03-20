FROM  hadoop-base:1.0

LABEL Description="This is NodeManager for Hadoop Cluster" \
      Author="Razumovskiy Dmitriy <diman-rraazz@mail.ru>"

HEALTHCHECK CMD curl -f http://localhost:8042/ || exit 1

ADD run.sh /run.sh
RUN chmod a+x /run.sh

EXPOSE 8042

CMD ["/run.sh"]
