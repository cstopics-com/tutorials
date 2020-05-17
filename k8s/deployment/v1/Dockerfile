FROM alpine
RUN apk update && apk add nodejs
COPY . /app
WORKDIR /app
EXPOSE 8080
CMD ["node","index.js"]