#!/bin/bash

sum=0
for var in "$@"
do
    sum=`expr $sum + $var`
done
echo "SUM: $sum" 
