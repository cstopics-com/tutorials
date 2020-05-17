#!/bin/bash
echo "Foods:"
read foods
echo "Calories:"
read calories
fds=($foods)
cls=($calories)
declare -A fc
if ((${#foods[@]} == ${#calories[@]})); then
for ((idx=0; idx < ${#fds[@]}; ++idx)); do
	fc[${fds[$idx]}]=${cls[$idx]}
done
else
echo the number of first and last names must be equal
fi
sum=0
for key in "${!fc[@]}"; do
	echo "***********"
	echo "Food:   ${key}"
	echo "Calorie: ${fc[$key]}"
	sum=`expr $sum + ${fc[$key]}`
done
echo "***********"
echo "sum: $sum"
