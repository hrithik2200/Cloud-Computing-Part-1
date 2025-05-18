# cloud deployments/apacheds/Dockerfile
FROM apachedirectory/apacheds:2.0.0.AM26

USER root

# 1) Install OS packages & clean up in one layer
RUN set -eux; \
    apt-get update; \
    apt-get install -y --no-install-recommends \
    ca-certificates \
    bzip2 \
    unzip \
    xz-utils; \
    rm -rf /var/lib/apt/lists/*

# 2) Force UTF-8 locale
ENV LANG=C.UTF-8 \
    LANGUAGE=C.UTF-8 \
    LC_ALL=C.UTF-8

# 3) Copy configs and schema
COPY config/wrapper.conf \
    /opt/apacheds/conf/wrapper.conf

COPY ../fortress-core-2.0.0-RC1/ldap/schema/apacheds-fortress.ldif \
    /opt/apacheds/schema/apacheds-fortress.ldif

# 4) Copy and enable our entrypoint script
COPY apacheds.sh \
    /opt/apacheds/bin/apacheds.sh

RUN chmod +x /opt/apacheds/bin/apacheds.sh

# 5) Drop privileges
USER apacheds

# 6) Expose LDAP port & launch via our script
EXPOSE 389
ENTRYPOINT ["/opt/apacheds/bin/apacheds.sh", "start", "--root"]
