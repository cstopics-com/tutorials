#!/bin/bash
FILE="helloo.sh"
if ! [ -e "$FILE" ]
  then
     echo "$FILE does not exist"
fi
if [ -w "$FILE" ]
  then
    echo "You have permission to edit $FILE"
  else
    echo "You do not have permissions to edit $FILE"
fi
