#!/bin/bash
echo "N:"
read N
for (( i=1; i<=N; i++ ))
do
    for (( j=1; j<=i;  j++ ))
    do
     echo -n " |"
    done
    echo "_ "
done

