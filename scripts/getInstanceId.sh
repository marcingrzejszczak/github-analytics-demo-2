#!/usr/bin/env bash
curl http://github-analytics.local.pcfdev.io/env | jq ".systemEnvironment.INSTANCE_GUID"