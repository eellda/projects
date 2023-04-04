import { Link } from "react-router-dom";
import logo from "../img/logo.png";
import Instagram from "../img/Instagram.png";
import twitter from "../img/twitter.png";
import telegram from "../img/telegram.png";
import Discord from "../img/Discord.png";
import "./index.css";
import "./prac.css";

const Login = () => {
  return (
    <div className="container">
      <div className="header">
        <div className="header-head">
          <img src={logo} className="logo" alt="logo"></img>
          <p id="logo">
            <Link to="/">여긴 좋아</Link>
          </p>
        </div>
        <div className="header-middle">
          <form className="input-text">
            <input
              type="text"
              className="search"
              placeholder="Search Item More"
            />
          </form>
        </div>
        <div className="header-tail">
          <ul>
            <li className="signup" id="signup">
              <Link to="/insert">Create</Link>
            </li>
            <li className="login" id="login">
              {/* 로그인 */}
              {/* <Link to="/about">Connect</Link> */}
            </li>
            <li className="logout" id="logout">
              <a href="app/auth/logout" onclick="logout(); return false;">
                로그아웃(<span id="nickname"></span>)
              </a>
            </li>
          </ul>
        </div>
      </div>

      <div className="body">
        <div class="wrapper">
          <div class="form-box">
            <h2>insert</h2>
            <form action="#">
              <div class="input-box">
                <span class="icon">🐣</span>
              </div>
              <div class="input-box">
                <span class="icon">🦄</span>
              </div>
            </form>
          </div>
        </div>
      </div>

      <div className="footer">
        <div className="footer-main">
          <div>
            <ul className="main-f">
              <li className="f-f">
                <img src={logo} className="logo" alt="logo"></img>
                <span>여긴 좋아</span>
              </li>
              <li className="f-s">Get the lates Updates</li>
            </ul>
          </div>
          <div>
            <ul className="main-s">
              <li className="s-f">가나다라</li>
              <li className="s-s">가나다</li>
            </ul>
          </div>
          <div>
            <ul className="main-t">
              <li className="t-f">Support</li>
              <li className="t-s">Help center</li>
              <li className="t-t">Terms of service</li>
            </ul>
          </div>
        </div>
        <div className="footer-tail">
          <div className="footer-tail-left">여긴 좋아,lnc.All Rights</div>
          <div className="footer-tail-right">
            <img src={Instagram} className="insta" alt="Instagram" />
            <img src={twitter} className="twi" alt="twitter" />
            <img src={telegram} className="tele" alt="telegram" />
            <img src={Discord} className="disc" alt="Discord" />
          </div>
        </div>
      </div>
    </div>
  );
};

export default Login;
