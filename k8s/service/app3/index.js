const http = require('http');

const hostname = '0.0.0.0';
const port = 8080;

const server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/plain');
  res.end('Hello From NodeJS Container-3\n');
});

server.listen(port, hostname, () => {
  console.log(`Server3 running at http://${hostname}:${port}/`);
});