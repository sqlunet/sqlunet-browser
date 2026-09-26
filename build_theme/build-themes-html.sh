#!/usr/bin/bash


#
# Copyright (c) 2026. Bernard Bou
#

source define_colors.sh

tasks="
xn
wn
vn
fn
sn
"

./convert_all_gpa.sh

all="$@"
if [ -z "$all"]; then
  all="${tasks}"
  fi
for m in ${all}; do
  seedsDay=${m}-day.txt
  seedsNight=${m}-night.txt
  echo -e "${bY}${K}${m}${Z}"

  ./build-theme-html.sh "$m" "$seedsDay" "$seedsNight"
done  
