#!/bin/bash

IFS="/"
PATH=$PWD
j=0
for field in $PATH; do
    if((j > 0)); then
      for(( i=1; i<=j; i++ ))
      do
        echo -n " "
      done
      echo -n "|-"
    fi
    echo $field
    let j=j+${#field}+1
done
