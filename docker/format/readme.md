

$ docker system info --format 'There are {{.Containers}} containers'
There are 32 containers


$ docker container ls -a --format 'table {{.ID}}\t{{.Image}}\t{{.Command}}\t{{.Status}}'
CONTAINER ID        IMAGE                             COMMAND                  STATUS
b213c64c192a        busybox                           "sh -c 'while true; …"   Exited (255) 23 minutes ago
970631001c64        busybox                           "sh -c"                  Exited (2) 7 days ago


$ docker container stats --no-stream --format 'table {{.CPUPerc}}\t{{.MemPerc}}\t{{.NetIO}}\t{{.Name}}'
CPU %               MEM %               NET I/O             NAME
0.00%               0.04%               1.03kB / 0B         checktime

