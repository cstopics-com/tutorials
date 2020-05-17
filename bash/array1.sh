#!/bin/bash
echo "First Names:"
read firstnames
echo "Last Names:"
read lastnames
fns=($firstnames)
lns=($lastnames)
if ((${#fns[@]} == ${#lns[@]})); then
echo "***********"
for ((idx=0; idx < ${#fns[@]}; ++idx)); do
	echo "${fns[$idx]} ${lns[$idx]}"
done
else
echo the number of first and last names must be equal
fi
