#!/bin/bash
echo "Numbers:"
read numbers
nums=($numbers)
sum=0
for num in "${nums[@]}"; do
	sum=`expr $sum + $num`
done
echo "sum: $sum"
