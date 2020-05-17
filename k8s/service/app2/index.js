const http = require('http');

const hostname = '0.0.0.0';
const port = 8080;

const server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/plain');
  res.end('Hello From NodeJS Container-2\n');
});

server.listen(port, hostname, () => {
  console.log(`Server2 running at http://${hostname}:${port}/`);
});