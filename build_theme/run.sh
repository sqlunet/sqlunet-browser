#!/usr/bin/bash

#
# Copyright (c) 2026. Bernard Bou
#

#echo "$@" >&2
java -cp material_builder.jar com.bbou.material.builder.MainKt "$@"
exit $?