#!/bin/bash

#
# Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
#

#find . -name "artwork" -type d
find . \( -type d -o -type l \) -name "artwork*"
