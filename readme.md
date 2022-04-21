# Jekyll Post Generator
A small program which can generate empty file for jekyll's post.

## Jekyll post schema

```text
---
layout: post
title: "your post name"
date: 2021-03-10 15:51:00
update:
location:
tags: your tag
categories:
seo_description:
seo_image:
comments: true
---
```

## Requirement
- Java: 1.8.0
- Gradle: 7.3

## How to build

```sh
# project root
./gradlew --configure-on-demand -x check build
```

```sh
# Example output
➜ Jekyll-Post-Generator (develop) ✗ ./gradlew --configure-on-demand -x check build
Configuration on demand is an incubating feature.

BUILD SUCCESSFUL in 764ms
5 actionable tasks: 5 up-to-date
```

An executable jar file would be created at `Jekyll-Post-Generator/app/build/libs`

## How to run
```sh
java -jar jekyll-post-generator-2.2.0.jar
```
