FROM ubuntu:16.10
LABEL Description="Base image for BigData Cluster Nodes" \
      Author="Razumovskiy Dmitriy <diman-rraazz@mail.ru>"


RUN apt-get update && DEBIAN_FRONTEND=noninteractive apt-get install -y --no-install-recommends \
	build-essential \
        curl \
	git \
        less \
        nano \
        netcat \
	net-tools \
        software-properties-common \
        wget



RUN apt-get update && DEBIAN_FRONTEND=noninteractive apt-get install -y --no-install-recommends \
        openjdk-8-jdk

ENV JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64/

RUN add-apt-repository ppa:jonathonf/python-3.6
RUN apt-get update && DEBIAN_FRONTEND=noninteractive apt-get install -y --no-install-recommends \
	python3.6 \
	python3.6-dev \
	python3-pip \
	python3.6-venv


# update pip
RUN python3.6 -m pip install pip --upgrade
RUN python3.6 -m pip install wheel
