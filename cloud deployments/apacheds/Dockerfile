# cloud deployments/apacheds/Dockerfile
FROM apachedirectory/apacheds:2.0.0.AM26

# custom wrapper.conf with JAVA_HOME=/usr/lib/jvm/jdk1.7.0_80
COPY config/wrapper.conf /opt/apacheds/conf/wrapper.conf

# import Fortress schema
COPY ../fortress-core-2.0.0-RC1/ldap/schema/apacheds-fortress.ldif \
    /opt/apacheds/schema/apacheds-fortress.ldif

EXPOSE 389
# (Entrypoint already starts ApacheDS)
