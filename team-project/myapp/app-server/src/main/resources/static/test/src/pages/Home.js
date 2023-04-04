import { Link } from "react-router-dom";
import logo from "../img/logo.png";
import Instagram from "../img/Instagram.png";
import twitter from "../img/twitter.png";
import telegram from "../img/telegram.png";
import Discord from "../img/Discord.png";
import img1 from "../img/img1.png";
import check from "../img/vec.png";
import index from "./index.module.css";

const Home = () => {
  return (
    <div className={index.main}>
      <div className={index.container}>
        <div className={index.header}>
          <div className={index.headerHead}>
            <img src={logo} className={index.logo} alt="logo"></img>
            <p className={index.headerHeadP} id="logo">
              여긴 좋아
            </p>
          </div>
          <div className="header-middle">
            <form className="input-text">
              <input
                type="text"
                className={index.search}
                placeholder="Search Item More"
              />
            </form>
          </div>
          <div className={index.headerTail}>
            <ul className={index.headerTailUl}>
              <li className={index.signup} id="signup">
                {/* <Link to="/about">Create</Link> */}
              </li>
              <li className={index.login} id="login">
                {/* 로그인 */}
                <Link to="/about">Connect</Link>
              </li>
              <li className={index.logout} id="logout">
                <a href="app/auth/logout" onclick="logout(); return false;">
                  로그아웃(<span id="nickname"></span>)
                </a>
              </li>
            </ul>
          </div>
        </div>

        <div className={index.body}>
          <div className={index.cate}>
            <ul className={index.list}>
              <li className="hot-place">HOT 플레이스</li>
              <li className="board">
                <Link to="/board">커뮤니티</Link>
              </li>
            </ul>
            <ul className="listBest">
              <li className={index.listBestLi}>
                인기순
                <img src={check} className={index.checkv} alt="check" />
              </li>
            </ul>
          </div>
          <div>
            <ul className={index.mbox}>
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

        <div className={index.footer}>
          <div className={index.footerMain}>
            <div>
              <ul className={index.mainF}>
                <li className={index.ff}>
                  <img src={logo} className={index.logo} alt="logo"></img>
                  <span>여긴 좋아</span>
                </li>
                <li className={index.fs}>Get the lates Updates</li>
              </ul>
            </div>
            <div>
              <ul className={index.mainS}>
                <li className={index.sf}>가나다라</li>
                <li className={index.ss}>가나다</li>
              </ul>
            </div>
            <div>
              <ul className={index.mainT}>
                <li className={index.tf}>Support</li>
                <li className={index.ts}>Help center</li>
                <li className={index.tt}>Terms of service</li>
              </ul>
            </div>
          </div>
          <div className={index.footerTail}>
            <div className={index.footerTailLeft}>여긴 좋아,lnc.All Rights</div>
            <div className={index.footerTailRight}>
              <img src={Instagram} className={index.insta} alt="Instagram" />
              <img src={twitter} className={index.twi} alt="twitter" />
              <img src={telegram} className={index.tele} alt="telegram" />
              <img src={Discord} className={index.disc} alt="Discord" />
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Home;
