#!/bin/sh
#
# cloud deployments/apacheds/apacheds.sh
# Entrypoint for ApacheDS in Docker

set -eux

APACHEDS_HOME=/opt/apacheds
REAL_CMD="${APACHEDS_HOME}/bin/apacheds"

usage() {
  cat <<EOF >&2
Usage: $(basename "$0") {start|stop|status} [options]

  start   — launch the ApacheDS daemon
  stop    — gracefully shut it down
  status  — report running status
EOF
  exit 1
}

# require at least one argument
[ $# -ge 1 ] || usage

cmd="$1"; shift

case "$cmd" in
  start|stop|status)
    exec "$REAL_CMD" "$cmd" "$@"
    ;;
  *)
    echo "Error: unknown command '$cmd'" >&2
    usage
    ;;
esac
