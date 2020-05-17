#!/bin/bash
function file_count()
 {
   local Directory=$1
   COUNT_FILE=$(ls $Directory|wc -l)
   echo "$Directory"
   echo "$COUNT_FILE"
 }
file_count /etc
file_count /var
file_count /usr/bin
