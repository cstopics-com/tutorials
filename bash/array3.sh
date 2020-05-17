#!/bin/bash
mapfile -t arr < $1
for line in "${arr[@]}"; do
  words=(${line//[!a-zA-Z0-9]/ })
  for aword in "${words[@]}"; do
     echo $aword
  done
done

