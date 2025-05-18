# cloud deployments/fortress/Dockerfile
FROM tomcat:8.5.20-jre8

USER root

# 1) Install only needed OS packages & clean up
RUN set -eux; \
    apt-get update; \
    apt-get install -y --no-install-recommends \
    ca-certificates \
    curl \
    bzip2 \
    unzip \
    xz-utils; \
    rm -rf /var/lib/apt/lists/*

# 2) Ensure UTF-8 locale
ENV LANG=C.UTF-8 \
    LANGUAGE=C.UTF-8 \
    LC_ALL=C.UTF-8

# 3) Overlay your custom catalina script
COPY catalina /usr/local/tomcat/bin/catalina.sh
RUN chmod +x /usr/local/tomcat/bin/catalina.sh

# 4) Add the Fortress realm-proxy JAR into Tomcat’s lib
COPY fortress-realm-proxy-2.0.3-RC1.jar \
    /usr/local/tomcat/lib/fortress-realm-proxy.jar

# 5) Deploy the two web apps
COPY fortress-rest.war \
    /usr/local/tomcat/webapps/fortress-rest.war
COPY fortress-web.war \
    /usr/local/tomcat/webapps/fortress-web.war

# 6) Use your tomcat-users.xml for manager GUI / realm config
COPY tomcat-users.xml \
    /usr/local/tomcat/conf/tomcat-users.xml

# 7) Drop back to Tomcat’s unprivileged user
USER tomcat

# 8) Expose HTTP and launch Tomcat
EXPOSE 8080
ENTRYPOINT ["catalina.sh", "run"]
