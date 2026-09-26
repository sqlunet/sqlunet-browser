#!/bin/bash

#
# Copyright (c) 2026. Bernard Bou
#

#find . -name "artwork" -type d
find . \( -type d -o -type l \) -name "artwork*"
