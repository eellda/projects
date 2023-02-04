var tbody = document.querySelector("tbody");
var tbody2 = document.getElementById("2");
var values = location.href.split('?');

function getStatus(status) {
  switch (status) {
    case 0: return "grey";
    case 1: return "orange";
    case 2: return "green";
    case 3: return "red"
    default: return "";
  }
}
function getStatus2(status) {
    switch (status) {
      case 0: return "배송준비";
      case 1: return "배송중";
      case 2: return "배송완료";
      case 3: return "배송불량"
      default: return "";
    }
}
function getPayMent(paym) {
  switch (paym) {
    case 0: return "무료배송";
    case 1: return "선불";
    case 2: return "착불";
    default: return "";
  }
}

if (values.length != 2) {

  throw "no 파라미터 값이 누락."; // 개발자를 위한 에러
} 

var values2 = values[1].split("=");

var no = parseInt(values2[1]);
values2[0] != 'no'
console.log(no);

if (values2.length != 2 || values2[0] != 'no') {

  throw "no 파라미터 값이 누락.";
}

if (isNaN(no)) {

  throw "no 파라미터 값이 숫자가 아닙니다.";
}

fetch(`http://localhost:8080/delivery/${no}`)
.then((response) => response.json())
.then((obj) => {

    if (obj == "failure") {

        console.log(obj.data);
        return;
    }

    tbody.innerHTML += 
      `<tr>
          <td>${obj.data.addr}</td>
          <td>${obj.data.name}</td>
          <td>${obj.data.tel}</td>
          <td>${obj.data.name}</td>
      </tr>`;
      tbody2.innerHTML += 
      `<tr>
          <td>${getPayMent(obj.data.paym)}</td>
          <td>${obj.data.trackingNo}</td>
          <td>${getStatus2(obj.data.status)}</td>
          <td>${"쿠팡"}</td>
      </tr>`;
    
  })
  .catch((err) => {

    console.log(err);
  });
  document.querySelector("#add-btn").onclick = ((e) => {
    location.href = "index.html";
  })



