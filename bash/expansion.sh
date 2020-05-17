#!/bin/bash

url='https://guide.guru.plusplus/variables.html'

echo $url
echo "--------------------------------------------"
echo "${url#*/}"
echo "${url##*/}"
echo "${url%/*}"
echo "${url%%/*}"
echo "${url/./-}"
echo "${url//./-}"
echo "${url/#*:/https:}"
echo "${url/%.html/.jpg}"
echo "${#url}"
echo "${url:7}"
echo "${url^^[ht]}"


