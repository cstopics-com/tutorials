FROM nginx AS prod
COPY index.html /usr/share/nginx/html/

FROM prod AS test
COPY index-test.html /usr/share/nginx/html/

