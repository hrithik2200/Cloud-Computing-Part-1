# cloud deployments/fortress/Dockerfile

# 1) Builder stage
FROM maven:3.6-jdk-7 AS builder
WORKDIR /build

COPY fortress-core-2.0.0-RC1 /build/fortress-core
RUN cd fortress-core \
    && cp build.properties.example build.properties \
    && mvn clean install -Dload.file=./ldap/setup/refreshLDAPData.xml

COPY fortress-rest-2.0.0-RC1 /build/fortress-rest
RUN cd fortress-rest && mvn clean package

COPY fortress-web-2.0.0-RC1 /build/fortress-web
RUN cd fortress-web \
    && cp ../fortress-core/config/fortress.properties src/main/resources/ \
    && mvn clean package

# 2) Runtime stage
FROM tomcat:8.5.11-jre7
LABEL app=fortress

# overlay manager users
COPY config/tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml

# realm proxy
COPY --from=builder /build/fortress-core/fortress-realm-proxy/target/fortress-realm-proxy-2.0.0-RC1.jar \
    /usr/local/tomcat/lib/

# deploy WARs
COPY --from=builder /build/fortress-rest/target/fortress-rest.war \
    /usr/local/tomcat/webapps/fortress-rest.war
COPY --from=builder /build/fortress-web/target/fortress-web.war \
    /usr/local/tomcat/webapps/fortress-web.war

EXPOSE 8080
