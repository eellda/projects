var tbody = document.querySelector("tbody");
var ready = document.getElementById("ready");
var doing = document.getElementById("doing");
var clear = document.getElementById("clear");
var total = document.getElementById("total");

var readyCount = 0;
var finishCount = 0;

// function getPayMent(paym) {
//   switch (paym) {
//     case 0: return "무료배송";
//     case 1: return "선불";
//     case 2: return "착불";
//     default: return "";
//   }
// }

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


// ready.innerText += `${d.status}`;
// doing.innerText += `${d.status}`;
// clear.innerText += `${d.status}`;

fetch('http://localhost:8080/delivery')
  .then((response) => {return response.json();})
  .then((obj) => {

    total.innerText += `${obj.data.length}`;
    console.log(obj.data);

    for (var d of obj.data) {
        tbody.innerHTML += 
            `<tr>
                <td>${d.addr}</td>
                <td>${d.name}</td>
                <td>
                    <span class="status ${getStatus(d.status)}"></span>
                    ${getStatus2(d.status)}
                </td>
                <td><a href="modify.html?no=${d.no}">${d.trackingNo}</td>
            </tr>`;
    }
  })
  .catch((err) => {
    alert("서버 요청 오류!");
    console.log(err);
});  
