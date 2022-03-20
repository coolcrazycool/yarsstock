FROM redis

LABEL Description="This is the redis DB used for bigdata cluster frameworks;E.g:Celery Backend etc.." \
      Author="Razumovskiy Dmitriy <diman-rraazz@mail.ru>"

COPY healthcheck.sh /usr/local/bin/
RUN chmod +x /usr/local/bin/healthcheck.sh


HEALTHCHECK CMD ["healthcheck.sh"]