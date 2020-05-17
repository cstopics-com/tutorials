#!/usr/bin/env bash
echo You are assigned to the following groups
for group in ${GROUPS[@]};do
        IFS=: 
	read -r name dummy number members < <(getent group $group )
        printf "Group-Name: %-10s Group-Number: %-15s \n" "$name" "$number"
done
