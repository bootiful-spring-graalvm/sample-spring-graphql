#!/usr/bin/env bash
set -e
set -u
set -o pipefail

./mvnw -Pnative -DskipTests native:compile