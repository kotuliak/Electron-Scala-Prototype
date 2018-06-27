const fs = require('fs');
const path = require('path');

const fifoPath = path.resolve('/tmp/testpipe')

const fifo = fs.createReadStream(fifoPath);

fifo.on('data', data => {
	var dataString = data.toString();
	console.log(dataString);
	var p = document.getElementById("random");
	p.innerHTML = dataString;
});