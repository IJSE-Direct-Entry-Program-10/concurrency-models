import express from 'express';

const app = express();
const router = express.Router();

router.get("/endpoint1", (req, res) => {
    let x = 0;
    for (let i = 0; i < 1000000; i++) {
        x += i * 5;
        console.log(x);
    }
    res.send(`<h1>${x}</h1>`);
});

router.get("/endpoint2", (req, res) => {
    res.send("<h1>I am so damn cool!</h1>");
});

app.use(router);
app.listen(8080, () => console.log("Server has been started at 8080"));