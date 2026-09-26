#!/bin/bash

#
# Copyright (c) 2026. Bernard Bou
#

whereto=$1
whereto=`readlink -m "${whereto}"`

mkdir -p "${whereto}"
mkdir -p "${whereto}/relations"

for d in xnet wordnet verbnet propbank framenet bnc syntagnet; do
	./make-html.sh $d "${whereto}"
done
cp style.css ${whereto}
