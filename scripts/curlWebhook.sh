#!/usr/bin/env bash
curl -X POST http://github-webhook.local.pcfdev.io/ -d @/Users/marcingrzejszczak/repo/f2f/github-webhook/src/test/resources/github-webhook-input/issue-created.json \
--header "Content-Type: application/json"