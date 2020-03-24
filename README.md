[![Build Status](https://travis-ci.com/rednavis/maas-sd.svg?branch=master)](https://travis-ci.com/rednavis/maas-sd)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/72614d9beef84d91b6825afa10c7074b)](https://www.codacy.com/gh/rednavis/maas-sd?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=rednavis/maas-sd&amp;utm_campaign=Badge_Grade)
[![codecov](https://codecov.io/gh/rednavis/maas-sd/branch/master/graph/badge.svg)](https://codecov.io/gh/rednavis/maas-sd)

# maas-auth

## Clone project

`git clone git@github.com:rednavis/maas-auth.git`

`cd mass-auth`

`git submodule update --init`

## Build project

`./gradlew clean build`

`./gradlew bootRun`

## Create dependency report

`./gradlew clean htmlDependencyReport`

## Update dependency

`./gradlew dependencyUpdates`

## Create docker image

`./gradlew clean bootJar jibDockerBuild`