#!/usr/bin/env bash
set -e
set -u
set -o pipefail

mvn -DskipTests  -f ../hints/pom.xml spring-javaformat:apply clean install
mvn -X  -Pnative -DskipTests clean package
