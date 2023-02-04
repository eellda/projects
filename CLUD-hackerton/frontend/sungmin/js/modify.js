var tbody = document.querySelector("tbody");
// var ready = document.getElementById("ready");
// var doing = document.getElementById("doing");
// var clear = document.getElementById("clear");
var total = document.getElementById("total");
var values = location.href.split('?');

if (values.length != 2) {
    alert("회원 번호가 올바르지 않습니다.");
    throw "no 파라미터 값이 누락."; // 개발자를 위한 에러
} 

var values2 = values[1].split("=");

var no = parseInt(values2[1]);
values2[0] != 'no'
console.log(no);

if (values2.length != 2 || values2[0] != 'no') {
    alert("회원 번호가 올바르지 않습니다.");
    throw "no 파라미터 값이 누락.";
}

if (isNaN(no)) {
    alert("회원 번호가 올바르지 않습니다.");
    throw "no 파라미터 값이 숫자가 아닙니다.";
}

fetch(`http://localhost:8080/delivery/${no}`)
.then((response) => response.json())
.then((obj) => {

    if (obj == "failure") {
        alert("서버 요청 오류!");
        console.log(obj.data);
        return;
    }
    console.log(obj);
    
    document.querySelector('#d-name').value = obj.data.name;
    document.querySelector('#d-tel').value = obj.data.tel;
    document.querySelector('#d-addr').value = obj.data.addr;
    document.querySelector('#d-trackingNo').value = obj.data.trackingNo;
    document.querySelector('#d-paym').value = obj.data.paym;
    document.querySelector('#d-status').value = obj.data.status;
    document.querySelector('#d-msg').value = obj.data.msg;
})
.catch((err) => {
    alert("서버 요청 오류!!");
    console.log(err)
})

document.querySelector("#add-btn").onclick = (e) => {

  var trackingNo = document.querySelector("#d-trackingNo").value;
  var name = document.querySelector("#d-name").value;
  var tel = document.querySelector("#d-tel").value;
  var addr = document.querySelector("#d-addr").value;
  var paym = encodeURIComponent(document.querySelector("#d-paym").value);
  var status = encodeURIComponent(document.querySelector("#d-status").value);
  var msg = document.querySelector("#d-msg").value;

  
  //console.log(`no=${no}&name=${name}&tel=${tel}&addr=${addr}&paym=${paym}&status=${status}&msg=${msg}`);
  
  fetch(`http://localhost:8080/delivery/${no}`, {
      method: "PUT",
      headers: {
          'Content-type': 'application/x-www-form-urlencoded'
      },
      body: `trackingNo=${trackingNo}&name=${name}&tel=${tel}&addr=${addr}&paym=${paym}&status=${status}&msg=${msg}`
  })
  .then((response) => response.json())
  .then((obj) => {
      if (obj.status == "failure") {
      alert("배송 정보 변경 오류!\n" + obj.data);
      return;
      }
      location.href = "index.html";
  })
  .catch((err) => {
      alert("서버 요청 오류!");
      console.log(err);
  });
}

document.querySelector("#delete-btn").onclick = (e) => {

  fetch(`http://localhost:8080/delivery/${no}`, {
      method: 'DELETE'
  })
  .then((response) => response.json())
  .then((obj) => {
      if (obj.status == "failure") {
          alert("배송 정보 삭제 오류!\n" + obj.data);
          return;
      }
      location.href = "index.html";
  })
  .catch((err) => {
      alert("서버 요청 오류!");
      console.log(err);
  });
}

