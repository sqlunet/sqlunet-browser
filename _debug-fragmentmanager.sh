#!/bin/bash

#
# Copyright (c) 2026. Bernard Bou
#

# $1 DEBUG|VERBOSE
adb shell setprop log.tag.FragmentManager $1
adb shell getprop log.tag.FragmentManager