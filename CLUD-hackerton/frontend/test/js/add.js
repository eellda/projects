var tbody = document.querySelector("tbody");
var ready = document.getElementById("ready");
var doing = document.getElementById("doing");
var clear = document.getElementById("clear");
var total = document.getElementById("total");

fetch('http://localhost:8080/delivery')
  .then((response) => {return response.json();})
  .then((obj) => {

    total.innerText += `${obj.data.length}`;
    console.log(obj.data);

    for (var d of obj.data) {
      
    }
  })
  .catch((err) => {

    console.log(err);
});



document.querySelector("#add-btn").onclick = (e) => {

  var trackingNo = document.querySelector("#d-trackingNo").value;
  var name = document.querySelector("#d-name").value;
  var tel = document.querySelector("#d-tel").value;
  var addr = document.querySelector("#d-addr").value;
  var paym = encodeURIComponent(document.querySelector("#d-paym").value);
  var status = encodeURIComponent(document.querySelector("#d-status").value);
  var msg = document.querySelector("#d-msg").value;

  
  //console.log(`no=${no}&name=${name}&tel=${tel}&addr=${addr}&paym=${paym}&status=${status}&msg=${msg}`);
  
  fetch('http://localhost:8080/delivery', {
      method: "POST",
      headers: {
          'Content-type': 'application/x-www-form-urlencoded'
      },
      body: `trackingNo=${trackingNo}&name=${name}&tel=${tel}&addr=${addr}&paym=${paym}&status=${status}&msg=${msg}`
  })
  .then((response) => {return response.json();})
  .then((obj) => {
      location.href = "index.html";
  })
  .catch((err) => {

      console.log(err);
  });
  
}

document.querySelector("#cancel-btn").onclick = ((e) => {
  location.href = "index.html";
});