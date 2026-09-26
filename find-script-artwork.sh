#!/bin/bash

#
# Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
#

export scripts=`find . -mindepth 2 -not -path '*/artwork-relations/*' -not -path '*/reference/*' -name 'make-artwork.sh'`
if [ "-echo" == "$1" ]; then
  echo ${scripts}
fi