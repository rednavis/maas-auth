[![Build Status](https://travis-ci.com/rednavis/maas-auth.svg?branch=master)](https://travis-ci.com/rednavis/maas-auth)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/fa83a31b0342405abde873124f3b3074)](https://www.codacy.com/gh/rednavis/maas-auth?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=rednavis/maas-auth&amp;utm_campaign=Badge_Grade)
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