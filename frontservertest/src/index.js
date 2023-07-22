const express = require("express");

const cors = require("cors");
const bodyParser = require("body-parser");
const port = 8080;
const main = async () => {
  const app = express();
  app.use(cors());

  app.use(bodyParser.urlencoded({ extended: true }));
  app.use(bodyParser.json());

  app.listen(port, () => {
    console.log(`Listening on ${port}`);
  });
};

main();
