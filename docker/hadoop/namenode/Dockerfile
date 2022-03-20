FROM hadoop-base:1.0
LABEL Description="This is the Name Node for Hadoop Cluster" \
      Author="Razumovskiy Dmitriy <diman-rraazz@mail.ru>"

HEALTHCHECK CMD curl -f http://localhost:50070/ || exit 1

ENV HDFS_CONF_dfs_namenode_name_dir=file:///hadoop/dfs/name

RUN mkdir -p /hadoop/dfs/name

VOLUME /hadoop/dfs/name

ADD run.sh /run.sh
RUN chmod a+x /run.sh

EXPOSE 50070

CMD ["/run.sh"]
