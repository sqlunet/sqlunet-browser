#!/bin/bash

#
# Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
#

grep 'versionCode' gradle/libs.versions.toml | \
sed -r  's/[^0-9]*"([0-9]+).*/\1/'

