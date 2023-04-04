import { Link } from "react-router-dom";
import logo from "../img/logo.png";
import Instagram from "../img/Instagram.png";
import twitter from "../img/twitter.png";
import telegram from "../img/telegram.png";
import Discord from "../img/Discord.png";
import "./index.css";
import "./list.css";
// import "./pagination";

const Board = () => {
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
              <Link to="/login">Create</Link>
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
        <div className="cate">
          <ul className="list">
            <li>HOT 플레이스</li>
            <li className="board">커뮤니티</li>
          </ul>
        </div>
        <div className="board-cate">
          <ul className="board-list">
            <li>자유</li>
            <li>Q&A</li>
            <li>맛집&이색카페</li>
            <li>여행 정보</li>
            <li>여행 동행</li>
          </ul>
        </div>
        <div className="board-main">
          <ul className="boardbox">
            <table
              summary="This table shows how to create responsive tables using Datatables' extended functionality"
              className="table table-bordered table-hover dt-responsive"
              id="board-table"
            >
              <thead className="board-head">
                <tr>
                  <th width="100px">번호</th>
                  <th>제목</th>
                  <th width="300px">글쓴이 </th>
                  <th width="100px">추천수</th>
                  <th width="150px">작성일</th>
                  <th width="100px">조회수</th>
                </tr>
              </thead>
              <tbody></tbody>
            </table>
          </ul>
        </div>

        <div className="_1-iJ">
          {/* <svg viewBox="0 0 16 16" className="_3XWQ">
            <path
              fill="none"
              stroke="currentColor"
              strokeWidth="1.5"
              d="M6.562 1.5c2.567 0 4.647 2.07 4.647 4.635 0 2.566-2.08 4.646-4.647 4.646s-4.647-2.08-4.647-4.646c0-2.566 2.08-4.635 4.647-4.635zM12.773 12.68L14.6 14.506"
            ></path>
          </svg> */}
          <input
            type="text"
            placeholder="Search"
            aria-label="Search"
            className="_3fLk"
          />
          <button type="submit" className="_2zEK">
            <svg viewBox="0 0 16 16" className="_3XWQ">
              <path
                fill="none"
                stroke="currentColor"
                strokeWidth="1.5"
                d="M13.51 13.51l-2.263-2.263"
              ></path>
            </svg>
          </button>
        </div>

        <div className="pagination">
          <ul></ul>
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

export default Board;
