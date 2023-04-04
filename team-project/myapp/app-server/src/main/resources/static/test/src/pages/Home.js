import { Link } from "react-router-dom";
import logo from "../img/logo.png";
import Instagram from "../img/Instagram.png";
import twitter from "../img/twitter.png";
import telegram from "../img/telegram.png";
import Discord from "../img/Discord.png";
import img1 from "../img/img1.png";
import check from "../img/vec.png";
import "./index.css";

const Home = () => {
  return (
    <div className="container">
      <div className="header">
        <div className="header-head">
          <img src={logo} className="logo" alt="logo"></img>
          <p id="logo">여긴 좋아</p>
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
              {/* <Link to="/about">Create</Link> */}
            </li>
            <li className="login" id="login">
              {/* 로그인 */}
              <Link to="/about">Connect</Link>
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
        <div className="cate">
          <ul className="list">
            <li className="hot-place">HOT 플레이스</li>
            <li className="board">
              <Link to="/board">커뮤니티</Link>
            </li>
          </ul>
          <ul className="list-best">
            <li>
              인기순
              <img src={check} className="checkv" alt="check" />
            </li>
          </ul>
        </div>
        <div>
          <ul className="mbox">
            <li>
              <img src={img1} alt="img1" />
            </li>
            <li>
              <img src={img1} alt="img1" />
            </li>
            <li>
              <img src={img1} alt="img1" />
            </li>
            <li>
              <img src={img1} alt="img1" />
            </li>
            <li>
              <img src={img1} alt="img1" />
            </li>
            <li>
              <img src={img1} alt="img1" />
            </li>
            <li>
              <img src={img1} alt="img1" />
            </li>
            <li>
              <img src={img1} alt="img1" />
            </li>
          </ul>
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

export default Home;
