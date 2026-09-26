#!/bin/bash

#
# Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
#

whereto=$1
whereto=`readlink -m "${whereto}"`

mkdir -p "${whereto}/images"
mkdir -p "${whereto}/relations/images"

for d in xnet wordnet verbnet propbank framenet bnc syntagnet; do
	./make-artwork.sh $d "${whereto}/images"
done

