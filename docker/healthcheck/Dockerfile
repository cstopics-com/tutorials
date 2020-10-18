FROM nginx
RUN apt-get update && apt-get install -y wget
COPY index.html /usr/share/nginx/html/
COPY system-status.html /usr/share/nginx/html/
HEALTHCHECK CMD wget -q --method=HEAD localhost/system-status.html