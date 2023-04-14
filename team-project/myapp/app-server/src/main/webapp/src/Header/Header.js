import React, { useState } from "react";
import './header.css';
import { Link } from "react-router-dom";


function Header() {

  // fetch("http://localhost:8080/web/auth/user")
  // .then((response) => {
  //   return response.json();
  // })
  // .then((result) => {
  //   console.log(result.status);
  //   if (result.status == "success") {
  //     document.querySelector("#nickname").innerHTML = result.data.nickname;
  //     // document.querySelector(".logout").classList.remove("logout");
  //   } else {
  //     const loginEl = document.querySelector(".login");
  //     if (loginEl) {
  //       loginEl.classList.remove("login");
  //     }
      
  //   }
  // })
  // .catch((exception) => {
  //   console.log(exception);
  //   alert("로그인 사용자 정보 조회 오류!");
  // });

  function logout() {
    fetch("http://localhost:8080/web/auth/logout")
      .then((response) => {
        return response.json();
      })
      .then((result) => {
        // location.reload();
      })
      .catch((exception) => {
        console.log(exception);
      });
  }

    return (
      <div className="header">
          <div className="header-head">
              <Link to='/Main' style={{ textDecoration: "none" }}><p><img src='img/logo.png' className='logo'></img></p></Link>
              <Link to='/Main' style={{ textDecoration: "none" }}><p className="logo-text">여기 어때</p></Link>
          </div>
          <div className="header-body">
            <input type='text' className="search" placeholder="Search Item More"
            style={{
              background: 'url(img/search.png)',
              backgroundRepeat: 'no-repeat',
              backgroundSize: '28px',
              backgroundPosition: '20px center'
              }}>
            </input>
          </div>
          <div className="header-tail">
            <ul>
              <Link to='/Sign' style={{ textDecoration: "none" }}><li className="signup" id="signup">Create</li></Link>
              <Link to='/Login' style={{ textDecoration: "none" }}><li className="login" id="login">Connect</li></Link>
              <li className="logout" id="logout">
              <a href="app/auth/logout" onclick="logout(); return false;">
                  로그아웃(<span id="nickname"></span>)</a>
              </li>
            </ul>
          </div>
      </div>
    );
  }
  
  export default Header;