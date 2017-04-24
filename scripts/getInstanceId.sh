#!/usr/bin/env bash
curl -s http://github-analytics.local.pcfdev.io/env | jq ".systemEnvironment.INSTANCE_GUID"