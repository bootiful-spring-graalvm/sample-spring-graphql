#!/usr/bin/env bash

mvn -f ../hints/pom.xml clean install && mvn -X  -Pnative -DskipTests clean package
